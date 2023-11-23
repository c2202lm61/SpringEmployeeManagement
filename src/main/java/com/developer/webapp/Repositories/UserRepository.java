package com.developer.webapp.Repositories;

import com.developer.webapp.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
