package com.practicajsf.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager= true)
@RequestScoped

public class Message {
	private String message= "Hola mundo desde message!";

	public String getMessage(){
	     return message;
	}
	public void setMessage(String message){
	     this.message = message;
	}

}
