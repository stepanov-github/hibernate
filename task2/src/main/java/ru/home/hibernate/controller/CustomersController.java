package ru.home.hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.home.hibernate.entity.Orders;
import ru.home.hibernate.service.Service;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomersController {
    private Service service;


    @GetMapping("/products/fetch-product")
    public List<Orders> getProductName(@RequestParam(value = "name", required = false) String name) {
        return service.getProductName(name);
    }
}
