package com.springdemo.springexercises.repository;

import com.springdemo.springexercises.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
