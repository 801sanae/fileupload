package com.bit2015.fileupload.controller;

import org.springframework.web.multipart.MultipartFile;

public class BoardVo {
	private String email;
	private String name;
	private MultipartFile uploadFile;
	
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
}
