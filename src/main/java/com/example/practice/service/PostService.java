package com.example.practice.service;

import com.example.practice.dto.MemberResDto;
import com.example.practice.dto.PostResDto;
import com.example.practice.entity.Member;
import com.example.practice.entity.Post;
import com.example.practice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    /**
     * 모든 Post를 조회하는 로직
     */
    public List<PostResDto> getAllPost() {
        // 모든 Post를 조회.
        List<Post> all = postRepository.findAll();
        List<PostResDto> result = new ArrayList<>();

        // Post를 PostResDto로 바꿔 result에 Add
        for(Post post: all){

            // Dto 변환
            Member writer = post.getMember();
            MemberResDto memberResDto = new MemberResDto(writer.getId(), writer.getName(), writer.getEmail(), writer.getAge());

            // Dto 추가
            result.add(new PostResDto(post.getId(), memberResDto, post.getTitle(), post.getContent()));
        }

        return result;
    }

}
