package spring.basic.springin5minutes.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSort implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		BubbleSort bubblesort = new BubbleSort();
		return bubblesort.sort(numbers);
	}

}
