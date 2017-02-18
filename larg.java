
public class larg {
	public static void main(String[] args)
	{
		int arr[]={2,4,6,8};
		int l=arr[0];

		for(int i=1;i<4;i++)
		{
		if(l<arr[i])
		{
			l=arr[i] ;
		}
		
		}
		System.out.println(l);
		
	}
	
}
