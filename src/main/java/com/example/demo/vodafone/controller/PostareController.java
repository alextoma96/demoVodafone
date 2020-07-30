package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.Postare;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vodafone.service.PostareService;

import java.util.List;
import java.util.Optional;

@RestController
@Component
public class PostareController
{
	@Autowired
	PostareService postareService;

	@GetMapping("/postare")
	private List<Postare> getAllPostare()
	{
		return postareService.getAllPostare();
	} 
	
	@DeleteMapping("/postare/{id}")
	private void deletePostare(@PathVariable("id") int id)
	{
		postareService.delete(id);
	}
	
	@PostMapping("/postare")
	private int savePostare(@RequestBody
		Postare postare)
	{
		postareService.saveOrUpdate(postare);

		return postare.getId();
	}
	@GetMapping("/postare/{id}")
    private Optional<Postare> getPostareById(@PathVariable("id") int id){
	   return postareService.getPostareById(id);
    }
    
}
