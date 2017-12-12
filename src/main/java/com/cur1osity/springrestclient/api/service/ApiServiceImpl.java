package com.cur1osity.springrestclient.api.service;

import com.cur1osity.springrestclient.api.domain.CustomerDTO;
import com.cur1osity.springrestclient.api.domain.CustomerListDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class ApiServiceImpl implements  ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        CustomerListDTO customerListDTO = restTemplate.getForObject("http://localhost:8080/api/v1/customers/", CustomerListDTO.class);
        return customerListDTO.getCustomers();
    }
}

