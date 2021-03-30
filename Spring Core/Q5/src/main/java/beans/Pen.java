package beans;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;

@Controller
public class Pen implements Drawing {

	public void draw() {
		System.out.println("Pen: I'm not Erasable!");

	}

}
