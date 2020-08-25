package com.dteam.app.dto;

public class MemberDTO {
	String id, pw, nickname, tel, addr, latitude, logitude, grade, name;
	
	
	// 로그인할때 비밀번호 없이 멤버변수 보낼때
	public MemberDTO(String id, String pw, String nickname, String tel, String addr, String latitude, String logitude,
			String grade, String name) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.tel = tel;
		this.addr = addr;
		this.latitude = latitude;
		this.logitude = logitude;
		this.grade = grade;
		this.name = name;
	}
	
	
	// 데이터베이스에 멤버변수 추가할때
	public MemberDTO(String id, String nickname, String tel, String addr, String latitude, String logitude,
			String grade, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.nickname = nickname;
		this.tel = tel;
		this.addr = addr;
		this.latitude = latitude;
		this.logitude = logitude;
		this.grade = grade;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLogitude() {
		return logitude;
	}


	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	
	
	
}
