package com.practicajsf.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloworld", eager= true)
@RequestScoped

public class Helloworld {
	@ManagedProperty(value="#{message}")
	private Message messageBean;

	private String message;
	
	public void HelloWorld(){
	     System.out.println("Helloworld started!");
	}

	public String getMessage(){
	     if(messageBean != null){
	          message= messageBean.getMessage();	
	     }
	     return message;
	}
	public void setMessageBean(Message message){
	     this.messageBean = message;
	}

}
