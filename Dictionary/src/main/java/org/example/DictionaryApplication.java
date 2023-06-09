package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DictionaryApplication {
            private static final String DICTIONARY_FILE = "/home/swastika.shanker/Desktop/anaplanTraining/Dict.txt";

            public static void main(String[] args) {
                // Load dictionary words from file
                List<String> dictionary = loadDictionary();

                // Print menu options
                printMenuOptions();

                // Read user's choice from command line
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        findWordsStartingWithAtoM(dictionary);
                        break;
                    case 2:
                        findWordsStartingWithNAtEnd(dictionary);
                        break;
                    case 3:
                        groupWordsByFirstThreeLetters(dictionary);
                        break;
                    case 4:
                        findPalindromes(dictionary);
                        break;
                    case 5:
                        countVowelsInWords(dictionary);
                        break;
                    case 6:
                        findWordsStartingWithAAndEndingWithZ(dictionary);
                        break;
                    case 7:
                        findLongestWord(dictionary);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

            private static List<String> loadDictionary() {
                try {
                    Path path = Paths.get(DICTIONARY_FILE);
                    return Files.lines(path).collect(Collectors.toList());
                } catch (IOException e) {
                    System.err.println("Error loading dictionary file: " + e.getMessage());
                    return Collections.emptyList();
                }
            }

            private static void printMenuOptions() {
                System.out.println("Dictionary Application Menu:");
                System.out.println("1. Find words starting with letters a to m");
                System.out.println("2. Find words starting with the letter n at the end of the dictionary");
                System.out.println("3. Group words by their first three letters");
                System.out.println("4. Find palindromes in the dictionary");
                System.out.println("5. Count vowels used in words");
                System.out.println("6. Find words starting with the letter a and ending with the letter z");
                System.out.println("7. Find the longest word in the dictionary");
                System.out.print("Enter your choice: ");
            }

            private static void findWordsStartingWithAtoM(List<String> dictionary) {
                dictionary.stream()
                        .filter(word -> word.matches("[a-mA-M]\\w*"))
                        .forEach(System.out::println);
            }

            private static void findWordsStartingWithNAtEnd(List<String> dictionary) {
                dictionary.stream()
                        .filter(word -> word.matches(".*n$"))
                        .forEach(System.out::println);
            }

            private static void groupWordsByFirstThreeLetters(List<String> dictionary) {
                Map<String, List<String>> groupedWords = dictionary.stream()
                        .collect(Collectors.groupingBy(word -> word.substring(0, Math.min(3, word.length()))));

                groupedWords.forEach((key, value) -> {
                    System.out.println(key + ":");
                    System.out.println(value);
                    System.out.println();
                });
            }

            private static void findPalindromes(List<String> dictionary) {
                dictionary.stream()
                        .filter(word -> {
                            String reversed = new StringBuilder(word).reverse().toString();
                            return word.equalsIgnoreCase(reversed);
                        })
                        .forEach(System.out::println);
            }

            private static void countVowelsInWords(List<String> dictionary) {
                dictionary.stream()
                        .mapToInt(word -> (int) word.chars()
                                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                                .count())
                        .forEach(System.out::println);
            }

            private static void findWordsStartingWithAAndEndingWithZ(List<String> dictionary) {
                dictionary.stream()
                        .filter(word -> word.matches("^a.*z$"))
                        .forEach(System.out::println);
            }

            private static void findLongestWord(List<String> dictionary) {
                Optional<String> longestWord = dictionary.stream()
                        .max(Comparator.comparingInt(String::length));

                longestWord.ifPresent(System.out::println);
            }
        }



