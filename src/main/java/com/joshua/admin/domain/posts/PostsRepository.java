package com.joshua.admin.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //JpaRepository<Entity클래스, PK타입>
}
