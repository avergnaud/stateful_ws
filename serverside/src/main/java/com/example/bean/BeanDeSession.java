package com.example.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;

@SessionScoped
public class BeanDeSession implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> historique = new ArrayList<>();

	public String metAJour(String message) {
		historique.add(message);
		return historique.toString();
	}

	public Integer size() {
		return historique.size();
	}
}
