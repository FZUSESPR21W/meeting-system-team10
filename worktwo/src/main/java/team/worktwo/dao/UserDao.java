package team.worktwo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import team.worktwo.pojo.User;

public interface UserDao {
    @Select("SELECT * FROM user where account=#{account},password=#{password}")
    List<User> getUserList();
}