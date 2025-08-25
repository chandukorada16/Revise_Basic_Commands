package Numbers;
import java.io.*;

public class SumofRangeBwNumbers {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		String s1=br.readLine();
		int num1=Integer.parseInt(s);
		int num2=Integer.parseInt(s1);
		int sum=0;
		for(int i=num1;i<=num2;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		

	}

}
