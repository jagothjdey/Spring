package spring.basic.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	// Created Mock
	@Mock
	SomeCdiDao daoMock;
	
	//Inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	
	@Test
	public void testBasicScenario1() {
		//when daoMock.getData() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4, business.findMax());
	}
	
	@Test
	public void testBasicScenario2() {
		//when daoMock.getData() method is called return int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findMax());
	}

}
