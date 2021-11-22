package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/Main")
	public String Main() {
		return "Main";

	}

	// 로그인
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
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
	@RequestMapping("/Carmine")
	public String Carmine() {
		return "Carmine";
	}
}
