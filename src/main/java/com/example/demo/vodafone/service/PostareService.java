package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Postare;
import com.example.demo.vodafone.dao.Utilizator;
import com.example.demo.vodafone.repository.PostareRepository;
import com.example.demo.vodafone.repository.UtilizatorRepository;
import com.example.demo.vodafone.dao.Subscription;
import com.example.demo.vodafone.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PostareService
{
    private final PostareRepository postareRepository;
    private final UtilizatorRepository utilizatorRepository;
    private final SubscriptionRepository subscriptionRepository;

    public PostareService(PostareRepository postareRepository, UtilizatorRepository utilizatorRepository, SubscriptionRepository subscriptionRepository) {
        this.postareRepository = postareRepository;
        this.utilizatorRepository = utilizatorRepository;
        this.subscriptionRepository = subscriptionRepository;
    }


    public List<Postare> getAllPostare()
	{
		List<Postare> postari = new ArrayList<Postare>();
		postareRepository.findAll().forEach(postari::add);

		return postari;
	}

	public Optional<Postare> getPostareById(int id)
	{
		return postareRepository.findById(id);
	}

	public void saveOrUpdate(Postare postare)
	{
        List<Utilizator> utilizatori = (List<Utilizator>) utilizatorRepository.findAll();
        
        List<Subscription> subscriptions =new ArrayList<Subscription>();
	    postareRepository.save(postare);
        for(Utilizator utilizator: utilizatori){
            if (utilizator.isAbonare()){
                Subscription subscription = new Subscription();
                subscription.setId_postare(postare.getId());
                subscription.setId_utilizator(utilizator.getId());
                subscriptions.add(subscription);
            }
        }
        subscriptionRepository.saveAll(subscriptions);
	}

	public void delete(int id)
	{
		postareRepository.deleteById(id);
	}
}
