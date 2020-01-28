package com.esh.behavioural;

interface TVState{
	void doAction();
}
class TVContext{
	TVState tvState;

	public void setTvState(TVState tvState) {
		this.tvState = tvState;
	}
		
	public void doAction(){
		tvState.doAction();
	}
}

class TVONState implements TVState{
	@Override
	public void doAction() {
		System.out.println("TV is on");
	}
}

class TVOffState implements TVState{
	@Override
	public void doAction() {
		System.out.println("TV is off");
	}
}

public class StatePatternEX {
	public static void main(String[] args) {
		TVContext context = new TVContext();
	
		context.setTvState(new TVONState());
		context.doAction();
		
		context.setTvState(new TVOffState());
		context.doAction();
	}
}
