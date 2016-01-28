package com.everydots.premium.permission.controller;

import com.everydots.premium.permission.beans.User;
import com.everydots.premium.permission.utils.MapperUtil;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("auth")
public class Auth {

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public
    @ResponseBody
    Object login(@RequestBody String content) throws Exception{
        User user = MapperUtil.mapAsUser(content);
        user.setUsername("serverUser");
        user.setPassword("1111");
        return new ObjectMapper().writer().writeValueAsString(user);
    }

    @RequestMapping("test.do")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("success cros!!");
    }
}
