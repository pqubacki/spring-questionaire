package com.solera.questionaire.controller;

import com.solera.questionaire.model.Client;
import com.solera.questionaire.service.ClientService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClient(@PathParam("id") Long id) {
        return getClient(id);
    }

    @PostMapping("/clients")
    public void createClient(@RequestBody Client client) {
        clientService.addClient(client);
    }
}
