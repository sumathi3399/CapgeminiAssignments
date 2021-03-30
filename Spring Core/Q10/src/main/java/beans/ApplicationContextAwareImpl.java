package beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareImpl implements ApplicationContextAware{
    private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}
	
	public void displayStudentDetails(){
        Student student = (Student)applicationContext.getBean("student");
        System.out.println("Name: "+student.getName());
        System.out.println("Roll No: "+student.getRollNo());
    }
}
