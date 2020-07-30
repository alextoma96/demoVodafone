package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Utilizator;
import com.example.demo.vodafone.repository.UtilizatorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilizatorService {

    private final UtilizatorRepository utilizatorRepository;

    public UtilizatorService(UtilizatorRepository utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public List<Utilizator> getAllUtilizator() {
        List<Utilizator> utilizatori = new ArrayList<Utilizator>();
        utilizatorRepository.findAll().forEach(utilizatori::add);

        return utilizatori;
    }

    public void saveOrUpdate(Utilizator utilizator) {

        utilizatorRepository.save(utilizator);
    }
}
