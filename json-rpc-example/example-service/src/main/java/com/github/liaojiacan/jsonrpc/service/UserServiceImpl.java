package com.github.liaojiacan.jsonrpc.service;

import com.github.liaojiacan.jsonrpc.api.dto.UserDTO;
import com.github.liaojiacan.jsonrpc.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by liaojiacan on 2017/4/8.
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    private final static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);


    public UserDTO getUserByUsername(String userName) {
        if("liaojiacan".equals(userName)){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(1L);
            userDTO.setNickName("灿");
            userDTO.setUsername("liaojiacan");
            userDTO.setLastLoginTime(new Date());
            return  userDTO;
        }
        return null;
    }

    public void saveUser(UserDTO userDTO) {
        LOG.info(userDTO.toString());
    }
}
