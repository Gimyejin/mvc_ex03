package com.care.root;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired //빈을 주입해준다(밑의 자료형을 보고)
	@Qualifier("mmm")//여러가지 빈 중 이름을 지정해서 찾아감
	MemberService ms;
	
	@RequestMapping("insert")
	public String insert(Model model) {
		//ms=new MemberService();
		int result = ms.insert();
		ArrayList<String> list = new ArrayList();
		list.add("data1");
		model.addAttribute("result",0);
		return "di/index";
	}
}
