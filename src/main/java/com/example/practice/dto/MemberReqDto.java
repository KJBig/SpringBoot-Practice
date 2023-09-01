package com.example.practice.dto;

import lombok.Data;

@Data
public class MemberReqDto {
    private String name;
    private String email;
    private String password;
    private Integer age;
}
