package com.dteam.app.controller;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.http.HttpServletRequest;
import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.dteam.app.command.ACommand;
import com.dteam.app.command.AJoinCommand;
import com.dteam.app.command.ALoginCommand;

@Controller
public class AController {
	
	ACommand command;
	
	@RequestMapping(value="/anLogin", method = {RequestMethod.GET, RequestMethod.POST}  )
	public String anLogin(HttpServletRequest request, Model model){
		System.out.println("anLogin()");
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 		
		
		String member_id = (String) request.getParameter("member_id");
		String member_pw = (String) request.getParameter("member_pw");
		
		System.out.println(member_id);
		System.out.println(member_pw);
		
		model.addAttribute("member_id", member_id);
		model.addAttribute("member_pw", member_pw);
		
		command = new ALoginCommand();
		command.execute(model);
		
		return "anLogin";
	}

	@RequestMapping(value="/anJoin", method = {RequestMethod.GET, RequestMethod.POST}  )
	public String anJoin(HttpServletRequest request, Model model){
		System.out.println("anJoin()");
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 		
		
		String member_id = (String) request.getParameter("member_id");
		String member_pw = (String) request.getParameter("member_pw");
		String member_nickname = (String) request.getParameter("member_nickname");
		String member_tel = (String) request.getParameter("member_tel");
		String member_addr = (String) request.getParameter("member_addr");
		String member_latitude = (String) request.getParameter("member_latitude");
		String member_longitude = (String) request.getParameter("member_longitude");
		String member_name = (String) request.getParameter("member_name");
		
		System.out.println(member_id);
		System.out.println(member_pw);
		System.out.println(member_nickname);
		System.out.println(member_tel);
		System.out.println(member_addr);
		System.out.println(member_latitude);
		System.out.println(member_longitude);
		System.out.println(member_name);
		
		model.addAttribute("member_id", member_id);
		model.addAttribute("member_pw", member_pw);
		model.addAttribute("member_nickname", member_nickname);
		model.addAttribute("member_tel", member_tel);
		model.addAttribute("member_addr", member_addr);
		model.addAttribute("member_latitude", member_latitude);
		model.addAttribute("member_longitude", member_longitude);
		model.addAttribute("member_name", member_name);
		
		command = new AJoinCommand();
		command.execute(model);
		
		return "anJoin";
	}

}
