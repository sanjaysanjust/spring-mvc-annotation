package org.sanjay.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceClient {

	MyService myService;

	@Autowired
	public MyServiceClient(MyService myService) {
		this.myService = myService;
	}
	
	public void execute() {
		System.out.print(myService.greet());
	}

}
