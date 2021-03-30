package capgeminiAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Question question1=(Question) context.getBean("question1");
        Question question2=(Question) context.getBean("question2");
        
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question1);
        questions.add(question2);
        ArrayList<String> l = new ArrayList();
        HashSet<String> h= new HashSet();
        HashMap<String,String>h1= new HashMap();
        for(Question w: questions) {
        	h1.put(w.question,w.answer);
        
        }
        for(Question q: questions) {
        	l.add(q.answer);
        
        }
        for(Question a: questions) {
        	h.add(a.answer);
        }
        
        System.out.println("Answers in form of List");
        System.out.println(l);
        System.out.println("------------------------------------");
        System.out.println("Answers in form of set");
        System.out.println(h);
        System.out.println("------------------------------------");
        System.out.println("Answers in form of Map");
        System.out.println(h1);
        System.out.println("------------------------------------");
        System.out.println("Printing all Question and answers");
        
        for(Question q: questions)
        {
        	System.out.println(q.getQuestionId()+"  "+q.getQuestion()+"\n"+q.getAnswers());
        }
         
	}

}
