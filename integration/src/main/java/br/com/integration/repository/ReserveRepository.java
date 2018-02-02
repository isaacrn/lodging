package br.com.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.models.entity.Reserve;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Long> {
}
