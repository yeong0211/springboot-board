package org.example.springbootboard.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootboard.domain.Article;
import org.example.springbootboard.dto.AddArticleRequest;
import org.example.springbootboard.repository.BoardRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public Article save(AddArticleRequest request){
        return boardRepository.save(request.toEntity());
    }
}
