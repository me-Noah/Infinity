public class Pattern{
	public static void main(String[] args) {
	pattern6(4);
	}					
	//pattern6
		public static void pattern6(int num)
		{
			for(int row=1;row<=num;row++)
			{
				int noOfSpaces = num-row;
				{
					for(int s=1;s<=noOfSpaces;s++)
					{
						System.out.print("  ");
					}
				}
				for(int col=1;col<=row;col++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
						
		}
}
