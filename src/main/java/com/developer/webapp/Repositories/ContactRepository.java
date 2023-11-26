package com.developer.webapp.Repositories;

import com.developer.webapp.Entities.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact,Integer> {
}
