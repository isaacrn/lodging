package lodging.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lodging.data.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
