package org.springframework.data.rest.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.example.model.Profile;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
