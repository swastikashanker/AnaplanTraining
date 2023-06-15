package com.application.gloelectronics;

import com.application.gloelectronics.dao.CustomerDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    private CustomerDaoImpl customerDao;

    @Test
    void getCustomers(){
        assertEquals("hello",customerDao.getCustomers());
    }

}
