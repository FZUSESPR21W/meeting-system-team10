package team.worktwo.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.alibaba.fastjson.JSONObject;


public interface MessageDao {
    
    @Delete("DELETE FROM message WHERE forum_id IN(SELECT forum_id FROM forum "
            + "WHERE title=#{forumTitle}) AND content=#{content})")
    int deleteMessage(JSONObject request);
    
    @Insert("INSERT INTO message(forum_id,content) VALUES(#{forum_id},#{content})")
    int addMessage(JSONObject request);
    

}
