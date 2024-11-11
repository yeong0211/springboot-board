package org.example.springbootboard.repository;

import org.example.springbootboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Article, Long> {
    
}
