package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.Postare;
import com.example.demo.vodafone.service.PostareService;
import com.example.demo.vodafone.service.PostareUtilizatorService;
import com.example.demo.vodafone.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostareController {
    @Autowired
    PostareService postareService;
    @Autowired
    SendEmailService sendEmailService;
    @Autowired
    PostareUtilizatorService postareUtilizatorService;

    @GetMapping("/postare")
    private List<Postare> getAllPostare() {
        return postareService.getAllPostare();
    }

    @DeleteMapping("/postare/{id}")
    private void deletePostare(@PathVariable("id") int id) {
        postareService.delete(id);
    }

    @PostMapping("/postare")
    private int savePostare(@RequestBody
                                    Postare postare) {
        postareService.saveOrUpdate(postare);
        sendEmailService.sendEmailToSubscribers(postare.getId());

        return postare.getId();
    }

    @GetMapping("/postare/{id}")
    private Postare getPostareById(@PathVariable("id") int id) {
        return postareService.getPostareById(id).orElse(null);
    }

    @GetMapping("/postare/utilizator/{id_utilizator}")
    private List<Postare> getPostareByIdUtilizator(@PathVariable("id_utilizator") int idUtilizator) {
        return postareUtilizatorService.getPostareByIdUtilizator(idUtilizator);
    }

}
