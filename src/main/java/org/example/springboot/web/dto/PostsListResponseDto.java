package org.example.springboot.web.dto;

import lombok.Getter;
import org.example.springboot.domain.posts.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String author;
    private String title;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id= entity.getId();
        this.author= entity.getAuthor();
        this.title= entity.getTitle();
        this.modifiedDate= entity.getModifiedDate();
    }
}
