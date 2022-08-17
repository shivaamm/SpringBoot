package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postman.PostRequest;
import com.example.postman.PostResponse;

@RestController
public class WebController {
	
	@RequestMapping("/sample")
    public SampleResponse Sample(@RequestParam(value="name",defaultValue="RestService")String name) {
        SampleResponse res = new SampleResponse();

        res.setId(101);
        res.setMesssage("You are lerning"+name);

        return res;
	}
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hello";
	}
	
	@RequestMapping("/phone")
	public long phone() {
		return 436;
	}
	
	//post response
	
	@RequestMapping(value="/req", method=RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest input) {
		PostResponse rep=new PostResponse();
		rep.setId(input.getId());
		rep.setMessage("Hello all i'm Shivam" +input.getName());
		rep.setExtra("THe Best");
		return rep;
	}
	
	

}
