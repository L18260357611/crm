package com.hwua.service.impl;

import com.hwua.mapper.MemberMapper;
import com.hwua.pojo.Member;
import com.hwua.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper mapper;

    @Override
    public Member findmember(int id) throws Exception {
        if (id != 0) {
            Member member = mapper.findmember(id);
            return member;
        }
        return null;
    }

    @Override
    public Member findmemberByName(String name) throws Exception {
        if (name != null) {
            return mapper.findmemberByName(name);
        }
        return null;
    }

    @Override
    public boolean addMember(Member member) throws Exception {
        int i = mapper.addMember(member);
        if (i != 0) {
            return true;
        }
        return false;
    }
}
