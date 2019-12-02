package com.hwua.service;

import com.hwua.pojo.Member;

public interface MemberService {
    public Member findmember(int id)throws Exception;

    public Member findmemberByName(String name) throws Exception;
    public boolean addMember(Member member) throws Exception;
}
