package com.spring.ex;

import java.io.Console;
import java.util.List;

import javax.inject.Inject;
import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.compiler.ast.Keyword;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.ex.Service.CarmineService;
import com.spring.ex.Service.CreplyService;
import com.spring.ex.Service.MemberService;
import com.spring.ex.dto.Carmine;
import com.spring.ex.dto.Creply;
import com.spring.ex.dto.Member;
import com.spring.ex.dto.Page;

/*�޽��� Request processing failed; nested exception is org.mybatis.spring.MyBatisSystemException: 
	nested exception is org.apache.ibatis.exceptions.PersistenceException:
	500 ���� 
	1.mapper�� ���ǵ� namespace ��Ī�� ���� application ���� �ߺ� �� ���
	2.mapper id�� Ʋ�� ���
	3.Parameter bean�� field ���� Ʋ�� ���
	4.sql.xml���� ���ǵ� namespace�� DAO���� ȣ���ϴ� namespace�� �ٸ� ���
	5.mapper�� ���ǵǾ� ���� �ʰų� ���縵�� Ʋ�� ���
	*/
@Controller
public class MainController {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MainController.class);

	@Inject
	MemberService service;
	@Inject
	CarmineService Cservice; // ī���� ����
	@Inject
	CreplyService Creplyservice; //���

	
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String Main() throws Exception{
		return "Main";
	}

	// �α���
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String Login(Member vo, HttpServletRequest req,RedirectAttributes rttr) throws Exception {
		logger.info("post login");

		HttpSession session = req.getSession();

		Member login = service.login(vo);

		if (login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg",false);
		} else {
			session.setAttribute("member", login);
		}

		return "redirect:/main";
	}

	// �α׾ƿ�
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		logger.info("get logout");

		session.invalidate();

		return "Main";
	}
	
	//ȸ�� Ż�� get
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public void getdelete() throws Exception{
		logger.info("delete");
	}
	
	//ȸ�� Ż�� post
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String postdelete(HttpSession session, Member vo,RedirectAttributes rttr)throws Exception {
		logger.info("Ż��");
		
		Member member =(Member)session.getAttribute("member");
		
		String oldPass = member.getPw();
		String newPass = vo.getPw();
		
		if(!(oldPass.equals(newPass))) {
			rttr.addFlashAttribute("msg",false);
			return "redirect:/delete";
		}
		
			service.delete(vo);
			
			session.invalidate();
		return "redirect:/main";
		
	}

	// ȸ������ get
	@RequestMapping(value = "/Join", method = RequestMethod.GET)
	public void getJoin() throws Exception {
		logger.info("get register");
		System.out.println(org.springframework.core.SpringVersion.getVersion());
	}

	// ȸ������ post
	@RequestMapping(value = "/Join", method = RequestMethod.POST)
	public String getJoin(Member vo) throws Exception {
		logger.info("post resister");

		

		service.register(vo);
		
		return "Join";
	}

	// ȸ��Ȯ��

	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public int postIdCheck(HttpServletRequest req) throws Exception {
		
		logger.info("post idCheck");
		String id= req.getParameter("id");
		Member idCheck = service.idCheck(id);
		
		int result =0;
		
		if(idCheck != null) {
			result = 1;
		}

		return result;
	}

	// �Խñ� �ۼ�
	@RequestMapping(value = "/Write", method = RequestMethod.GET)
	public String getWrite() {
		logger.info("������ Ȯ�ο� ���� �κ�");
		return "Write";
	}
	// �Խñ� �ۼ�

	@RequestMapping(value = "/Write", method = RequestMethod.POST)
	public String postWrite(Carmine vo) throws Exception {
		Cservice.Write(vo);
		logger.info("������ Ȯ�ο�");
		return "Carmine";
	}

	// �Խù� ��ȸ
	@RequestMapping(value = "/View", method = RequestMethod.GET)
	public void getView(@RequestParam("bno") int bno, Model model,Carmine vo2 ) throws Exception {

		Carmine vo = Cservice.view(bno);
		Cservice.plusCnt(vo2.getBno());
		
		model.addAttribute("view", vo);
		
		
		List<Creply> Creply=null;
		Creply=Creplyservice.list(bno);
		model.addAttribute("Creply",Creply);
	}

	// �Խù� ����
	@RequestMapping(value = "/Modify", method = RequestMethod.GET)
	public void getModfiy(@RequestParam("bno") int bno, Model model) throws Exception {

		Carmine vo = Cservice.view(bno);

		model.addAttribute("view", vo);
	}

	//�Խù� ����
	@RequestMapping(value = "/Modify", method = RequestMethod.POST)
	public String postModfiy(Carmine vo) throws Exception {
		Cservice.Modify(vo);
		return "redirect:/View?bno="+vo.getBno();
	}
	
	//�Խñ� ����
	@RequestMapping(value="/Delete",method =  RequestMethod.GET)
	public String getDelete(@RequestParam("bno") int bno) throws Exception{
		Cservice.Delete(bno);
		return "redirect:/Carmine";
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
	@RequestMapping(value = "/Carmine", method = RequestMethod.GET)
	public /*String*/void Carmine(Model model,@RequestParam("num") int num,
			@RequestParam(value="searchType",required = false,defaultValue ="title" )String searchType,
			@RequestParam(value="keyword",required = false,defaultValue = "") String keyowrd) throws Exception {
		
		
		
		Page page =new Page();
		
		page.setNum(num);
		page.setCount(Cservice.searchCount(searchType,keyowrd));
		
		List<Carmine> list =null;
		list =Cservice.listPage(page.getDisplayPost(), page.getPostNum(), searchType, keyowrd);
		
		model.addAttribute("list",list);
	
		model.addAttribute("page",page);
		model.addAttribute("select",num);
		
	
		
		page.setSearchType(searchType);
		page.setKeyword(keyowrd);
	
	}
	
	

}
