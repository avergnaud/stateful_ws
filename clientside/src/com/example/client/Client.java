package com.example.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import com.example.ws.premier.PremierService;
import com.example.ws.second.SecondService;

public class Client {

	public static void main(String[] args) throws MalformedURLException {

		List<?> cookie = null;

		/* init du client du premier service */
		URL url = new URL("http://localhost:8080/PremierService?wsdl");
		QName qname = new QName("http://www.example.com/ws/Premier", "PremierService");
		Service service = Service.create(url, qname);
		PremierService premierServicePort = service.getPort(PremierService.class);
		
		/* init du client du deuxième service */
		URL urlSecond = new URL("http://localhost:8080/SecondService?wsdl");
		QName qnameSecond = new QName("http://www.example.com/ws/Second", "SecondService");
		Service serviceSecond = Service.create(urlSecond, qnameSecond);
		SecondService second = serviceSecond.getPort(SecondService.class);
		
		/* premier appel */
		String historique = premierServicePort.metAJourHistorique("hello");
		System.out.println(historique);
		
		/* pour le premier appel, on récupère le cookie envoyé dans la réponse :
		 * http.set_cookie: JSESSIONID=pMRIL2T_echktcfQQTDcjUDrP-utjQq5zKJIUsGX.ubuntu-cr70-2m-cx70-2oc-cx70-2od; path=/ */
		Map<String, Object> responseContext = ((BindingProvider) premierServicePort).getResponseContext();
		@SuppressWarnings("unchecked")
		Map<String, ?> responseHeader = (Map<String, ?>) responseContext.get(MessageContext.HTTP_RESPONSE_HEADERS);
		cookie = (List<?>) responseHeader.get("set-cookie");
		
		/* appels suivants : on passe le cookie */
		Map<String, Object> requestContext = ((BindingProvider) premierServicePort).getRequestContext();
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, Collections.singletonMap("cookie", cookie));
		historique = premierServicePort.metAJourHistorique("world");
		System.out.println(historique);

		Map<String, Object> requestContextSecond = ((BindingProvider) second).getRequestContext();
		requestContextSecond.put(MessageContext.HTTP_REQUEST_HEADERS, Collections.singletonMap("cookie", cookie));
		int nb = second.size();
		System.out.println(nb);
	}
}
