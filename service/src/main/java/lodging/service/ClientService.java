package lodging.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lodging.data.Client;
import lodging.persistence.ClientRepository;

@Component
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client updateClient() {
        return null;
    }
}
