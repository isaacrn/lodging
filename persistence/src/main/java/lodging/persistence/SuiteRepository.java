package lodging.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lodging.domain.Suite;

public interface SuiteRepository extends CrudRepository<Suite, Long>{

    List<Suite> findByNumberSuite(int numberSuite);
}
