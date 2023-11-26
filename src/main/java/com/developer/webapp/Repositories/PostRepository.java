package com.developer.webapp.Repositories;

import com.developer.webapp.Entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
