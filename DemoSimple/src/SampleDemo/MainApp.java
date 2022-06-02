package SampleDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.Xml");
		HelloWorld obj=(HelloWorld)context.getBean("Hello World");
		obj.getMessage();

	}

}
