package com.huoli.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huoli.demo.Mapper.XuserMapper;
import com.huoli.demo.entity.Xuser;

@RestController
public class XuserController {
	@Autowired
    private XuserMapper xuserMapper;
	
	@RequestMapping("getUsers")
    public List<Xuser> getUsers() {
        List<Xuser> users=xuserMapper.getAll();
        return users;
    }
     
    @RequestMapping("getUser")
    public Xuser getUser(Long id) {
    	Xuser user=xuserMapper.getOne(id);
        return user;
    }
     
    @RequestMapping("add")
    public void save(Xuser user) {
        xuserMapper.insert(user);
    }
     
//    @RequestMapping(value="update")
//    public void update(Xuser user) {
//        xuserMapper.update(user);
//    }
     
    @RequestMapping(value="delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        xuserMapper.delete(id);
    }
    
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Map<String,Object> map){   
    return "饶你吗";
    }
}
