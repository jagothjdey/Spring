package spring.basic.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	public int findMax() {
		int max = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();
		for(int i:data) {
			max = Math.max(max,i);
		}
		return max;
	}
}
