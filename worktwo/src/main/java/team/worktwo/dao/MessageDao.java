package team.worktwo.dao;

import org.apache.ibatis.annotations.*;

import com.alibaba.fastjson.JSONObject;

import team.worktwo.pojo.Message;

public interface MessageDao {
    
    @Delete("DELETE FROM message WHERE id=#{id}")
    void deleteMessage(@Param("id") int id);
    
    @Insert("INSERT INTO message(id,forum_id,content) VALUES(#{id},#{forum_id},#{content}")
    void addMessage(JSONObject request);
}
