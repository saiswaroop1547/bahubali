package com.example.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloc")
public class MainController 
{
	private String Message="Hello this is sucessful";
		// TODO Auto-generated method stub
	@RequestMapping(value="/hi",method=RequestMethod.GET)  
    public String getMessage(Model model)  
    {  
        model.addAttribute("message", this.Message);
        return "hello";  
    }  
}
