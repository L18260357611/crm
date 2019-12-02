package com.hwua.mapper;

import com.hwua.pojo.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberMapper {
    public Member findmember(int id) throws Exception;

    public Member findmemberByName(String name) throws Exception;

    public int addMember(Member member) throws Exception;
}
