package com.example.practice.service;

import com.example.practice.dto.MemberReqDto;
import com.example.practice.entity.Member;
import com.example.practice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    /**
     * Memebr를 등록하는 로직
     */
    @Transactional
    public void postMember(MemberReqDto memberReqDto) {
        Member newMember = new Member(memberReqDto.getName(),
                                        memberReqDto.getEmail(), memberReqDto.getPassword(), memberReqDto.getAge());
        memberRepository.save(newMember);
    }
}
