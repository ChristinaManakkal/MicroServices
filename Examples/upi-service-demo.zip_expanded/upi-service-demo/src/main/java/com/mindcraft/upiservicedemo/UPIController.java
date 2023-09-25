package com.mindcraft.upiservicedemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/upi")
public class UPIController {
	@Autowired
	RestTemplate template;
	
	@GetMapping(path="/getBalance", produces= org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> upiCheckBalance(){
		Map<String,Object> map=template.getForObject("http://ACCOUNT-SERVICE/api/account/balance", HashMap.class);
		map.put("Name", "UPI App");
		return map;
	}
	
	@GetMapping(path="/123", produces= org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> Balance(){
		//Map<String,Object> map=template.getForObject("http://ACCOUNT-SERVICE/api/account/balance", HashMap.class);
		Map <String,Object> map=new HashMap<>(); //wrote this line coz vpn in laptop was blocking loadbalancer to acces upi; so just write line 28
		map.put("Name", "UPI App");
		return map;
	}

}
