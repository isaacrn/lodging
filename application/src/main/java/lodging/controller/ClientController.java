package lodging.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lodging.data.Client;
import lodging.data.request.AddClientRequest;
import lodging.persistence.ClientRepository;
import lodging.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    public ClientService clientService;

    @GetMapping("/all")
    public ResponseEntity<?> getClients() {
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }

    /*@GetMapping("/search-client/{cpf}")
    public ResponseEntity<?> getListClient(@PathVariable String cpf) {
        return new ResponseEntity<>(clientRepository.findCPF(cpf), HttpStatus.OK);
    }*/

    @PostMapping("/add-client")
    public ResponseEntity<?> addClient(@RequestBody AddClientRequest addClientRequest) {
        Client client = new Client(addClientRequest.getName(), addClientRequest.getCpf());
        return new ResponseEntity<>(clientRepository.save(client), HttpStatus.OK);
    }

    @PutMapping("/update-client/{id}")
    public ResponseEntity<?> updateClient(@PathVariable Long id, @RequestBody AddClientRequest addClientRequest){
        clientService.updateClient(id, addClientRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Client editClient(Client client, AddClientRequest addClientRequest) {
        client.setName(addClientRequest.getName());
        client.setCpf(addClientRequest.getCpf());
        return client;
    }
}
