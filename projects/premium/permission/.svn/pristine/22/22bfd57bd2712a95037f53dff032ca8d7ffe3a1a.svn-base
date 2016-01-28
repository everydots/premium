package com.everydots.premium.permission.utils;

import com.everydots.premium.permission.beans.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 *数据转换类
 */
public class MapperUtil {

    public static User mapAsUser(String content){
        ObjectMapper mapper=new ObjectMapper();
        User user= null;
        try {
            user = mapper.readValue(content,User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
