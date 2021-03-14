package com.jini.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
// Entity 클래스는 절대 Setter 메소드 만들지 않음
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // spring 2.0 부터 추가해야 auto_increment 적용
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
