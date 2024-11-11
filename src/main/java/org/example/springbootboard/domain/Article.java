package org.example.springbootboard.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "group_id", nullable = false)
    private Long groupId;

    @Column(name = "group_order", nullable = false)
    private int groupOrder;

    @Column(name = "group_layer", nullable = false)
    private int groupLayer;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "create_date", nullable = false)
    private String createDate;

    // 빌더 패턴을 통해 객체 생성
    @Builder
    public Article(Long groupId, int groupOrder, int groupLayer, String title, String content, String writer, String createDate){
        this.groupId = groupId;
        this.groupLayer = groupLayer;
        this.groupOrder = groupOrder;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createDate = createDate;
    }
}
