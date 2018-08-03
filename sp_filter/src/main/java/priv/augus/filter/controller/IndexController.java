package priv.augus.filter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * IntelliJ IDEA
 *
 * @author Augus
 * @date 2018/8/3
 */
@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/user/all")
    public List<User> getAllUser(){
        // 模拟从数据库取数据返回
        User user = new User("小明",23);
        User user1 = new User("小大黄",12);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        return userList;
    }


}
