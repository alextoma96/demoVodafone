package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Subscription;
import com.example.demo.vodafone.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriptionService {
    
    
    final SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }


    public List<Subscription> getAllSubscription()
    {
        List<Subscription> subscriptions = new ArrayList<Subscription>();
        subscriptionRepository.findAll().forEach(postare -> subscriptions.add(postare));

        return subscriptions;
    }
    public void saveOrUpdate(Subscription subscription)
    {
        subscriptionRepository.save(subscription);
    }
}
