package com.ifelseco.userapi.service;

import com.ifelseco.userapi.model.EmailModel;

public interface EmailService {

    void sendEmail(EmailModel emailModel);
}
