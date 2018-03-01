package lodging.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lodging.data.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
