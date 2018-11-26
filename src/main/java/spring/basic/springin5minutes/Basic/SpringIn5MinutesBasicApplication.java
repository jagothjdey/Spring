package spring.basic.springin5minutes.Basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.basic.springin5minutes.Basic")
public class SpringIn5MinutesBasicApplication {
	public static void main(String[] args) {
		// SpringApplication.run(SpringIn5MinutesApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5MinutesBasicApplication.class);) {
			BinarySearchImp binarysearchImp1 = applicationContext.getBean(BinarySearchImp.class);
			BinarySearchImp binarysearchImp2 = applicationContext.getBean(BinarySearchImp.class);
			System.out.println(binarysearchImp1);
			System.out.println(binarysearchImp2);
			System.out.println(binarysearchImp1.binarySearch(new int[] { 1, 2, 3 }, 2));
		}
	}
}