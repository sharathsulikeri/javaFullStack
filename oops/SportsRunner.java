class SportsRunner{
	public static void main(String[] args){
		
		System.out.println("the players name ");
		String[] names={"sachin","rahul","virat","dhoni","raina","rohit","dravid","ab de"};
		Sports.cricketTeamMembers(names);
		
		System.out.println("the kabbadi players jersey numbers");
		int[] jerseynos={01,02,03,04,05,06,07};
		Sports.kabbadiTeamMembers(jerseynos);
		
		System.out.println("the ludo membersmobile numbers");
		long[] num={799637143L,8105753018L,8884576550L,7760033153L,7204777902L};
		Sports.ludoTeamMobileNumber(num);
		
		System.out.println("the football team members salary ");
		double[] salaries={30d,40d,50d,60d,70d,80d,90d,};
		Sports.footballTeamMembarySalary(salaries);
		
		System.out.println("the hockey match ");
		int[] matches={01,03,04,05};
		Sports.hockeyTeamMembersNoOfMatches(matches);
		
		System.out.println("the koko team country code start");
		long[] name={91L,82L,55L,63L,};
		Sports.kokoTeamMembersCountryCode(name);
		
		System.out.println("the logari team is a alive");
		boolean[] namees={true};
		Sports.lagoriTeamMembersAlive(namees);
		
		
		
		
	}
}