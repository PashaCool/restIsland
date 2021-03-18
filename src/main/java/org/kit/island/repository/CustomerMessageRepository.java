package org.kit.island.repository;

import org.kit.island.model.CustomerMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMessageRepository extends CrudRepository<CustomerMessage, String> {

}
