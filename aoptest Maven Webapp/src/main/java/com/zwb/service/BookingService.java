package com.zwb.service;

import org.springframework.stereotype.Service;


@Service
public class BookingService {

	public boolean bookFlight() {
		try {
			Thread.sleep(200);
			for(int i =0;i<20;i++){
				System.out.println("系统已经接受，正在出票。。。");
			}		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}	
}
