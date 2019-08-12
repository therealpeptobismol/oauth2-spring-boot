package io.nextwaave.accountservice.controller;

import io.nextwaave.accountservice.dto.UserDto;
import io.nextwaave.accountservice.dto.UserRegistrationDto;
import io.nextwaave.accountservice.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/register")
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

    @PostMapping("/authn")
    public String authenticate(@RequestParam String username, @RequestParam String password) {
        return accountService.create(user);
    }

}
