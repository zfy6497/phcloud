package com.phcloud.provider.usc;
import com.phcloud.mybatis.po.Userinfo;
import com.phcloud.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/User")
public class UserController {
    @Autowired
   private  UserService UserDao;

    @RequestMapping("/showUser")
    @ResponseBody
    public Userinfo toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        Userinfo user = this.UserDao.getUserById(userId);
        return user;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public  String SayHi(String name){
        //throw new NullArgumentException("aaa");
        return  "hahahaha 8881:"+name;
    }
}
