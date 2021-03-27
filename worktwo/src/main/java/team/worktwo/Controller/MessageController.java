package team.worktwo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSONObject;

import team.worktwo.dao.MessageDao;
import team.worktwo.pojo.ResultBean;
import team.worktwo.pojo.User;

@RestController
@RequestMapping("/message")
public class MessageController {
    
    private MessageDao messageDao;
    @RequestMapping("/delete")
    public ResultBean deleteMessage(@RequestBody JSONObject request) {
        int number=messageDao.deleteMessage(request);
        if (number == 0) {
            return new ResultBean(500,"删除失败",0);
        }
        return new ResultBean(200,"删除成功",number);
    }

    @RequestMapping("add")
    public ResultBean addMessage(@RequestBody JSONObject request) {
        int number=messageDao.addMessage(request);
        if(number == 0) {
            return new ResultBean(500,"添加成功",0);
        }
        return new ResultBean(200,"添加成功",number);
    }
}
