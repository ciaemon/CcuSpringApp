package com.ciaemon.ccudb.services;

import com.ciaemon.ccudb.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcuService {
    private final UserRepo userRepo;

    public CcuService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
