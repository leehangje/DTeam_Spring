package com.dteam.app.command;

import org.springframework.ui.Model;

import com.dteam.app.dao.ANDao;

public class AResetPwCommand implements ACommand {

	@Override
	public void execute(Model model) {
		String member_id = (String)model.asMap().get("member_id");
		String member_pw = (String)model.asMap().get("member_pw");
	      
	    ANDao adao = new ANDao();
	    int succ = adao.anResetPw(member_id, member_pw);	//��ġ�ϴ� ���̵� ��ȯ
	      
	    model.addAttribute("anResetPw", succ);
	}
}
