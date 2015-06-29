package com.dzhao.exams.gwt.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FirstServiceAsync {

	void sayHello(String name, AsyncCallback<String> callback);

}
