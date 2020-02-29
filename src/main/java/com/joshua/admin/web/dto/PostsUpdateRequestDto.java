package com.joshua.admin.web.dto;

import com.joshua.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String titile;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String titile, String content) {
        this.titile = titile;
        this.content = content;
    }


}
