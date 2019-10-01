package com.example.demo.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bauka on 01-Oct-19
 */
@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("readClient/{id}")
    public Client readClient(Long id) {
        return clientService.readClient(id);
    }

    @PostMapping("createClient")
    public String createClient(Client client) {
        return clientService.createClient(client);
    }

    @DeleteMapping("deleteClient")
    public String deleteClient(Long id) {
        return clientService.deleteClient(id);
    }

    @PostMapping("updateClient")
    public String updateClient(Client client){
        return clientService.updateClient(client);
    }
}
