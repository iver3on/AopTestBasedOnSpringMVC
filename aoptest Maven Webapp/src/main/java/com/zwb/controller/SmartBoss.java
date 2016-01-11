package com.zwb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zwb.service.BookingService;

@Controller
@RequestMapping("zwb")
public class SmartBoss {
	@Autowired
    private BookingService bookingService;
        
        //...
	
	@RequestMapping(value="/book.action")
    public String goSomewhere() {
		//切入点
        boolean x =  bookingService.bookFlight();
        if (x) {
			return "success";
		}else{ 
			return "failed";
		}
    }
    
}
