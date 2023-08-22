package com.blog.tiblog.member.repository;

public interface MemberRepository {

    String findById(Long id) throws IllegalAccessException;
}
