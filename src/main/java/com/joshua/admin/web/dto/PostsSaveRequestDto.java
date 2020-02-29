package com.joshua.admin.web.dto;

import com.joshua.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String titile;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String titile, String content, String author) {

        this.titile = titile;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(titile)
                .content(content)
                .author(author)
                .build();
    }
}
