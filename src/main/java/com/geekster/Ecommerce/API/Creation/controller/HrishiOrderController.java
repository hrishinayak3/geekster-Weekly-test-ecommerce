package com.geekster.Ecommerce.API.Creation.controller;

import com.geekster.Ecommerce.API.Creation.model.HrishiOrder;
import com.geekster.Ecommerce.API.Creation.service.HrishiOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class HrishiOrderController {

    @Autowired
    HrishiOrderService HrishiOrderService;

    @PostMapping
    public HrishiOrder createOrder(@RequestBody HrishiOrder order) {
        return HrishiOrderService.createOrder(order);
    }

    @GetMapping("/{orderId}")
    public HrishiOrder getOrderById(@PathVariable Integer orderId){
        return HrishiOrderService.getOrderById(orderId);
    }
}
