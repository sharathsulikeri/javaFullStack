class TrimmerRunner
{
	public static void main(String[] args)
	{
		System.out.println(Trimmer.colour);
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.warranty);
		System.out.println(Trimmer.totalsettings.length);
		
		for(int i=0; i<Trimmer.totalsettings.length; i++);
		{
		 int set=Trimmer.totalsettings[i];
		 System.out.println("total settings are :"+set);
		}
		Trimmer.colour="blue";
	    Trimmer.brand="sony";
	    Trimmer.price=500;
	    Trimmer.warranty=5.6d;
	    Trimmer.totalsettings[0]=1;
	    Trimmer.totalsettings[1]=5;
	    Trimmer.totalsettings[2]=4;
	    Trimmer.totalsettings[3]=6;
	    Trimmer.totalsettings[4]=8;
	
	
	    System.out.println(Trimmer.brand);
	    System.out.println(Trimmer.colour);
	    System.out.println(Trimmer.price);
	    System.out.println(Trimmer.warranty);
	    System.out.println(Trimmer.totalsettings.length);
	
	       for(int i=0;i<Trimmer.totalsettings.length; i++)
	         {
		int set=Trimmer.totalsettings[i];
		System.out.println("total settings are :"+set);
			 }
	}
}
		