package com.esh.structural;

class CommandExecutor{
	void runCmd(String cmd){
		System.out.println("Running command: " + cmd);
	}
}

class ComandExecutorProxy{
	private CommandExecutor executor = new CommandExecutor(); 
	void runCmd(String cmd) throws Exception{
		if(cmd.equals("ls")){
			throw  new Exception("Cannot execute ls command");
		}else{
			executor.runCmd(cmd);
		}
	}
}
public class ProxyEx {
	public static void main(String[] args) throws Exception {
		ComandExecutorProxy proxy = new ComandExecutorProxy();
		proxy.runCmd("ps");
		proxy.runCmd("ls");
	}
}
