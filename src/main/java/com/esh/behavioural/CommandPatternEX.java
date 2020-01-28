package com.esh.behavioural;
interface FileSystem{
	void closeFile();
	void openFile();
	void readFile();
}
class UnixFileSystem implements FileSystem{
	@Override
	public void closeFile() {
		System.out.println("Closing file");
	}

	@Override
	public void openFile() {
		System.out.println("Opening file");
	}

	@Override
	public void readFile() {
		System.out.println("Reading file");
	}
}

class WindowsFileSystem implements FileSystem{

	@Override
	public void closeFile() {
		System.out.println("Closing file windows");
	}

	@Override
	public void openFile() {
		System.out.println("Opening file in windows");
		
	}

	@Override
	public void readFile() {
		System.out.println("Reading file");
	}
}

interface Command{
	void execute();
}

class FileInvoker{
	void execute(Command command){
		command.execute();
	}
}

class ReadFileCommand implements Command{
	private FileSystem fileSystem;

	ReadFileCommand(FileSystem fileSystem){
		this.fileSystem = fileSystem;
	}
	@Override
	public void execute() {
		fileSystem.readFile();
	}
}
public class CommandPatternEX {
	public static void main(String[] args) {
		WindowsFileSystem wFileSystem = new WindowsFileSystem();
		ReadFileCommand fileCommand = new ReadFileCommand(wFileSystem);
		FileInvoker fileInvoker = new FileInvoker();
		fileInvoker.execute(fileCommand);
	}
}
