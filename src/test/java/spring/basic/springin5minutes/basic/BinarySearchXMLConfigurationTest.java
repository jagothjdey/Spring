package spring.basic.springin5minutes.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import spring.basic.springin5minutes.Basic.BinarySearchImp;
import spring.basic.springin5minutes.Basic.SpringIn5MinutesBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {
	
	//Get this bean from the context
	@Autowired
	BinarySearchImp binarySearchimp;
	
	@Test
	public void testBasicScenario() {
		// Call Method On Binary Search
		//check if the value is correct
		System.out.println(binarySearchimp.binarySearch(new int[] {}, 5));
		assertEquals(3,binarySearchimp.binarySearch(new int[] {}, 5));
	}

}
