package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.Utilizator;
import com.example.demo.vodafone.service.PostareUtilizatorService;
import com.example.demo.vodafone.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilizatorController {
    @Autowired
    UtilizatorService utilizatorService;
    @Autowired
    PostareUtilizatorService postareUtilizatorService;

    @GetMapping("/utilizator")
    private List<Utilizator> getAllUtilizator() {
        return utilizatorService.getAllUtilizator();
    }

    @GetMapping("/utilizator/postare/{id_postare}")
    private List<Utilizator> getPostareByIdUtilizator(@PathVariable("id_postare") int idPostare) {
        return postareUtilizatorService.getUtilizatorByIdPostare(idPostare);
    }

    @PostMapping("/utilizator")
    private int saveUtilizator(@RequestBody Utilizator utilizator) {
        utilizatorService.saveOrUpdate(utilizator);

        return utilizator.getId();
    }

}
