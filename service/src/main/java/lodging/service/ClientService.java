package lodging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lodging.data.Client;
import lodging.data.request.AddClientRequest;
import lodging.persistence.ClientRepository;

@Component
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client updateClient(Long id, AddClientRequest addClientRequest) {
        Client client = clientRepository.findOne(id);
        return clientRepository.save(editClient(client, addClientRequest));
    }

    private Client editClient(Client client, AddClientRequest addClientRequest) {
        client.setName(addClientRequest.getName());
        client.setCpf(addClientRequest.getCpf());
        return client;
    }
}
