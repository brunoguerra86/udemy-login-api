package br.com.bg8.loginapi.repository;

import br.com.bg8.loginapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
