package com.login.app.controler;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
		
	public boolean getAtribute(String user, String pass) {
		

		return (DummyBase.getMap().containsKey(user) && DummyBase.getMap().containsValue(pass));
	
}
}
