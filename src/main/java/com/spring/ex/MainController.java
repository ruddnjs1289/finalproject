package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/Main")
	public String Main() {
		return "Main";

	}

	// �α���
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}

	// �� �ù�
	@RequestMapping("/Stone")
	public String Stone() {
		return "Stone";
	}

	// ��������
	@RequestMapping("/Pattern")
	public String Pattern() {
		return "Pattern";
	}

	// ����
	@RequestMapping("/Bingo")
	public String Bingo() {
		return "Bingo";
	}

	// ��ź ����
	@RequestMapping("/Valtan1")
	public String Valtan1() {
		return "Valtan1";
	}

	// ��ź ����
	@RequestMapping("/Valtan2")
	public String Valtan2() {
		return "Valtan2";
	}

	// ���Ű�� ����
	@RequestMapping("/Biackiss1")
	public String Biackiss1() {
		return "Biackiss1";
	}
	// ���Ű�� ����
	@RequestMapping("/Biackiss2")
	public String Biackiss2() {
		return "Biackiss2";
	}
		// ���Ű�� ����
	@RequestMapping("/Biackiss3")
	public String Biackiss3() {
		return "Biackiss3";
	}
		

	// ��ũ����ư 1���ӵ� ����
	@RequestMapping("/Kouku1")
	public String Kouku1() {
		return "Kouku1";
	}

	// ��ũ����ư 2���ӵ� ����
	@RequestMapping("/Kouku2")
	public String Kouku2() {
		return "Kouku2";
	}

	// ��ũ����ư 2���ӵ� ����
	@RequestMapping("/Kouku3")
	public String Kouku3() {
		return "Kouku3";
	}

	// �ϳ��� �����Խ�������
	@RequestMapping("/Ninave")
	public String Ninave() {
		return "Ninave";
	}

	// ����� �����Խ�������
	@RequestMapping("/Loopaeon")
	public String Loopaean() {
		return "Loopaeon";
	}

	// ī���� �����Խ�������
	@RequestMapping("/Carmine")
	public String Carmine() {
		return "Carmine";
	}
}
