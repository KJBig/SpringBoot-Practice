package com.example.practice.controller;

import com.example.practice.dto.PostReqDto;
import com.example.practice.dto.PostResDto;
import com.example.practice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    /**
     * Post를 등록하는 API
     */
    @PostMapping("")
    public String postPost(@RequestBody PostReqDto postReqDto){

        //TODO: POST를 등록하는 로직을 만들어보세요.

        return "OK";
    }

    /**
     * 모든 Post를 조회하는 API
     */
    @GetMapping("")
    public List<PostResDto> getAllPost(){

        return postService.getAllPost();
    }

    /**
     * 특정 Post를 조회하는 API
     */
    @GetMapping("/{postId}")
    public PostResDto getPost(@PathVariable("postId") Long postId){

        //TODO: postId 해당하는 Post를 조회하는 로직을 만들어보세요.

        return null;
    }

    /**
     * 특정 Post의 제목과 내용을 변경하는 API
     */
    @PutMapping("/password/{postId}")
    public PostResDto patchMemberPost(@PathVariable("postId") Long postId){

        //TODO: postId에 해당하는 Post의 제목과 내용을 변경하는 로직을 만들어보세요.

        return null;
    }

    /**
     * 특정 Post를 삭제하는 API
     */
    @DeleteMapping("/{postId}")
    public String deletePost(@PathVariable("postId") Long postId){

        //TODO: postId에 해당하는 Post를 삭제하는 로직을 만들어보세요.

        return "OK";
    }
}
