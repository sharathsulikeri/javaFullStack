class Sports{
	
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("the Memberes of cricketplayers");
		System.out.println("the total array of the cricketplayers :"+names.length);
	for(int index=0; index<names.length; index++)
	{
		System.out.println("total cricketplayers :"+names[index]);
	}
	}
	static void kabbadiTeamMembers(int[] jerseynos)
	{
		System.out.println( "the jersey numbers of kabbadi players");
		System.out.println("the total array of kabbadi players jerseynumbers :"+jerseynos.length);
		for (int index=0; index<jerseynos.length; index++)
		{
			System.out.println("total kabbadi players jersey numbers:"+jerseynos[index]);
		}
	}
	static void ludoTeamMobileNumber(long[] num)
	{
		System.out.println("start ludo team");
		System.out.println("start ludo team array length is:"+num.length);
		
		for(int i=0;i<num.length;i++)
			
		{
			System .out.println("Ludo Team Mobile Numbers are:"+num[i]);
			
		}
				System.out.println("End ludo team"); 
	}				
	static void footballTeamMembarySalary(double[] salaries)
	{
		System.out.println("the printing footballTeamMembarySalary");
		System.out.println("the total array of footballTeamMembarySalary :"+salaries.length);
		for(int index=0; index<salaries.length; index++)
		{
			System.out.println("the football team membary salary in lakh:"+salaries[index]);
		}
		    System.out.println("the end of salary");
			
	}
	static void hockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("the number of match");
		System.out.println("the total array of match :"+matches.length);
		for(int i=0;i<matches.length;i++)
			{
				System.out.println("the hockey total matches :"+matches[i]);
			}
			System.out.println("the end of the hockey matches");
		}
		static void kokoTeamMembersCountryCode(long[] name)
			{
			System.out.println("koko team country code");
			System.out.println("the total array of koko team country code :"+name.length);
			for(int i=0; i<name.length; i++)
			{
				System.out.println("the koko team members country code :"+name[i]);
			}
			System.out.println("the end of koko team coutry code");
		}
		static void lagoriTeamMembersAlive(boolean[] namees)
		{
			System.out.println("the logori team alive");
			System.out.println("the logori team alive :"+namees.length);
			for(int i=0; i<namees.length; i++)
			{
				System.out.println("the logori team is a alive :"+namees[i]);
			}
		}
}
