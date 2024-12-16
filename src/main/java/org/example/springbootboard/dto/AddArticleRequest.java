package org.example.springbootboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootboard.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private long groupId;
    private int groupOrder;
    private int groupLayer;
    private String title;
    private String content;
    private String writer;
    private String createDate;

    // 생성자를 통해 객체 생성
    public Article toEntity(){
        return Article.builder()
                .groupId(groupId)
                .groupOrder(groupOrder)
                .groupLayer(groupLayer)
                .title(title)
                .content(content)
                .writer(writer)
                .createDate(createDate)
                .build();
    }
}
