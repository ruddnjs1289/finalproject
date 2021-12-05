package com.spring.ex;

import java.io.Console;
import java.util.List;

import javax.inject.Inject;
import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ex.Service.CarmineService;
import com.spring.ex.Service.MemberService;
import com.spring.ex.dto.Carmine;
import com.spring.ex.dto.Member;

/*메시지 Request processing failed; nested exception is org.mybatis.spring.MyBatisSystemException: 
	nested exception is org.apache.ibatis.exceptions.PersistenceException:
	500 오류 
	1.mapper에 정의된 namespace 명칭이 같은 application 내에 중복 될 경우
	2.mapper id가 틀린 경우
	3.Parameter bean의 field 명이 틀린 경우
	4.sql.xml에서 정의된 namespace와 DAO에서 호출하는 namespace가 다를 경우
	5.mapper가 정의되어 있지 않거나 스펠링이 틀린 경우
	*/
@Controller
public class MainController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MainController.class);

	@Inject
	MemberService service;
	@Inject
	CarmineService Cservice; // 카마인 서비스

	@RequestMapping("/main")
	public String Main() {
		return "Main";
	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(Member vo, HttpServletRequest req) throws Exception {
		logger.info("post login");

		HttpSession session = req.getSession();

		Member login = service.login(vo);

		if (login == null) {
			session.setAttribute("member", null);
		} else {
			session.setAttribute("member", login);
		}

		return "Main";
	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		logger.info("get logout");

		session.invalidate();

		return "Main";
	}

	// 회원가입 get
	@RequestMapping(value = "/Join", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("get register");
		System.out.println(org.springframework.core.SpringVersion.getVersion());
	}

	// 회원가입 post
	@RequestMapping(value = "/Join", method = RequestMethod.POST)
	public String getJoin(Member vo) throws Exception {
		logger.info("post resister");

		/*
		 * int result=service.idCheck(vo);
		 * 
		 * try { if(result == 1) { return"Join"; }else if(result == 0){
		 * service.register(vo); } } catch (Exception e) { // TODO: handle exception
		 * throw new RuntimeException(); }
		 */

		service.register(vo);
		return "Login";
	}

	// 회원확인

	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	@ResponseBody
	public int postIdCheck(Member vo) throws Exception {
		logger.info("post idCheck");

		int result = service.idCheck(vo);
		return result;
	}

	// 게시글 작성
	@RequestMapping(value = "/Write", method = RequestMethod.GET)
	public String getWrite() {
		logger.info("들어갔는지 확인용 게터 부분");
		return "Write";
	}
	// 게시글 작성

	@RequestMapping(value = "/Write", method = RequestMethod.POST)
	public String postWrite(Carmine vo) throws Exception {
		Cservice.Write(vo);
		logger.info("들어갔는지 확인용");
		return "Carmine";
	}

	// 게시물 조회
	@RequestMapping(value = "/View", method = RequestMethod.GET)
	public void getView(@RequestParam("bno") int bno, Model model) throws Exception {

		Carmine vo = Cservice.view(bno);

		model.addAttribute("view", vo);

	}

	// 게시물 수정
	@RequestMapping(value = "/Modify", method = RequestMethod.GET)
	public void getModfiy(@RequestParam("bno") int bno, Model model) throws Exception {

		Carmine vo = Cservice.view(bno);

		model.addAttribute("view", vo);
	}

	//게시물 수정
	@RequestMapping(value = "/Modify", method = RequestMethod.POST)
	public String postModfiy(Carmine vo) throws Exception {
		Cservice.Modify(vo);
		return "redirect:/View?bno="+vo.getBno();
	}
	
	// 돌 시뮬
	@RequestMapping("/Stone")
	public String Stone() {
		return "Stone";
	}

	// 아재패턴
	@RequestMapping("/Pattern")
	public String Pattern() {
		return "Pattern";
	}

	// 빙고
	@RequestMapping("/Bingo")
	public String Bingo() {
		return "Bingo";
	}

	// 발탄 공략
	@RequestMapping("/Valtan1")
	public String Valtan1() {
		return "Valtan1";
	}

	// 발탄 공략
	@RequestMapping("/Valtan2")
	public String Valtan2() {
		return "Valtan2";
	}

	// 비아키스 공략
	@RequestMapping("/Biackiss1")
	public String Biackiss1() {
		return "Biackiss1";
	}

	// 비아키스 공략
	@RequestMapping("/Biackiss2")
	public String Biackiss2() {
		return "Biackiss2";
	}

	// 비아키스 공략
	@RequestMapping("/Biackiss3")
	public String Biackiss3() {
		return "Biackiss3";
	}

	// 쿠크세이튼 1네임드 공략
	@RequestMapping("/Kouku1")
	public String Kouku1() {
		return "Kouku1";
	}

	// 쿠크세이튼 2네임드 공략
	@RequestMapping("/Kouku2")
	public String Kouku2() {
		return "Kouku2";
	}

	// 쿠크세이튼 2네임드 공략
	@RequestMapping("/Kouku3")
	public String Kouku3() {
		return "Kouku3";
	}

	// 니나브 서버게시판으로
	@RequestMapping("/Ninave")
	public String Ninave() {
		return "Ninave";
	}

	// 루페온 서버게시판으로
	@RequestMapping("/Loopaeon")
	public String Loopaean() {
		return "Loopaeon";
	}

	// 카마인 서버게시판으로
	@RequestMapping(value = "/Carmine", method = RequestMethod.GET)
	public String Carmine(Model model) throws Exception {
		List<Carmine> list = null;
		list = Cservice.list();

		model.addAttribute("list", list);
		return "Carmine";
	}

}
