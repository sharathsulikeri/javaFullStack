class Card
{
	static String type;
	static int weight;
	static double width;
	static int price;
    static String[] colour;
	
    static void displayDetails()
	{
	System.out.println(type);
	System.out.println(weight);
	System.out.println(width);
	System.out.println(price);
	if(colour!=null)// null pointer exp
	{
		    System.out.println("Array is pointing to memory");
             for (int card=0; card<colour.length; card++)
			 { 
		String ref=colour[card];
		System.out.println(ref +"colour");
	           }

   else 
       {
	   System.out.println("Array is not pointing to memory");
        }
    }
} 