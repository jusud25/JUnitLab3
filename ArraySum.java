
public class ArraySum {
	
	public int sumOfArray (Integer[] a,int index) {

		while(index<=0)
			return a[index];
		return sumOfArray(a, index-1);
	}
}
