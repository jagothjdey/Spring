package spring.basic.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

	public int[] getData() {
		return new int[] {1,2,3,4,5};
	}
}