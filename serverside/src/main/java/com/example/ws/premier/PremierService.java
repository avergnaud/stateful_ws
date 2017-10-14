package com.example.ws.premier;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.example.com/ws/Premier")
public interface PremierService {

	/**
	 * say hello to someone
	 * @param name
	 * @return
	 */
	@WebMethod
	public String metAJourHistorique(String message);

}
