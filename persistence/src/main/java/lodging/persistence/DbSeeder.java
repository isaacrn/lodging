package lodging.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lodging.domain.Client;

@Component
public class DbSeeder implements CommandLineRunner {

    private ClientRepository clientRepository;

    public DbSeeder(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Client client1 = new Client(1,"teste1", "123456");
        Client client2 = new Client(2,"teste2", "789123");

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        this.clientRepository.save(clients);
    }


}
