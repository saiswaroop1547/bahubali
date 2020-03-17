package com.example.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/hellod")
public class TestController 
{
	@RequestMapping("/h3")
	public String getMessage1()
	{
		return "hello1";
	}
	@RequestMapping("/h4")
	public String getMessage2()
	{
		return "hello2";
	}
	 
}
