package com.andylilfs.portfolioblog.repositories;

import com.andylilfs.portfolioblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {}
