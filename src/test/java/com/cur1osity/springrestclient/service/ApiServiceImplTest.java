package com.cur1osity.springrestclient.service;

import com.cur1osity.springrestclient.api.domain.Customer;
import com.cur1osity.springrestclient.api.domain.CustomerDTO;
import com.cur1osity.springrestclient.api.service.ApiService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void testGetCustomers() throws Exception {

        List<CustomerDTO> customers = apiService.getAllCustomers();

        for (CustomerDTO customer : customers){
            System.out.println(customer);
        }

        assertEquals(3, customers.size());
    }
}