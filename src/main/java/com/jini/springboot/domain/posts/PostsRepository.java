package com.jini.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// DB 접근 역할
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
