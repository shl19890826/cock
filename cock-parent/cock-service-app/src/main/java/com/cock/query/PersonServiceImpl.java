package com.cock.query;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.cock.query.PersonService;
import com.service.query.PersonBO;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	public PersonBO query(PersonBO personBO) {
		Assert.notNull(personBO);
		
		if(personBO.getPersonName().equals("司华龙")) {
			personBO.setPersonName("司华龙");
			personBO.setAddress("北京海淀区景天路");
		}else {
			personBO.setPersonName("无名");
			personBO.setAddress("镜花水月万剑归宗");
		}
		
		return personBO;
	}

}
