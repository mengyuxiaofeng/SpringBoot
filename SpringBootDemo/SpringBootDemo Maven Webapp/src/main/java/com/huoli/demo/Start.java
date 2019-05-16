package com.huoli.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


//@Controller
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("controller")
//@ComponentScan(basePackages = {"com.huoli.demo.controller"}) 
@SpringBootApplication
public class Start {	
	public static void main(String[] args) {
		SpringApplication.run(Start.class, "--server.port=9999");//后面是直接设置端口号
	}
	
//	@RequestMapping("hello1")
//	@ResponseBody
//    public String hello(Map<String,Object> map){   
//    return "饶你吗1";
//    }
}
