package beans;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {
	@Bean
    public Annotations_Example annotations_example() {
	return new Annotations_Example();
    }

}
