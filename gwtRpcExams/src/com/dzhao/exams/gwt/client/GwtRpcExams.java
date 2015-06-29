package com.dzhao.exams.gwt.client;


import com.dzhao.exams.gwt.client.widget.FirstWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtRpcExams implements EntryPoint {

	private final FirstWidget firstWidget = new FirstWidget();
	public void onModuleLoad() {
		
		RootPanel.get().add(firstWidget);
	}
}
