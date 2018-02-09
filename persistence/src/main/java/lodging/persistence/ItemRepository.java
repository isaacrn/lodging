package lodging.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import lodging.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{
}
