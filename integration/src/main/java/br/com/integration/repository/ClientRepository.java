package br.com.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.models.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
