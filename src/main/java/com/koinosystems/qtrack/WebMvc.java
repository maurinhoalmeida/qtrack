package com.koinosystems.qtrack;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 *
 * @author mauro.almeida
 *
 */

@Controller
@RequestMapping("/api")
public class WebMvc {

	private static final Logger LOG = LoggerFactory.getLogger(WebMvc.class);

	//@Autowired
	//protected Neo4jTemplate template;

	Map<Integer, Object> qtrackData = new HashMap<Integer, Object>();
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get(Model ui){
		return "index";
	}
	

	@RequestMapping(value = "/getqtrack/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ModelAndView getQTrack(@PathVariable("id") int id) {
		LOG.info("");
		ModelAndView mav = new ModelAndView(new MappingJacksonJsonView()); 
		mav.addObject("key1", id); 
		return mav;
	}


}
