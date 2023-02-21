package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface iNumbers {

	List<Integer> removeZero(ArrayList<Integer> num);
	
	void sortInAsending(List<Integer> nonZero);
	void sortInDesending(List<Integer> nonZero);
}
