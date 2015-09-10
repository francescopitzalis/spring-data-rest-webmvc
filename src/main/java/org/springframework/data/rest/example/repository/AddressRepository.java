package org.springframework.data.rest.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.example.model.Address;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
