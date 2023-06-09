package org.example;

import java.util.*;

public class Operations {


            //1. Find the most populated city of each continent:

    public Map<String, City> getMostPopulatedCityByContinent() {
        Map<String, City> mostPopulatedCities = new HashMap<>();

        for (Country country : countries) {
            for (City city : country.getCities()) {
                String continent = country.getContinent();
                City currentMostPopulatedCity = mostPopulatedCities.get(continent);

                if (currentMostPopulatedCity == null || city.getPopulation() > currentMostPopulatedCity.getPopulation()) {
                    mostPopulatedCities.put(continent, city);
                }
            }
        }

        return mostPopulatedCities;
    }


       // 2. Find the highest-populated capital city:

    public City getHighestPopulatedCapitalCity() {
        City highestPopulatedCapitalCity = null;

        for (Country country : countries) {
            if (country.getCapital() != 0) {
                City capitalCity = getCityById(country.getCapital());

                if (highestPopulatedCapitalCity == null || capitalCity.getPopulation() > highestPopulatedCapitalCity.getPopulation()) {
                    highestPopulatedCapitalCity = capitalCity;
                }
            }
        }

        return highestPopulatedCapitalCity;
    }


       // 3. Find the highest-populated capital city of each continent:

    public Map<String, City> getHighestPopulatedCapitalCityByContinent() {
        Map<String, City> highestPopulatedCapitalCities = new HashMap<>();

        for (Country country : countries) {
            if (country.getCapital() != 0) {
                City capitalCity = getCityById(country.getCapital());
                String continent = country.getContinent();
                City currentHighestPopulatedCapitalCity = highestPopulatedCapitalCities.get(continent);

                if (currentHighestPopulatedCapitalCity == null || capitalCity.getPopulation() > currentHighestPopulatedCapitalCity.getPopulation()) {
                    highestPopulatedCapitalCities.put(continent, capitalCity);
                }
            }
        }

        return highestPopulatedCapitalCities;
    }


       // 4. Sort the countries by the number of their cities in descending order:

    public List<Country> sortCountriesByCityCount() {
        List<Country> sortedCountries = new ArrayList<>(countries);

        sortedCountries.sort(Comparator.comparingInt(c -> c.getCities().size()));
        Collections.reverse(sortedCountries);

        return sortedCountries;
    }


     //   5. Sort the countries by their population densities in descending order ignoring zero-population countries:

    public List<Country> sortCountriesByPopulationDensity() {
        List<Country> sortedCountries = new ArrayList<>();

        for (Country country : countries) {
            if (country.getPopulation() > 0 && country.getSurfaceArea() > 0) {
                sortedCountries.add(country);
            }
        }

        sortedCountries.sort(Comparator.comparingDouble(c -> c.getPopulation() / c.getSurfaceArea()));
        Collections.reverse(sortedCountries);

        return sortedCountries;
    }
       // 6. Find the cities with the minimum and the maximum population in countries:

    public City getCityWithMinPopulation() {
        City cityWithMinPopulation = null;

        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (cityWithMinPopulation == null || city.getPopulation() < cityWithMinPopulation.getPopulation()) {
                    cityWithMinPopulation = city;
                }
            }


        }

        return cityWithMinPopulation;
    }

    public City getCityWithMaxPopulation() {
        City cityWithMaxPopulation = null;

        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (cityWithMaxPopulation == null || city.getPopulation() > cityWithMaxPopulation.getPopulation()) {
                    cityWithMaxPopulation = city;
                }
            }
        }

        return cityWithMaxPopulation;
    }

    public List<Country> sortCountriesByPopulationDensityIgnoringZeroPopulation() {
        List<Country> sortedCountries = new ArrayList<>();

        for (Country country : countries) {
            if (country.getPopulation() > 0 && country.getSurfaceArea() > 0) {
                sortedCountries.add(country);
            }
        }

        sortedCountries.sort(Comparator.comparingDouble(c -> c.getPopulation() / c.getSurfaceArea()));
        Collections.reverse(sortedCountries);

        return sortedCountries;
    }

    //    8. Find the richest country of each continent with respect to their GNP values:

    public Map<String, Country> getRichestCountryByContinent() {
        Map<String, Country> richestCountries = new HashMap<>();

        for (Country country : countries) {
            String continent = country.getContinent();
            Country currentRichestCountry = richestCountries.get(continent);

            if (currentRichestCountry == null || country.getGnp() > currentRichestCountry.getGnp()) {
                richestCountries.put(continent, country);
            }
        }

        return richestCountries;
    }


      //  9. Find the minimum, the maximum, and the average population of world countries:

    public int getMinPopulation() {
        int minPopulation = Integer.MAX_VALUE;

        for (Country country : countries) {
            if (country.getPopulation() < minPopulation) {
                minPopulation = country.getPopulation();
            }
        }

        return minPopulation;
    }

    public int getMaxPopulation() {
        int maxPopulation = 0;

        for (Country country : countries) {
            if (country.getPopulation() > maxPopulation) {
                maxPopulation = country.getPopulation();
            }
        }

        return maxPopulation;
    }

    public double getAveragePopulation() {
        int totalPopulation = 0;

        for (Country country : countries) {
            totalPopulation += country.getPopulation();
        }

        return (double) totalPopulation / countries.size();
    }

      //  10. Find the minimum, the maximum, and the average population of each continent:

    public Map<String, Integer> getMinPopulationByContinent() {
        Map<String, Integer> minPopulations = new HashMap<>();

        for (Country country : countries) {
            String continent = country.getContinent();
            int currentMinPopulation = minPopulations.getOrDefault(continent, Integer.MAX_VALUE);

            if (country.getPopulation() < currentMinPopulation) {
                minPopulations.put(continent, country.getPopulation());
            }
        }

        return minPopulations;
    }

    public Map<String, Integer> getMaxPopulationByContinent() {
        Map<String, Integer> maxPopulations = new HashMap<>();

        for (Country country : countries) {
            String continent = country.getContinent();
            int currentMaxPopulation = maxPopulations.getOrDefault(continent, 0);

            if (country.getPopulation() > currentMaxPopulation) {
                maxPopulations.put(continent, country.getPopulation());
            }
        }

        return maxPopulations;
    }


    public Map<String, Double> getAveragePopulationByContinent() {
        Map<String, Double> averagePopulations = new HashMap<>();

        Map<String, Integer> continentCounts = new HashMap<>();
        for (Country country : countries) {
            String continent = country.getContinent();
            int currentCount = continentCounts.getOrDefault(continent, 0);
            continentCounts.put(continent, currentCount + 1);
        }

        for (Country country : countries) {
            String continent = country.getContinent();
            int totalPopulation = averagePopulations.getOrDefault(continent, 0);
            int count = continentCounts.get(continent);
            averagePopulations.put(continent, (double) (totalPopulation + country.getPopulation()) / count);
        }

        return averagePopulations;
    }
//11.Find the countries with the minimum and the maximum population:

    public Country getCountryWithMinPopulation() {
        Country countryWithMinPopulation = null;

        for (Country country : countries) {
            if (countryWithMinPopulation == null || country.getPopulation() < countryWithMinPopulation.getPopulation()) {
                countryWithMinPopulation = country;
            }
        }

        return countryWithMinPopulation;
    }

    public Country getCountryWithMaxPopulation() {
        Country countryWithMaxPopulation = null;

        for (Country country : countries) {
            if (countryWithMaxPopulation == null || country.getPopulation() > countryWithMaxPopulation.getPopulation()) {
                countryWithMaxPopulation = country;
            }
        }

        return countryWithMaxPopulation;
    }


    //12

    public Map<String, Country> getCountriesWithMinPopulationByContinent() {
        Map<String, Country> countriesWithMinPopulation = new HashMap<>();

        for (Country country : countries) {
            String continent = country.getContinent();
            Country currentCountry = countriesWithMinPopulation.get(continent);

            if (currentCountry == null || country.getPopulation() < currentCountry.getPopulation()) {
                countriesWithMinPopulation.put(continent, country);
            }
        }

        return countriesWithMinPopulation;
    }

    public Map<String, Country> getCountriesWithMaxPopulationByContinent() {
        Map<String, Country> countriesWithMaxPopulation = new HashMap<>();

        for (Country country : countries) {
            String continent = country.getContinent();
            Country currentCountry = countriesWithMaxPopulation.get(continent);

            if (currentCountry == null || country.getPopulation() > currentCountry.getPopulation()) {
                countriesWithMaxPopulation.put(continent, country);
            }
        }

        return countriesWithMaxPopulation;
    }
//13
public Map<String, List<Country>> groupAndSortCountriesByCityCount() {
    Map<String, List<Country>> groupedCountries = new HashMap<>();

    for (Country country : countries) {
        String continent = country.getContinent();
        List<Country> continentCountries = groupedCountries.getOrDefault(continent, new ArrayList<>());
        continentCountries.add(country);
        groupedCountries.put(continent, continentCountries);
    }

    for (List<Country> continentCountries : groupedCountries.values()) {
        continentCountries.sort(Comparator.comparingInt(c -> c.getCities().size()));
    }

    return groupedCountries;
}

//14

    public City getCityWithMinPopulationInCountries() {
        City cityWithMinPopulation = null;

        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (cityWithMinPopulation == null || city.getPopulation() < cityWithMinPopulation.getPopulation()) {
                    cityWithMinPopulation = city;
                }
            }
        }

        return cityWithMinPopulation;
    }

    public City getCityWithMaxPopulationInCountries() {
        City cityWithMaxPopulation = null;

        for (Country country : countries) {
            for (City city : country.getCities()) {
                if (cityWithMaxPopulation == null || city.getPopulation() > cityWithMaxPopulation.getPopulation()) {
                    cityWithMaxPopulation = city;
                }
            }
        }

        return cityWithMaxPopulation;
    }

    //15
    public double getMinGNP() {
        double minGNP = Double.MAX_VALUE;

        for (Country country : countries) {
            if (country.getGnp() < minGNP) {
                minGNP = country.getGnp();
            }
        }

        return minGNP;
    }

    public double getMaxGNP() {
        double maxGNP = 0;

        for (Country country : countries) {
            if (country.getGnp() > maxGNP) {
                maxGNP = country.getGnp();
            }
        }

        return maxGNP;
    }

    public double getAverageGNP() {
        double totalGNP = 0;

        for (Country country : countries) {
            totalGNP += country.getGnp();
        }

        return totalGNP / countries.size();
    }

    public double getStandardDeviationGNP() {
        double averageGNP = getAverageGNP();
        double sumSquaredDeviations = 0;

        for (Country country : countries) {
            double deviation = country.getGnp() - averageGNP;
            sumSquaredDeviations += deviation * deviation;
        }

        return Math.sqrt(sumSquaredDeviations / countries.size());
    }


}
