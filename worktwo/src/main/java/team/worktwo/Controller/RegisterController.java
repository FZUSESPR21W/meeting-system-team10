package team.worktwo.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;
import team.worktwo.Dao.UserDao;
import team.worktwo.pojo.ResultBean;
import team.worktwo.pojo.User;

import javax.servlet.http.HttpSession;
@RestController
@RequestMapping("/user")
public class RegisterController{
    @Autowired
    private UserDao userDao;
    //注册验证
    @RequestMapping("/register")
    public ResultBean checkRegister(@RequestBody JSONObject request) {
        User user = new User(0,"",request.getString("account"),request.getString("password"),0);
        if (userDao.findUserList(user).size()>0) {
            return new ResultBean(200,"查询成功");
        }
        return new ResultBean(500,"查询失败");
    }
}
