package com.dzhao.exams.gwt.server;

import com.dzhao.exams.gwt.client.rpc.FirstService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class FirstServiceImpl extends RemoteServiceServlet implements FirstService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 353044561588865872L;

	@Override
	public String sayHello(String name) {
		return "Hello "+ name + ", welcome to my world!";
	}

}
