package Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,1,2};
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
