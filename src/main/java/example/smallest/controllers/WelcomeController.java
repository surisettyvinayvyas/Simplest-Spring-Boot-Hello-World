54.177.96.16package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String hellofuckingWorld() {
		
		//Flux
		
		
		
		
		return "Hello master World!!!"; //"application/json" mean this is a text not a redirect
	}
}
