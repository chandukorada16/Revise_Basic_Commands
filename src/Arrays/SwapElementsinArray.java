package Arrays;
import java.util.*;
public class SwapElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={18, 11, 35, 10, 76, 12, 44, 89,76};
		for(int i=0;i<a.length-1;i=i+2)
		{
			a[i]=a[i]+a[i+1]-(a[i+1]=a[i]);
		}
		System.out.println(Arrays.toString(a));

	}

}
