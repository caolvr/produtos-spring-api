package com.carol.produtosapi.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String field;
	private String msg;
	
	public StandardError(String field, String msg) {
		super();
		this.field = field;
		this.msg = msg;
	}

	public String getField() {
		return field;
	}

	public String getMsg() {
		return msg;
	}
	
}
