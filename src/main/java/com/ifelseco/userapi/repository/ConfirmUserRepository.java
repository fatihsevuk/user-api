package com.ifelseco.userapi.repository;

import com.ifelseco.userapi.entity.ConfirmUserToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConfirmUserRepository extends CrudRepository<ConfirmUserToken,Long> {
    ConfirmUserToken findByToken(String token);

}
