package com.test.diego.insfrastructure.persistence.repository;

import com.test.diego.insfrastructure.persistence.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClientJpaRepository extends CrudRepository<Client,String> {
    Optional<Client> findByIdentificationCardAndIdentificationType(String identificationCard, String identificationType);
}
