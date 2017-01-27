public class BiggestNumber
{
	static int[]arra;
	
	public static void main(String[]args)
	{
		arra = new int[100];
		fillArray();
		
		System.out.print("For the numbers");
		printArray();
		System.out.print("The biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < arra.length; i++)
			arra[i] = (int)(Math.random()*10)+1;
	}
	
	public static void printArray()
	{
		for(int nums : arra)
			System.out.print(nums + " ");
	}
	
	public static int getBiggest()
	{
		int max = 0;
		
		for(int nums : arra)
			max = Math.max(nums, max);
		
		return max;
	}
}