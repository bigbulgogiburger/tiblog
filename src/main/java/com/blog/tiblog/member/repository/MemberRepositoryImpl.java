package com.blog.tiblog.member.repository;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    Map<Long,String> memberMap = new HashMap<>();


    @PostConstruct
    public void init(){
        memberMap.put(1L,"도토리");
    }


    public String findById(Long id){
        String info = memberMap.get(id);
        return info;
    }
}
