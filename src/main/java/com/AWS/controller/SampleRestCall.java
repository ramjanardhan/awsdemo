package com.AWS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleRestCall 
{
 @RequestMapping("/")
	public String restcall()
	{
		return "Sample Rest call";
	}
	
 @RequestMapping("/Rest")
	public String restcall1()
	{
		return "Sample Rest call with Rest RestAPI Name";
	}
}
