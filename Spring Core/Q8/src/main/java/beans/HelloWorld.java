package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean{ 
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Instantiating......");
        System.out.println( 
            "Bean HelloWorld has been "
            + "instantiated and I'm "
            + "the init() method");
	}
    // This method executes 
    // when the spring container 
    // is closed 
    public void destroy() throws Exception 
    { 
    	System.out.println("\nDestroying......");
        System.out.println( 
            "Conatiner has been closed "
            + "and I'm the destroy() method"); 
    }	 
} 