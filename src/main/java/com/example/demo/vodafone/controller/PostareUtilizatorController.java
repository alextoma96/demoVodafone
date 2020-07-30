package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.PostareUtilizator;
import com.example.demo.vodafone.service.PostareUtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostareUtilizatorController {
    @Autowired
    PostareUtilizatorService postareUtilizatorService;

    @GetMapping("/postare_utilizator")
    private List<PostareUtilizator> getAllPostare() {
        return postareUtilizatorService.getAllPostareUtilizator();
    }
}
