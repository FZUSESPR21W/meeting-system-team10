package team.worktwo.Dao;

import team.worktwo.pojo.Forum;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ForumDao {
    @Select("SELECT * FROM forum")
    List<Forum> getForumList();
}
