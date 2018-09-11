package com.application.states;

import javax.swing.JLabel;

import com.application.context.Application;
import com.application.gui.GUI;
import com.application.state.IState;

public class Running implements IState {

	@Override
	public void running(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		System.out.println("Running Now\n");
		myApp.setState(new Saving());
		
		JLabel newText = new JLabel("Running");
		myGui.add(newText);
	}

	@Override
	public void returnMessage(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		JLabel newText = new JLabel("Your in the running state");
		myGui.add(newText);
	}

	@Override
	public void reqData(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dataRecieved(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timeEvent(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		
	}



}
