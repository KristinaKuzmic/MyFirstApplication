package com.application.myFirstApplication.service;

import com.application.myFirstApplication.model.Director;
import com.application.myFirstApplication.model.Member;
import com.application.myFirstApplication.repository.DirectorRepository;
import com.application.myFirstApplication.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface{
    @Autowired
    private DirectorRepository directorRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Director getOneDirector(){
        return null;
    }

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}
