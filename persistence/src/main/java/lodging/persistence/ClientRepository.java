package lodging.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import lodging.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
