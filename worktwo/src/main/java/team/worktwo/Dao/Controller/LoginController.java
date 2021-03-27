package team.worktwo.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.security.util.Password;
import team.worktwo.Dao.UserDao;
import team.worktwo.pojo.ResultBean;
import team.worktwo.pojo.User;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserDao userDao;
    //登录验证
    @RequestMapping("/login")
    public ResultBean checkLogin(@RequestBody JSONObject request) {
        User user = new User(0,"",request.getString("account"),request.getString("password"),0);
        if (userDao.findUserList(user).size() == 0) {
            return new ResultBean(500,"查询失败",0);
        }
        return new ResultBean(200,"查询成功",userDao.findUserList(user).get(0).getType_id());
    }
}
