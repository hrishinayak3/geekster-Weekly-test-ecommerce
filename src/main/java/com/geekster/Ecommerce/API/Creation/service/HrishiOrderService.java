package com.geekster.Ecommerce.API.Creation.service;

import com.geekster.Ecommerce.API.Creation.model.HrishiOrder;
import com.geekster.Ecommerce.API.Creation.repo.HrishiOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class HrishiOrderService {

    @Autowired
    HrishiOrderRepo HrishiOrderRepo;

    public HrishiOrder createOrder(HrishiOrder order) {
        return HrishiOrderRepo.save(order);
    }

    public HrishiOrder getOrderById(Integer orderId) {
        return HrishiOrderRepo.findById(orderId).orElseThrow(() ->
                new NoSuchElementException("Order not found"));
    }
}
