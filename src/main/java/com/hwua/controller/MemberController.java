package com.hwua.controller;

import com.hwua.pojo.Member;
import com.hwua.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    @Autowired
    private MemberServiceImpl memberService;

    public Member findMember(int id) throws Exception {
        return memberService.findmember(id);
    }
    public Member findMemberByname(String name)throws Exception{
        return memberService.findmemberByName(name);
    }
    public boolean addMember(Member member)throws Exception{
       return memberService.addMember(member);
    }

}
