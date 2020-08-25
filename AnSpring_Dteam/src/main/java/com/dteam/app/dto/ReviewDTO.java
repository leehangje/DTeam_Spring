package com.dteam.app.dto;

public class ReviewDTO {

	String md_name, review_content, member_id;
	int md_serial_number, review_scope;
	public ReviewDTO(String md_name, String review_content, String member_id, int md_serial_number, int review_scope) {
		super();
		this.md_name = md_name;
		this.review_content = review_content;
		this.member_id = member_id;
		this.md_serial_number = md_serial_number;
		this.review_scope = review_scope;
	}
	public String getMd_name() {
		return md_name;
	}
	public void setMd_name(String md_name) {
		this.md_name = md_name;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getMd_serial_number() {
		return md_serial_number;
	}
	public void setMd_serial_number(int md_serial_number) {
		this.md_serial_number = md_serial_number;
	}
	public int getReview_scope() {
		return review_scope;
	}
	public void setReview_scope(int review_scope) {
		this.review_scope = review_scope;
	}
	
	
	
}
