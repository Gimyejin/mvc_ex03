package com.care.get_post;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	public MyController() {
		System.out.println("MyController생성자 실행");
	}
	
	@RequestMapping(value="my/index",method = RequestMethod.GET)
	public String index(){
		return "/get_post/index";
	}
	//방법1
	@GetMapping("my/result")
	//@RequestMapping(value="my/index",method = RequestMethod.GET)랑 같음
	public String reult_get(HttpServletRequest request, Model model) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		
		System.out.println("get방식");
		//jsp파일에서 넘긴 값을 받아온것
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "/get_post/result";
	}
	//방법2
	//@PostMapping("my/result")
	@RequestMapping(value="my/result",method = RequestMethod.POST)
	public String result(HttpServletRequest request, Model model,
							@RequestParam("name")String name,
							@RequestParam("age")String age){
		System.out.println("post방식");
		
		model.addAttribute("method", request.getMethod());
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "/get_post/result";
	}
}
