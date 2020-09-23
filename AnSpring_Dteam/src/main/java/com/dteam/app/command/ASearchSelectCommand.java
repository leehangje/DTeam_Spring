package com.dteam.app.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.dteam.app.dao.ANDao;
import com.dteam.app.dto.MdDto;

public class ASearchSelectCommand implements ACommand {

	@Override
	public void execute(Model model) {
		ANDao adao = new ANDao();	
		
		 
		ArrayList<MdDto> mdDtos = adao.anSearchSelect();
		
		model.addAttribute("anSearchSelect", mdDtos);
		
	}

}
