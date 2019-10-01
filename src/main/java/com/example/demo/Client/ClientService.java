package com.example.demo.Client;

import com.example.demo.Driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bauka on 01-Oct-19
 */
@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client readClient(Long id) {
        return clientRepository.getOne(id);
    }

    public String createClient(Client client) {
        clientRepository.save(client);
        return "success";
    }

    public String updateClient(Client client) {
        clientRepository.save(client);
        return "success";
    }

    public String deleteClient(Long id) {
        clientRepository.deleteById(id);
        return "success";
    }
}
