package com.blog.tiblog.member.controller;

import com.blog.tiblog.member.dto.InfoDto;
import com.blog.tiblog.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/{id}")
    public String info(@PathVariable("id") Long id) throws IllegalAccessException {
        String info = memberService.getInfo(id);
        return info;

    }
}
