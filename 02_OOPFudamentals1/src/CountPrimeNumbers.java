
public class CountPrimeNumbers 
{
	public static void main(String[] args) 
	{
		CountPrimeNumbers cpn = new CountPrimeNumbers();
		cpn.printPrimeNumbers(9);
	}

	public void printPrimeNumbers(int range) 
	{
		String sequence = "";
		for (int i = 2; i <= range; i++) 
		{
			int count = 0;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{
					count++;
				}
			}
			if (count == 0) 
			{
				sequence = sequence + i + " ";
			}
		}
		System.out.println("The prime numbers upto " + range + " are " + sequence);
	}
}
