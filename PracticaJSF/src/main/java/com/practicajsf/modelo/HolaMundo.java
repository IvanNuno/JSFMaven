package com.practicajsf.modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="HolaMundito", eager=true)
@RequestScoped
public class HolaMundo {
	
	public HolaMundo() {
		
	}
	
	public String getHolaMundo() {
		return "Hola mundito";
	}
	
}
