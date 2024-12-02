//Devin Reid
public class Coffee {
	
	//Instance Variables
	private String name;
	private double caffeine;
	private double amount;
	
	//Default constructor
	public Coffee()
	{
		this.name = "none";
		
		this.caffeine = 50;
		
		this.amount = 0;
		
	}
	
	//Parameter constructor
	public Coffee(String xName, double xCaffeine, double xAmount)
	{
		this.setName(xName);
		this.setCaffeine(xCaffeine);
		this.setAmount(xAmount);
	}
	
	//Accessor
	public String getName()
	{
		return this.name;
	}
	
	public double getCaffeine()
	{
		return this.caffeine;
	}
	
	public double getAmount()
	{
		return this.amount;
	}
	
	//Mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setCaffeine(double xCaffeine)
	{
		
		if(xCaffeine >= 50 && xCaffeine <= 300)
		{
			this.caffeine = xCaffeine;
		}
		else
		{
			System.out.println("Invalid amount of caffeine.");
		}
	}
		public void setAmount(double xAmount)
		{
			this.amount = xAmount;
			amount = 180 / (caffeine / 100.0) * 6.0;
		}
		
		public String toString()
		{
			return "Coffee Name: "+this.name+"\nCaffeine: "+this.caffeine+"mg" +"\n It would take "+this.amount +" cups of "+ 
		this.name+" before it's dangerous to drink more" ;
		}
		
	}
	
	


