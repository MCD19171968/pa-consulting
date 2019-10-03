package uk.ac.belfastmet.examples;

public class Names {

	private String hello;
	private String name;
	
	public static int helloName;
	

	public Names(String hello, String name) {
		super();
		this.hello = hello;
		this.name = name;
		helloName++;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getHelloName() {
	
		return helloName;
	
	}
	
	
}



