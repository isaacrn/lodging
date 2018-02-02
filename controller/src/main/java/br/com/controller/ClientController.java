package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.integration.repository.ClientRepository;
import br.com.models.request.AddClientRequest;


@RestController(value="clients")
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<?> findAllClients() {
        return clientRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addClient(@RequestBody AddClientRequest addClientRequest) {

        Client client = new Client(addClientRequest.getName(), addClientRequest.getCpf(), addClientRequest.getSex(),
                addClientRequest.getBirthday());
        clientRepository.save(client);
    }
}