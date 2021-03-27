package team.worktwo.Dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import team.worktwo.pojo.User;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user where account=#{account} and password=#{password}")
    List<User> findUserList(User user);
    //List<User> findUserList(JSONObject request);

}
