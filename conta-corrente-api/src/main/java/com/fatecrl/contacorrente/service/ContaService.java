package com.fatecrl.contacorrente.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatecrl.contacorrente.model.Conta;
import com.fatecrl.contacorrente.repository.ContaRepository;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public ContaService(){

    }

    public List<Conta> findAll(){
        return contaRepository.findAll();
    }

    public Optional<Conta> find(Long id){
        return contaRepository.findById(id.longValue());
    }

    public List<Conta> findByTitular(String titular){
        return null;
    }

    public void create(Conta conta){
        contaRepository.save(conta);
    }

    public Boolean delete(Long id){
        if (contaRepository.existsById(id)){
            contaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Boolean update(Conta conta){
        if (contaRepository.existsById(conta.getId())){
            contaRepository.save(conta);
            return true;
        }
        
        return false;
    }
}
