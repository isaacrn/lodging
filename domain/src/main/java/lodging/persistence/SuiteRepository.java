package lodging.persistence;

import org.springframework.data.repository.CrudRepository;

import lodging.data.Suite;

public interface SuiteRepository extends CrudRepository<Suite, Long> {
}
