package it.happys.community.community.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import it.happys.community.community.common.util.JwtUtil;
import it.happys.community.community.pojo.entity.User;
import it.happys.community.community.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangguifa
 * @since 2022-05-08
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("loginHtml")
    public String loginHtml(){
        return "user/login";
    }
    @GetMapping("regHtml")
    public String regHtml(){
        return "user/reg";
    }
    @Value("${site.password.salt}\"")
    private String salt;

    @GetMapping("user/index")
    public String userIndex(){
        return "user/index";
    }

    @GetMapping("user/set")
    public String userSet(){
        return "user/set";
    }

    @GetMapping("user/home")
    public String userHome(){
        return "user/home";
    }

//    @GetMapping("user/index")
//    public String userIndex(){
//        return "user/index";
//    }

    @GetMapping("user/message")
    public String userMessage(){
        return "user/message";
    }

    @GetMapping("user/logout")
    public String userLayout(HttpServletRequest request,HttpServletResponse response){
        Cookie cookie = new Cookie("token", null);
        cookie.setPath("/");
        response.addCookie(cookie);
        request.getSession().setAttribute("user",null);
        return "redirect:/";
    }
    @ResponseBody
    @RequestMapping(value = "user/register", method = RequestMethod.POST)
    public Object register(
            @RequestParam("mail") String mail,
            @RequestParam("code") String code,
            @RequestParam("username") String username,
            @RequestParam(name = "password", required = false) String password,
            HttpServletResponse response) {
        User user = new User();
        user.setEmail(mail);
        user.setName(username);
        user.setPassword(DigestUtils.sha256Hex(password+salt));
        userService.save(user);
        return 200;
    }


    @ResponseBody
    @RequestMapping(value = "user/login", method = RequestMethod.POST)
    public Object login(HttpServletRequest request, HttpServletResponse response) {
        String mail = request.getParameter("mail");
        String code = request.getParameter("code");
        String password = request.getParameter("password");
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("email", mail);
        User user = userService.getOne(queryWrapper);
        if (user == null){
            return 400;
        }else{
           if( user.getPassword().equals(DigestUtils.sha256Hex(password+salt)) ){
               String token = JwtUtil.createToken(user.getId(),user.getName());
               user.setToken(token);
               userService.updateById(user);
               Cookie cookie = new Cookie("token", token);

               cookie.setPath("/");
               response.addCookie(cookie);
               return 200;
           }else{
               return 400;
           }

        }


    }
}

