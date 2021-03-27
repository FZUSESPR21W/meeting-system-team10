package team.worktwo.Dao;

import org.apache.ibatis.annotations.Select;
import team.worktwo.pojo.Meeting;

public interface MeetingDao {
    @Select("select * from meeting")
    Meeting getMeeting();
}
