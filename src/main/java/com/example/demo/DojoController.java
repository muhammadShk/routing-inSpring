package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/m/{msg}")
    public String showLesson(@PathVariable("msg") String msg){
    	if(msg.equals("dojo")){
    		msg="The dojo is awesome !";
    	}
    	else if (msg.equals("burbank-dojo")) {
    		msg= "Burbank Dojo is located in Southern California";
    	}
    	else if (msg.equals("san-jose")) {
    		msg= "SJ dojo is the headquarters";
    	}
    	return "error " + msg;
    }
}
