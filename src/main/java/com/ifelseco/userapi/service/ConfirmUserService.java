package com.ifelseco.userapi.service;

import com.ifelseco.userapi.entity.ConfirmUserToken;

public interface ConfirmUserService {
    ConfirmUserToken findByToken(String token);
    ConfirmUserToken save(ConfirmUserToken confirmUserToken);
    void delete(ConfirmUserToken confirmUserToken);

}
