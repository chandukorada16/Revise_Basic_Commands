package Arrays;

public class NonRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 2, 3, 2, 1, 3, 4, 5 };
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				c++;
			}
			if(c==1)
				System.out.println(a[i]+" ");
				
		}

	}

}
