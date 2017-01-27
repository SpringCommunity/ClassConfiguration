package springcommunity.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* Giúp Spring nhận biết đây là controller */
@Controller
public class IndexController {
	/* Map controller với view*/
     @RequestMapping(value="/", method=RequestMethod.GET)
     public String showIndex(){
    	 return "Hello Spring Community";
     }
}
