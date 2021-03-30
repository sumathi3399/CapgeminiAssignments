package org.sumathi.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;


public class Springdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				Triangle triangle =(Triangle) context.getBean("triangle");
				triangle.draw();
	}

}
