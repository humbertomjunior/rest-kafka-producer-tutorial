package com.example.tutorialkafkarest.controller;

import com.example.tutorialkafkarest.domain.Order;
import com.example.tutorialkafkarest.service.EventRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final EventRegisterService service;

    @PostMapping("/save")
    public ResponseEntity<String> saveOrder(@RequestBody Order order) {

        service.addEvent("SaveOrder", order);

        return ResponseEntity.ok("Success");
    }

}
