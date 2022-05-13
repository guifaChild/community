package it.happys.community.community.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import it.happys.community.community.pojo.entity.User;
import it.happys.community.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: zhangguifa
 * @date: 2022-05-07 10:10
 */

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("token") && cookie.getValue() !=null){
                String token = cookie.getValue();
                QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
                queryWrapper.eq("token", token);
                List<User> userList = userService.list(queryWrapper);
                if (userList.size()>0){
                    request.getSession().setAttribute("user",userList.get(0));
                }
            }
        }
        return "index";
    }
}
