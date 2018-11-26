package spring.basic.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.basic.properties")
@PropertySource("classpath:app.properties")
public class SpringIn5MinutesPropertiesApplication {
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5MinutesPropertiesApplication.class);) {
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.getServiceurl());
		}
	}
}