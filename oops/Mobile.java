class Mobile{
	
	static String type;
	static String colour;
	static char size;
	static double weight;
	static String display;
	static int width;
	static String processor;
	static char battery;
	static int camara;
	static String volume;
	static double thickness;
	static String body;
	static int ram;
	static int storage;
	static double version;
	static long serialnumber;
	static long modelnumber;
	static String[] brands;
	
		
		static void displayThings()
		{
			System.out.println(type);
			System.out.println(colour);
			System.out.println(size);
			System.out.println(weight);
			System.out.println(display);
			System.out.println(width);
			System.out.println(processor);
			System.out.println(battery);
			System.out.println(camara);
			System.out.println(volume);
			System.out.println(thickness);
			System.out.println(body);
			System.out.println(ram);
			System.out.println(storage);
			System.out.println(version);
			System.out.println(serialnumber);
	        System.out.println(modelnumber);
			if(brands!=null)
			{
				System.out.println("array is pointing to memory");
				for(int i=0; i<brands.length; i++)
					{
						String ref=brands[i];
						System.out.println(ref +"brands");
					}
			}
		else{
			System.out.println("array is not pointing to memory");
		}
		}
	}

