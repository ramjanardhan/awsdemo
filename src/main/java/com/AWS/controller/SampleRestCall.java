package com.AWS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleRestCall 
{
 @RequestMapping("/")
	public String restcall()
	{
		return "Success";
	}
	
 @RequestMapping("/Rest")
	public String restcall1()
	{
		return "Sample Rest call using Rest RestAPI";
	}
}
