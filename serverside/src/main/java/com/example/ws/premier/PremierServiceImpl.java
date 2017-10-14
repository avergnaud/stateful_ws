package com.example.ws.premier;

import javax.inject.Inject;
import javax.jws.WebService;

import com.example.bean.BeanDeSession;

@WebService(serviceName = "PremierService", portName = "Premier", name = "Premier", endpointInterface = "com.example.ws.premier.PremierService", targetNamespace = "http://www.example.com/ws/Premier")
public class PremierServiceImpl implements PremierService {

	@Inject
	private BeanDeSession bean;

	@Override
	public String metAJourHistorique(String message) {
		return bean.metAJour(message);
	}

}
