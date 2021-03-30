package com.sumathi.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s = context.getBean(Samsung.class);
    	s.config();
    	Samsung s1 = new Samsung();
    	s1.config();
    }
}
