package ru.home.hibernate.service;

import lombok.AllArgsConstructor;
import ru.home.hibernate.entity.Orders;
import ru.home.hibernate.repositiry.CustomersRepository;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private CustomersRepository repository;

    public List<Orders> getProductName(String name) {
        return repository.getProductName(name);
    }
}
