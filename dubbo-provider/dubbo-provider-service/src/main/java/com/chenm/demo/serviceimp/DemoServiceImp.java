package com.chenm.demo.serviceimp;

import com.alibaba.dubbo.config.annotation.Service;
import com.chenm.demo.mapper.UserMapper;
import com.chenm.demo.model.User;
import com.chenm.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DemoServiceImp implements DemoService {

//    @Autowired
//    private UserMapper userMapper;


    @Override
    public void hello(String id) {
        //User user=userMapper.selectById(id);
        User user = new User();
        user.setName("chenm");
        if(user!=null){
            System.out.println( user.getName()+ " say hello");
        }else{
            System.out.println("no user find");
        }
    }
}
