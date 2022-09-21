public class Test 
{
	public static void main(String[] args) {

		int [] intarray = {12,28,15,75,25,12};
		int max = 0;

		for (int i=0 ; i < intarray.length ; i++)
		{
		
			if (max < intarray[i]){
				max = intarray[i];
				System.out.println(max);
			}
		}
		System.out.println(max);
	}
}