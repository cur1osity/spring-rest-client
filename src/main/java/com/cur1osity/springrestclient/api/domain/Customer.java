package com.cur1osity.springrestclient.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {

    private Long id;
    private String firstname;
    private String lastname;
}

