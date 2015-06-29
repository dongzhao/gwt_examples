package com.dzhao.exams.gwt.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("firstService")
public interface FirstService extends RemoteService{
	
	public String sayHello(String name);

}
