package com.application.states;

import javax.swing.JLabel;

import com.application.context.Application;
import com.application.gui.GUI;
import com.application.state.IState;

public class Saving implements IState {

	@Override
	public void running(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		System.out.println("Saving Now\n");
		myApp.setState(new Running());
		
		JLabel newText = new JLabel("Saving");
		myGui.add(newText);
	}

	@Override
	public void returnMessage(Application myApp, GUI myGui) {
		// TODO Auto-generated method stub
		JLabel newText = new JLabel("Your an Arse... I hate you !!!!");
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
