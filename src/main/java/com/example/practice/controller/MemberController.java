package com.example.practice.controller;

import com.example.practice.dto.MemberReqDto;
import com.example.practice.dto.MemberResDto;
import com.example.practice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    /**
     * Member를 등록하는 API
     */
    @PostMapping("")
    public String postMember(@RequestBody MemberReqDto memberReqDto){

        memberService.postMember(memberReqDto);

        return "OK";
    }

    /**
     * 모든 Member를 조회하는 API
     */
    @GetMapping("")
    public List<MemberResDto> getAllMember(){

        //TODO: 모든 Member를 조회하는 로직을 만들어보세요.

        return null;
    }

    /**
     * 특정 Member를 조회하는 API
     */
    @GetMapping("/{memberId}")
    public MemberResDto getMember(@PathVariable("memberId") Long memberId){

        //TODO: memberId에 해당하는 Member를 조회하는 로직을 만들어보세요.

        return null;
    }

    /**
     * 특정 Member의 password를 변경하는 API
     */
    @PatchMapping("/password/{memberId}")
    public MemberResDto patchMemberPassword(@PathVariable("memberId") Long memberId){

        //TODO: memberId에 해당하는 Member의 Password를 변경하는 로직을 만들어보세요.

        return null;
    }

    /**
     * 특정 Member를 삭제하는 API
     */
    @DeleteMapping("/{memberId}")
    public String deletePassword(@PathVariable("memberId") Long memberId){

        //TODO: memberId에 해당하는 Memebr를 삭제하는 로직을 만들어보세요.

        return "OK";
    }
}
