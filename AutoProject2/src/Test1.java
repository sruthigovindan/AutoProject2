
public class Test1 {

	public static void main()
	{
		int i=0;
		for (i=1;i<100;i++)
		{
			System.out.println("i..."+i);
     	    int j=i+1000;

			System.out.println("j..."+j);

			for (int k=0;k<100;k++)
			{
				System.out.println("j..."+j);
			}

			int k=j+15;
			System.out.println("k...");

			
		}
	}
}
