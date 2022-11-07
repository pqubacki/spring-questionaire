package com.solera.questionaire.service;

import com.solera.questionaire.model.Client;
import com.solera.questionaire.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        Optional<Client> found = clientRepository.findById(id);
        if (found.isPresent()) {
            return found.get();
        } else {
            throw new NoSuchElementException("Client " + id + "not found.");
        }
    }
    public void addClient(Client client) {
        clientRepository.save(client);
    }
}
