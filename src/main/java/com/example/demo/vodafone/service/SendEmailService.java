package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.PostareUtilizator;
import com.example.demo.vodafone.dao.Utilizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    UtilizatorService utilizatorService;
    @Autowired
    PostareUtilizatorService postareUtilizatorService;

    public void sendEmailToSubscribers(int idPostare) {
        utilizatorService.getAllUtilizator().stream().filter(Utilizator::isAbonare).forEach(utilizator -> {
            PostareUtilizator postareUtilizator = new PostareUtilizator();
            postareUtilizator.setIdPostare(idPostare);
            postareUtilizator.setIdUtilizator(utilizator.getId());
            postareUtilizatorService.saveOrUpdate(postareUtilizator);
        });
    }
}
