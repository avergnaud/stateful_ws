package com.example.ws.second;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.example.com/ws/Second")
public interface SecondService {

	/**
	 * say hello to someone
	 * @param name
	 * @return
	 */
	@WebMethod
	public Integer size();

}
