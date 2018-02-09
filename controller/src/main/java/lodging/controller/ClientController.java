package lodging.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lodging.domain.Client;
import lodging.model.request.AddClientRequest;
import lodging.persistence.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/allClient")
    public List<Client> getClients() {
        return this.clientRepository.findAll();
    }

    @PostMapping("/addClient")
    public void addClient(@RequestBody AddClientRequest addClientRequest) {
        Client client = new Client(addClientRequest.getName(), addClientRequest.getCpf());
        clientRepository.insert(client);
    }

    @PutMapping("/updateClient/{id}")
    public void updateClient(@PathVariable String id, @RequestBody AddClientRequest addClientRequest){
        Client client = clientRepository.findOne(id);
        clientRepository.save(editClient(client, addClientRequest));
    }

    private Client editClient(Client client, AddClientRequest addClientRequest) {
        client.setName(addClientRequest.getName());
        client.setCpf(addClientRequest.getCpf());
        return client;
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id") String id) {
        this.clientRepository.delete(id);
    }

}
