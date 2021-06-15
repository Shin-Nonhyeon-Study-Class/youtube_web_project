package com.shinnonhyeon.youtube.dao;

import com.shinnonhyeon.youtube.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
