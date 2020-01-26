package com.egs.testproject.security;

import com.egs.testproject.model.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {
    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(user.getUsername()));
    }
    public User getUser(){
        return user;
    }
}
