package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Postare;
import com.example.demo.vodafone.dao.PostareUtilizator;
import com.example.demo.vodafone.dao.Utilizator;
import com.example.demo.vodafone.repository.PostareRepository;
import com.example.demo.vodafone.repository.PostareUtilizatorRepository;
import com.example.demo.vodafone.repository.UtilizatorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostareUtilizatorService {


    private final PostareUtilizatorRepository postareUtilizatorRepository;
    private final UtilizatorRepository utilizatorRepository;
    private final PostareRepository postareRepository;

    public PostareUtilizatorService(PostareUtilizatorRepository postareUtilizatorRepository, UtilizatorRepository utilizatorRepository, PostareRepository postareRepository) {
        this.postareUtilizatorRepository = postareUtilizatorRepository;
        this.utilizatorRepository = utilizatorRepository;
        this.postareRepository = postareRepository;
    }


    public List<PostareUtilizator> getAllPostareUtilizator() {
        List<PostareUtilizator> postareUtilizators = new ArrayList<>();
        postareUtilizatorRepository.findAll().forEach(postareUtilizators::add);

        return postareUtilizators;
    }

    public void saveOrUpdate(PostareUtilizator postareUtilizator) {
        postareUtilizatorRepository.save(postareUtilizator);
    }

    public List<Postare> getPostareByIdUtilizator(int idUtilizator) {
        return getAllPostareUtilizator().stream().filter(postareUtilizator -> postareUtilizator.getIdUtilizator() == idUtilizator)
                .map(postareUtilizator -> postareRepository.findById(postareUtilizator.getIdPostare()).orElse(null))
                .collect(Collectors.toList());
    }

    public List<Utilizator> getUtilizatorByIdPostare(int idPostare) {
        return getAllPostareUtilizator().stream().filter(postareUtilizator -> postareUtilizator.getIdPostare() == idPostare)
                .map(postareUtilizator -> utilizatorRepository.findById(postareUtilizator.getIdUtilizator()).orElse(null))
                .collect(Collectors.toList());
    }
}
