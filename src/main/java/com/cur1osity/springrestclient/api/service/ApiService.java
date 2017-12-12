package com.cur1osity.springrestclient.api.service;

import com.cur1osity.springrestclient.api.domain.CustomerDTO;


import java.util.List;

public interface ApiService {

    List<CustomerDTO> getAllCustomers();
}
