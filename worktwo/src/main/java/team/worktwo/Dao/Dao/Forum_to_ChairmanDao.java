package team.worktwo.Dao;

import org.apache.ibatis.annotations.Select;
import team.worktwo.pojo.Forum;

public interface Forum_to_ChairmanDao {
    @Select("select chairman_id from forum_to_chairman where forum_id=#{forum_id}")
    int getChairmanId(int forum_id);

    @Select("select forum_id from forum_to_chairman where chairman_id=#{chairman_id}")
    int getForumId(int chairman_id);
}
