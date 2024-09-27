package com.application.myFirstApplication.service;

import com.application.myFirstApplication.model.Director;
import com.application.myFirstApplication.model.Member;

public interface ServiceInterface {

    public Director getOneDirector();
    public Member saveMember(Member member);

}
