package com.dzhao.exams.gwt.client.widget;

import com.dzhao.exams.gwt.client.rpc.FirstService;
import com.dzhao.exams.gwt.client.rpc.FirstServiceAsync;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class FirstWidget extends Composite{

	private VerticalPanel vPanel = new VerticalPanel();
	private TextBox nameTxt ;
	private Label reponseLabel;
	private Button sendBtn;
	
	private final FirstServiceAsync firstService = GWT.create(FirstService.class);
	
	public FirstWidget(){
		initWidget(vPanel);
		
		this.nameTxt = new TextBox();
		this.reponseLabel = new Label();
		this.sendBtn = new Button("send to server");
		
		vPanel.add(nameTxt);
		vPanel.add(sendBtn);
		vPanel.add(reponseLabel);
		
		SendBtnClickHandler handler = new SendBtnClickHandler();
		sendBtn.addClickHandler(handler);
		
	}
	
	private class SendBtnClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			String name = nameTxt.getText();
			
			firstService.sayHello(name, new AsyncCallback<String>(){

				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onSuccess(String result) {
					reponseLabel.setText(result);
					
				}
			});
			
		}
		
	}

}
