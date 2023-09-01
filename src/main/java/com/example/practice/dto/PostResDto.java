package com.example.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@Builder
public class PostResDto {
    private Long id;
    private MemberResDto member;
    private String title;
    private String content;


    //TODO: Builder를 사용하여 of()를 만들어보세요.
    /*
    public static PostResDto of(){
        return PostResDto.builder().build();
    }
     */
}
