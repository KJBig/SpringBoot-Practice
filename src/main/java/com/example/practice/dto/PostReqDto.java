package com.example.practice.dto;

import lombok.Data;

@Data
public class PostReqDto {
    // Login을 구현하지 않았기 때문에 작성자Id를 RequestBody로 받음.
    private Long memberId;
    private String title;
    private String content;
}
