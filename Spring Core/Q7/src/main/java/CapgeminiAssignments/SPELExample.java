package CapgeminiAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPELExample {
    public static void main(String[] args) {
    	ExpressionParser parser = new SpelExpressionParser();  
    	  
		
		  Expression exp = parser.parseExpression("'SPEL example'"); String message =
		  (String) exp.getValue();
		  
		  Expression exp1 = parser.parseExpression("'SPEL example'.toUpperCase()");
		  String message1 = (String) exp1.getValue();
		  
		  Expression exp2 = parser.parseExpression("'SPEL example'.toLowerCase()");
		  String message2 = (String) exp2.getValue();
		  
		  Expression exp3 = parser.parseExpression("'SPEL example'.bytes.length"); int
		  len=(Integer) exp3.getValue();
		  
		  System.out.println(message+"\n"+message1+"\n"+message2+"\n"+len+"\n\n");
		   
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Example example=(Example) context.getBean("example");
    	System.out.println(example.toString());
    }
}
