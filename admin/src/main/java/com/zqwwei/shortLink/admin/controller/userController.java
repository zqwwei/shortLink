package com.zqwwei.shortLink.admin.controller;

import com.zqwwei.shortLink.admin.dto.resp.UserRespDTO;
import com.zqwwei.shortLink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Management Controller Layer
 */
@RestController
@RequiredArgsConstructor
public class userController {

    private final UserService userService;

    /**
     * fetch user info given username
     */
    @GetMapping("/api/shortLink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}
