package team.worktwo.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.worktwo.Dao.ForumDao;
import team.worktwo.Dao.UserDao;
import team.worktwo.Dao.User_to_ForumDao;
import team.worktwo.pojo.ResultBean;
import team.worktwo.pojo.User_to_Forum;

@RestController
@RequestMapping("/select")
public class SelectForumController {
    @Autowired
    private User_to_ForumDao usertoforumDao;

    private ForumDao forumDao;
    @RequestMapping("/forum")
    public ResultBean SelectForum(@RequestBody JSONObject request){
        int userid=usertoforumDao.findOneUser(request).get(0).getUser_id();
        User_to_Forum usertoforum=new User_to_Forum(0,userid,request.getInteger("forumid"));
        
        if(usertoforumDao.findOneForum(usertoforum).size()==0){
            return new ResultBean(200,"ok",usertoforumDao.InsertUertoForum(usertoforum));
        }
        //User_to_Forum usertoforum=new User_to_Forum(0,userid,request.getInteger("forumid"));
        return new ResultBean(200,"ok",usertoforumDao.DeleteUertoForum(usertoforum));
    }
}
