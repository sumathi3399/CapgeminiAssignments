package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotations_Example {
	public Annotations_Example()
	{
		System.out.print("Multiplication: ");
	}
	
	@PostConstruct
	private void init() {
		System.out.println("a x b");
	}

	@PreDestroy
	private void close() {
		System.out.println("ab");
	}
}
