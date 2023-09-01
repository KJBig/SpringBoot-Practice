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
@Table(name = "Post")
public class Post {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    private String title;
    private String content;

    public Post(Member member, String title, String content){
        this.member = member;
        this.title = title;
        this.content = content;
    }


    //TODO: Builder를 사용하여 toEntity()를 만들어보세요.
    /*
    public static Post toEntity(){
        return Post.builder().build();
    }
     */


}
