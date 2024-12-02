//Devin Reid
public class Apple {


//Instance Variables

	private String type;
	
	private double weight;

	private double price;

//Default constructor
public Apple() 
{
	this.type = "Gala";
	
	this.weight = 0.5;
	
	this.price = 0.88;
}

//parameter constructor
public Apple(String xType, double xWeight, double xPrice)
{
	this.setType(xType);
	this.setWeight(xWeight);
	this.setPrice(xPrice);	
}

	
//Accessor
public String getType()
{
	return this.type;
}

public double getWeight()
{
	return this.weight;
}

public double getPrice()
{
	return this.price;
}

//Mutators
public void setType(String xType)
	{
	if(xType.equalsIgnoreCase("Red Delicious") || xType.equalsIgnoreCase("Golden Delicious") || xType.equalsIgnoreCase("Gala")
			|| xType.equalsIgnoreCase("Granny Smith") )
	{
		this.type = xType;
		
	}
	else
	{
		
		System.out.println("invalid values entered for type of apple.");
		
	}
	
	}
	
public void setWeight(double xWeight)
{
	if(xWeight >= 0 && xWeight <=2)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid weight for the apple.");
		}
}

public void setPrice(double xPrice)
{
	if(xPrice > 0)
	{
		this.price = xPrice;
	}
	else
	{
		System.out.println("Invalid price for the apple.");
	}
}

//Other methods
	public boolean equals(Apple p)
	{
		return p.getType().equals(this.type) &&
				p.getWeight() == this.weight
				&& p.getPrice() == (this.price);
				
	}
	
	public String toString()
	{
		return "Type: "+this.type+"\nWeight: "+this.weight+" kg" +"\nPrice: $"+this.price;
	}


}
