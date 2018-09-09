package com.cock.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cock.query.PersonService;
import com.service.query.PersonBO;

@Controller
@RequestMapping("/personInfo")
@DependsOn("personServiceClient")
public class PersonInfoServiceController {
	@Autowired
	PersonService personServiceClient;
	
	@RequestMapping(value = "/query")
	@ResponseBody
	public PersonBO query(@RequestBody PersonBO personBO){
		System.out.println("================Controller  begin======================");
		
		if(StringUtils.isEmpty(personBO.getPersonName())) {
			personBO.setPersonName("无名");
		}
		
		personBO = personServiceClient.query(personBO);
		System.out.println("Service Reurn Address is {"+personBO.getAddress() +"}");
		System.out.println("================Controller  end ======================");
		
		return personBO;
	}
}
