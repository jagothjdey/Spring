package spring.basic.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SpringIn5MinutesComponentApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5MinutesComponentApplication.class);
	
	public static void main(String[] args) {
		// SpringApplication.run(SpringIn5MinutesApplication.class, args);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5MinutesComponentApplication.class);
		ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
		LOGGER.info("{}",componentDao.getComponentjdbcconnection());
		applicationContext.close();
	}
}