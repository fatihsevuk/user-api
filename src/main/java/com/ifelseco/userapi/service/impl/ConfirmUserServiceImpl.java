package com.ifelseco.userapi.service.impl;

import com.ifelseco.userapi.entity.ConfirmUserToken;
import com.ifelseco.userapi.repository.ConfirmUserRepository;
import com.ifelseco.userapi.service.ConfirmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConfirmUserServiceImpl implements ConfirmUserService {


    @Autowired
    private ConfirmUserRepository confirmUserRepository;

    @Override
    public ConfirmUserToken findByToken(String token) {
        return confirmUserRepository.findByToken(token);
    }

    @Override
    public ConfirmUserToken save(ConfirmUserToken confirmUserToken) {
        return confirmUserRepository.save(confirmUserToken);
    }

    @Override
    public void delete(ConfirmUserToken confirmUserToken) {
        confirmUserRepository.delete(confirmUserToken);
    }
}
