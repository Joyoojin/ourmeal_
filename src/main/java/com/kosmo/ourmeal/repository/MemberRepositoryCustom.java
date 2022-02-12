package com.kosmo.ourmeal.repository;

import com.kosmo.ourmeal.entity.Member;

import java.util.List;


public interface MemberRepositoryCustom {


    // 관리자 회원조회
    List<Member> findAll();

    void deleteByMemID(String memID);
}