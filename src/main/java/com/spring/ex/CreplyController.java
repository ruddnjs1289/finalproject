package com.spring.ex;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.ex.Service.CreplyService;
import com.spring.ex.dto.Creply;

@Controller
@RequestMapping("/reply/*")
public class CreplyController {
	
	@Inject
	private CreplyService replyservice;
	
	//´ñ±Û ÀÛ¼º
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWirte(Creply vo) throws Exception {
		
		replyservice.write(vo);
		
		return "redirect:/View?bno=" + vo.getBno();
	}
	
	//´ñ±Û »èÁ¦
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String postDelete(Creply vo) throws Exception {
		
		replyservice.delete(vo);
		
		return "redirect:/View?bno=" + vo.getBno();
	}
	
	/*
	 * //´ñ±Û ¼öÁ¤
	 * 
	 * @RequestMapping(value = "/Replymodify", method = RequestMethod.GET) public
	 * void getModify(@RequestParam("bno") int bno,@RequestParam("rno") int rno ,
	 * Model model) throws Exception {
	 * 
	 * List<Creply> Creply=null; Creply=replyservice.list(bno);
	 * model.addAttribute("Creply",Creply);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * //´ñ±Û ¼öÁ¤
	 * */
	
	 
	
	@RequestMapping(value = "/Replymodify", method = RequestMethod.GET)
	public String getmdfy( @RequestParam("bno") int bno, Model model ) throws Exception {
		
		
		 List<Creply> Creply=null; 
		 Creply=replyservice.list(bno);
		 model.addAttribute("Creply",Creply);
		return "/Replymodify";
		 
		  
		
		
	}
	
	
	
	 @RequestMapping(value = "/Replymodify", method = RequestMethod.POST) 
	 public String postModify(Creply vo) throws Exception {
	  
	 replyservice.modify(vo);
	  
	 return "redirect:/View?bno=" + vo.getBno();
	 
	  }
	 
	

	
	
}
