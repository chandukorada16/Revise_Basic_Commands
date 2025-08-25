package Arrays;

public class SumMatchingPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,4,6,3,2};
		int sum=5;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
					System.out.println(a[i]+"+"+a[j]+"="+sum);
			}
		}

	}

}
