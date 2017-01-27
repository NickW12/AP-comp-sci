import java.util.Random;

public class InventoryItems
{
	private String Itmmanufacture, itName, cats;
	
	private int UPC;
	
	private double precio;
	
	public void Inv(String ITM, String IN)
	{
	   Itmmanufacture = ITM;
	   
	   itName = IN;
	   
	   cats = "";
	   
	   UPC = (int)(Math.random() * 1000000) + 1;
	   
	   precio = 0;
	}
	public void Inv(String ITM, String IN, String CTS, double P)
	{
	   Itmmanufacture = ITM;
	   
	   itName = IN;
	   
	   cats = CTS;
	   
	   UPC = (int)(Math.random() * 1000000);
	   
	   precio = P;
	}	
	public String toString()
	{
	   return "Item Information" + "Manufacturer" + Itmmanufacture + "Item" + itName + "Category" + cats + "UPC" + UPC + "precio" + precio;
	}	
}