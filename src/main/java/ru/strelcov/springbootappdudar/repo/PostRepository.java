package ru.strelcov.springbootappdudar.repo;

import org.springframework.data.repository.CrudRepository;
import ru.strelcov.springbootappdudar.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
