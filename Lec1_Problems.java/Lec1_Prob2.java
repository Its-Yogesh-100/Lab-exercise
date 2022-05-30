 class Pattern_A{
    // Function to demonstrate printing pattern
    public static void printTriangle()
    {
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<5; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=5-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
  
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            // ending line after each row
            System.out.println();
        }
    }
     
}


class Pattern_B
{
	public static void reverse()
	{
		int rows = 6; // Number of Rows we want to print
		
		
		
		//Printing the pattern
		for (int i = 1; i <= 5; i++)
		{
		for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
		for (int j = i; j <=5; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		}
	
	}
