package com.blog.tiblog.member.service;

import com.blog.tiblog.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public String getInfo(Long id){
        String info = memberRepository.findById(id);
        return info;
    }
}
