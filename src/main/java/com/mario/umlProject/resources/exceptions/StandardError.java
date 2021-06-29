package com.mario.umlProject.resources.exceptions;

import java.io.Serializable;

public class StandardError  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long itmeStamp;
	public StandardError(Integer status, String msg, Long itmeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.itmeStamp = itmeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getItmeStamp() {
		return itmeStamp;
	}
	public void setItmeStamp(Long itmeStamp) {
		this.itmeStamp = itmeStamp;
	}
	
	
}
