package com.example.tp2.service;

import com.example.tp2.model.client.Client;
import com.example.tp2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public List<Client> fetchAll() {

        return clientRepository.findAll();
    }
    public void save(Client client) {
        clientRepository.save(client);
    }

    public void deleteById(int id){
        clientRepository.deleteById(id);
    }
}
