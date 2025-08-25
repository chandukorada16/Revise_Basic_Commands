package Arrays;

public class SecondLargestNormal {

	public static void main(String[] args) {
		int a[]= {5,5,8,9,34,7,82,2,1};
		int max1=0,max2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			if(a[i]>max2 && a[i]<max1)
			{
				max2=a[i];
			}
		}
		System.out.println(max2);
		// TODO Auto-generated method stub

	}

}
