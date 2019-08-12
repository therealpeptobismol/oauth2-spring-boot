package io.nextwaave.accountservice.service;

import io.nextwaave.accountservice.client.AuthServiceFeignClient;
import io.nextwaave.accountservice.dto.UserDto;
import io.nextwaave.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
