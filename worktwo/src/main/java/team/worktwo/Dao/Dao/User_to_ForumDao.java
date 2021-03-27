package team.worktwo.Dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.*;
import team.worktwo.pojo.Forum;
import team.worktwo.pojo.User;
import team.worktwo.pojo.User_to_Forum;

import java.util.List;

@Mapper
public interface User_to_ForumDao {
    @Select("SELECT * FROM user where account=#{account}")
    List<User> findOneUser(JSONObject request);

    @Select("SELECT * FROM user_to_forum where forum_id=#{forum_id} and user_id=#{user_id}")
    List<Forum> findOneForum(User_to_Forum usertoforum);

    @Insert("INSERT INTO  user_to_forum(user_id,forum_id) VALUES(#{user_id},#{forum_id})")
    int InsertUertoForum(User_to_Forum usertoforum);

    @Delete("DELETE FROM user_to_forum where user_id=#{user_id} and forum_id=#{forum_id}")
    int DeleteUertoForum(User_to_Forum usertoforum);
}
