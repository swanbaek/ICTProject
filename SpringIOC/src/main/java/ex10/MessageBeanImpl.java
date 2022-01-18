package ex10;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	
	//property
	private String greeting;
	private String name;
	
	private Outputter out;
	
	public MessageBeanImpl(Outputter out) {
		this.out = out;
	}
	@Override
	public void sayHello() {
		
		try {
			out.output(greeting+" "+name+"~~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void sayHi(String... args) {
		try {
			out.output(greeting);
			if(args!=null) {
				for(String name: args) {
					out.output(name+",");
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//setter, getter---------
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Outputter getOut() {
		return out;
	}
	public void setOut(Outputter out) {
		this.out = out;
	}
	

}
