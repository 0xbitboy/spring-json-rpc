package com.github.liaojiacan.jsonrpc.api.service;

import com.github.liaojiacan.jsonrpc.api.dto.UserDTO;

/**
 * Created by liaojiacan on 2017/4/8.
 */
public interface UserService {

    UserDTO getUserByUsername(String userName);
    void saveUser(UserDTO userDTO);
}
