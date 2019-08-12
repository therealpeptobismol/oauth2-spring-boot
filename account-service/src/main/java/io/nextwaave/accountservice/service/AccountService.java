package io.nextwaave.accountservice.service;

import io.nextwaave.accountservice.dto.UserDto;
import io.nextwaave.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}

