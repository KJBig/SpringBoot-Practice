package com.example.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@Builder
public class MemberResDto {
    private Long id;
    private String name;
    private String email;
    private Integer age;


    //TODO: Builder를 사용하여 of()를 만들어보세요.
    /*
    public static MemberResDto of(){
        return MemberResDto.builder().build();
    }
     */
}
