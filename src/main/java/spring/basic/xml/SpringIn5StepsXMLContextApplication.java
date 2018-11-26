package spring.basic.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO xmlpersonDao = applicationContext.getBean(XmlPersonDAO.class);
			
			logger.info("Size of beans loaded -> {}",applicationContext.getBeanDefinitionNames().length);
			
		}
	}
}
