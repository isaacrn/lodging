package lodging.persistence;

import org.springframework.data.repository.CrudRepository;

import lodging.data.Reserve;

public interface ReserveRepository extends CrudRepository<Reserve, Long>{
}
