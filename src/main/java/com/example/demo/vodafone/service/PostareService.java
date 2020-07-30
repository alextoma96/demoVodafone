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
import java.util.Optional;


@Service
public class PostareService {
    private final PostareRepository postareRepository;
    private final UtilizatorRepository utilizatorRepository;
    private final PostareUtilizatorRepository postareUtilizatorRepository;

    public PostareService(PostareRepository postareRepository, UtilizatorRepository utilizatorRepository, PostareUtilizatorRepository postareUtilizatorRepository) {
        this.postareRepository = postareRepository;
        this.utilizatorRepository = utilizatorRepository;
        this.postareUtilizatorRepository = postareUtilizatorRepository;
    }


    public List<Postare> getAllPostare() {
        List<Postare> postari = new ArrayList<Postare>();
        postareRepository.findAll().forEach(postari::add);

        return postari;
    }

    public Optional<Postare> getPostareById(int id) {
        return postareRepository.findById(id);
    }

    public void saveOrUpdate(Postare postare) {
        List<Utilizator> utilizatori = (List<Utilizator>) utilizatorRepository.findAll();

        List<PostareUtilizator> postareUtilizators = new ArrayList<PostareUtilizator>();
        postareRepository.save(postare);
        for (Utilizator utilizator : utilizatori) {
            if (utilizator.isAbonare()) {
                PostareUtilizator postareUtilizator = new PostareUtilizator();
                postareUtilizator.setIdPostare(postare.getId());
                postareUtilizator.setIdUtilizator(utilizator.getId());
                postareUtilizators.add(postareUtilizator);
            }
        }
        postareUtilizatorRepository.saveAll(postareUtilizators);
    }

    public void delete(int id) {
        postareRepository.deleteById(id);
    }
}
