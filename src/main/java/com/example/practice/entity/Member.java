package com.example.practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
//@Builder
@Table(name = "Member")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Integer age;

    public Member(String name, String email, String password, Integer age){
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }


    //TODO: Builder를 사용하여 toEntity()를 만들어보세요.
    /*
    public static Member toEntity(){
        return Member.builder().build();
    }
     */


}
