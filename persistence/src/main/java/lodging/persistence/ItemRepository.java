package lodging.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lodging.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByNameItem(String nameItem);
}
