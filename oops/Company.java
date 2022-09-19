class Company{

 static boolean companyPack(String company1,int salary)
 { 

	 System.out.println("entering comapany and salary");
	 if(salary>=1400000)
	 {
		 System.out.println("my salary is high");
		 return true;                                
	 }
	 if(company1=="Amazon") 
	 {
		 System.out.println("AMAZON IS AWESOME");
		 return true;
	 }
	     return false;
 }
 static int companyPack(String company2,int salary1,String designation)
	{
		System.out.println("comapany,salary and designation of employeee");
		System.out.println(designation);
		 return 25;
	}

 }