//Rotate An Array counterwise
public class a28 {

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6};
		int temp[]=new int[a.length];
		int d=3,j=0,i;
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]>d)
			{
				temp[j++]=a[i];
			}
		}
		for(i=0; i<a.length; i++)
		{
			if(a[i]<=d)
			{
				temp[j++]=a[i];
			}
		}
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<temp.length; j++){
				a[i] = temp[i];
			}
			System.out.print(a[i] + " ");
		}	
		
	}

}