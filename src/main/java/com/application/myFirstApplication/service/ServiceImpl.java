package com.application.myFirstApplication.service;


import com.application.myFirstApplication.model.Director;
import com.application.myFirstApplication.repository.DirectorRepository;
import com.application.myFirstApplication.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
