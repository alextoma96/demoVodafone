package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.Subscription;
import com.example.demo.vodafone.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriptionController {
    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping("/subscription")
    private List<Subscription> getAllPostare() {
        return subscriptionService.getAllSubscription();
    }
}
