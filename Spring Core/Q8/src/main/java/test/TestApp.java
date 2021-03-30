package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Annotations_Example;
import beans.MyConfiguration;

public class TestApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();

		System.out.println("Hashcode of the instance:");
		Annotations_Example mb1 = ctx.getBean(Annotations_Example.class);
		System.out.println(mb1.hashCode());

		Annotations_Example mb2 = ctx.getBean(Annotations_Example.class);
		System.out.println(mb2.hashCode());

		ctx.close();
	}
}
