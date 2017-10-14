package com.example.ws.second;

import javax.inject.Inject;
import javax.jws.WebService;

import com.example.bean.BeanDeSession;

@WebService(serviceName = "SecondService", portName = "Second", name = "Second", endpointInterface = "com.example.ws.second.SecondService", targetNamespace = "http://www.example.com/ws/Second")
public class SecondServiceImpl implements SecondService {

	@Inject
	private BeanDeSession bean;

	@Override
	public Integer size() {
		return bean.size();
	}

}
