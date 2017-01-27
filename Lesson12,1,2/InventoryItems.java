import java.util.Random;

public class InventoryItems
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	
	public InventoryItems(String ITM, String IN)
	{
	   manufacturer = ITM;
	   name = IN;
	   category = "";
	   UPC = (int)(Math.random() * 1000000) + 1;
	   price = 0.0;
	}
	
	public InventoryItems(String ITM, String IN, String cat, double prc)
	{
	   manufacturer = ITM;
	   name = IN;
	   category = cat;
	   UPC = (int)(Math.random() * 1000000) + 1;
	   price = prc;
	}

	
	public String toString()
	{
	   return "Item Information..." + "\nManufacturer: " + manufacturer + "\nItem: " + name + "\nCategory: " + category + "\nUPC: " + UPC + "\nPrice: " + price;
	}	
}