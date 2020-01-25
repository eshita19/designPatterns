package com.esh.structural;

class Volt{
	int voltage;
	Volt(int voltage){
		this.voltage = voltage;
	}
	
	public int getVoltage(){
		return voltage;
	}
}
class Socket{
	public Volt getVolatage(){
		return new Volt(120);
	}
}

class SocketAdaptor{
	private Socket socket = new Socket();
	
	public Volt get3Volt(){
		return convertToVolt(socket.getVolatage(), 40);
	}
	
	public Volt get12Volt() {
		Volt v= socket.getVolatage();
		return convertToVolt(v,10);
	}
	
	public Volt convertToVolt(Volt v, int i){
		return new Volt(v.getVoltage()/i);
	}
}
public class AdaptorEx {
	public static void main(String[] args) {
		SocketAdaptor adaptor = new SocketAdaptor();
		System.out.println(getVolt(adaptor, 3).voltage);
	}
	
	private static Volt getVolt(SocketAdaptor sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		}
		return null;
	}
}
