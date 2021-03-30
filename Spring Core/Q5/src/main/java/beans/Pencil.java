package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Pencil implements Drawing {

	public void draw() {
		System.out.println("Pencil: I'm Erasable!");

	}

}
