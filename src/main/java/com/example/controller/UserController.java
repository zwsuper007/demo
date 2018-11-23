package com.example.controller;

import com.example.model.bo.SysUser;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wei.zhao
 * @Date: Create in  2018/9/30 16:40
 * @Description:
 * @Modified By:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    @ResponseBody
    public SysUser selectUser(@RequestParam(value = "userId")String userId){
        //AB96C135E1E44FE39920F0BAB5E231D8
        SysUser sysUser = userService.findById(userId);
            System.out.println(sysUser.getStaff_name());
        return sysUser;
    }

}
