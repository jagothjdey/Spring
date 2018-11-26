	//Constructor Injection
//	public BinarySearchImp(SortAlgorithm sortalgorithm) {
//		super();
//		this.sortalgorithm = sortalgorithm;
//	}
	
	
//	Setter injection or No injection
//	public void setSortalgorithm(SortAlgorithm sortalgorithm) {
//		this.sortalgorithm = sortalgorithm;
//	}

//____________________________________________________________________________________________________________________________

package spring.basic.springin5minutes.Basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImp {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortalgorithm;
	
	public int binarySearch(int[] numbers, int numbertosearch) {
		int[] sortedNumbers = sortalgorithm.sort(numbers);
		return 3;
	}
	
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("pre-destroy");
//	}
////
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("post-construct");
//	}
}
