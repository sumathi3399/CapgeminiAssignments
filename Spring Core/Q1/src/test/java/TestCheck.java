import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import capgeminiAssignments.Address;
import capgeminiAssignments.Customer;

public class TestCheck {
	String name;
	int id,number;
	Address address;
	
	@Test
	public void testCustomerName()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	    Customer customer=(Customer) context.getBean("customer");
	    name=customer.getCustomerName();
	    assertEquals(name,"Arun");
	}
	
	@Test
	public void testCustomerId()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	    Customer customer=(Customer) context.getBean("customer");
	    id=customer.getCustomerId();
	    assertEquals(id,1);
	}
	
	@Test
	public void testCustomerNumber()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	    Customer customer=(Customer) context.getBean("customer");
	    number=customer.getCustomerNumber();
	    assertEquals(number,1435697482);
	}
	
}
