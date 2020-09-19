package com.eugene.springboot.DAO;

import com.eugene.springboot.DTO.UserDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
