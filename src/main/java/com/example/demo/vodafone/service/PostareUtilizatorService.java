package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.PostareUtilizator;
import com.example.demo.vodafone.repository.PostareUtilizatorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostareUtilizatorService {


    private final PostareUtilizatorRepository postareUtilizatorRepository;

    public PostareUtilizatorService(PostareUtilizatorRepository postareUtilizatorRepository) {
        this.postareUtilizatorRepository = postareUtilizatorRepository;
    }


    public List<PostareUtilizator> getAllSubscription() {
        List<PostareUtilizator> postareUtilizators = new ArrayList<>();
        postareUtilizatorRepository.findAll().forEach(postareUtilizators::add);

        return postareUtilizators;
    }

    public void saveOrUpdate(PostareUtilizator postareUtilizator) {
        postareUtilizatorRepository.save(postareUtilizator);
    }
}
