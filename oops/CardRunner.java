class CardRunner{
	
	public static void main(String[] args)
	{
		
		Card.displayDetails();
		
		Card.type="Debitcard";
		Card.weight=10;
		Card.width=2.3d;
		Card.price=50;
		String[] color={"white","brown","red","black","yellow"};
	    Card.colour=color;
		
		Card.displayDetails();
	}
}
		
		