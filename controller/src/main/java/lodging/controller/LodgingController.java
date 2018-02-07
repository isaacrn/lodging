package lodging.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lodging.domain.Client;
import lodging.persistence.ClientRepository;

@RestController
@RequestMapping("/clients")
public class LodgingController {

    private ClientRepository clientRepository;

    public LodgingController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/all")
    public List<Client> getClients() {
        List<Client> clients = this.clientRepository.findAll();
        return clients;
    }
}
