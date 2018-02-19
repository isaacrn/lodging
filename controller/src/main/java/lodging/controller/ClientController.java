package lodging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/allClient")
    public ResponseEntity<?> getClients() {
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addClient")
    public ResponseEntity<?> addClient(@RequestBody AddClientRequest addClientRequest) {
        Client client = new Client(addClientRequest.getName(), addClientRequest.getCpf());
        return new ResponseEntity<>(clientRepository.save(client), HttpStatus.OK);
    }

    @PutMapping("/updateClient/{id}")
    public ResponseEntity<?> updateClient(@PathVariable Long id, @RequestBody AddClientRequest addClientRequest){
        Client client = clientRepository.findOne(id);
        return new ResponseEntity<>(clientRepository.save(editClient(client, addClientRequest)), HttpStatus.OK);
    }

    private Client editClient(Client client, AddClientRequest addClientRequest) {
        client.setName(addClientRequest.getName());
        client.setCpf(addClientRequest.getCpf());
        return client;
    }

    @DeleteMapping("/deleteClient/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") Long id) {
        clientRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
