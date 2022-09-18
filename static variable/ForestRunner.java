class ForestRunner{
	public static void main(String[] args)
	{
		
		System.out.println(Forest.name);
		System.out.println(Forest.totalarea);
		
		System.out.println(Forest.type);
		System.out.println(Forest.region);
		System.out.println(Forest.PrimaryAnimals.length);
		
		for(int i=0; i<Forest.PrimaryAnimals.length; i++)
		{
			String ref=Forest.PrimaryAnimals[i];
			System.out.println("total animals name : "+i +"name : "+ref);
		}
		
		Forest.name="dandeli";
		Forest.totalarea=500;
		Forest.type="national";
		Forest.region="uttarkannada";
		Forest.PrimaryAnimals[0]="Monkey";
		Forest.PrimaryAnimals[1]="Rabbit";
		Forest.PrimaryAnimals[2]="snake";
		Forest.PrimaryAnimals[3]="Elephant";
		Forest.PrimaryAnimals[4]="panda";
		System.out.println(Forest.name);
		System.out.println(Forest.totalarea);
		
		System.out.println(Forest.type);
		System.out.println(Forest.region);
		System.out.println(Forest.PrimaryAnimals.length);
		 
		 for(int i=0;i<Forest.PrimaryAnimals.length;i++)
		 {
			 String ref=Forest.PrimaryAnimals[i];
			 System.out.println("total animals name :"+i +"name :"+ref);
		 }
	}
}