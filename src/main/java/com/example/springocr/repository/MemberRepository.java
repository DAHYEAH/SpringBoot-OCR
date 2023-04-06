package com.example.springocr.repository;

import com.example.springocr.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 생성

    Optional<Member> findById(Long id); // id로 회원 검색

    Optional<Member> findByName(String name); // name으로 회원 검색

    List<Member> findAll(); //회원 모두 출력


}
