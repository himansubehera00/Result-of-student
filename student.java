import java.util.Scanner;
import java.util.*;
/* 
 * Marks can be in between 1 to 100
 * Passing marks is 40 or above out of 100
 */
class cook
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students: ");
		int N=sc.nextInt();
		TreeMap<Integer,Integer> map=new TreeMap<>();
		int k=1;
		for(int i=0;i<N;i++)
		{   System.out.println(k+": "+"Enter student Roll Number: ");
		int Roll_No=sc.nextInt();
		
		System.out.println(k+": "+"Enter student Marks");
		int marks=sc.nextInt();
			map.put(Roll_No, marks);
			k++;
		}
		String[] result=new String[N];
		Set keyset=map.keySet();
		Object[] arr=keyset.toArray();
		for(int i=0;i<arr.length;i++)
		{
		   if(map.get(arr[i])<40)
		   {
			   result[i]="FAIL";
		   }
		   else
		   {
			  result[i]="PASS";
		   }
		}
		 int j=0;
		 System.out.println("Roll Number"+"     "+"Marks"+"     "+"PASS/FAIL");
			 for(Map.Entry m:map.entrySet()){  
				  
			       System.out.println(m.getKey()+"                "+m.getValue()+"     "+"     "+result[j]);   
			       j++;
			      }    
	
		
		
		
	}
}