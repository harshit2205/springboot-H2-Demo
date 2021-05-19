package com.example.h2demo.service;

import com.example.h2demo.entity.Billionaires;
import com.example.h2demo.repository.BilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BilService {

    @Autowired
    BilRepo repo;

    public Billionaires get(Integer id){
        Optional<Billionaires> billionaires = repo.findById(id);
        return billionaires.orElse(new Billionaires(0,"","", ""));
    }

    public Billionaires post(Billionaires billionaires){
        return repo.save(billionaires);
    }
}
