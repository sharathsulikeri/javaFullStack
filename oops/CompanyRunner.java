class CompanyRunner
{
   public static void main(String[]  games)
   {
	   
	     int  salary=1520000;
	     int salary1=900000;
	     String company1="Amazon";
	     String company2="apple";
	   	 System.out.println("amazon");
         boolean ref=Company.companyPack("Amazon",1520000);
	 	 System.out.println(ref);
		 
		 String designation="Developer";
		 int ref1=Company.companyPack("apple",1520000,"Developer");
		 System.out.println(ref1);
   }      

}