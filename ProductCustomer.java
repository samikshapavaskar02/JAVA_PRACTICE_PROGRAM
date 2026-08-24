class Product
{
	private String itemNo;
	private String name;
	private double price;
	private int qty;
	
	public String getItemNo()
	{
		return itemNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setQty(int q)
	{
		qty = q;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public Product()
	{
		itemNo = "P001";
		name ="Cola";
		price = 50;
		qty = 10;
	}
	
	public Product(String i, String n, double p, int q)
	{
		itemNo = i;
		name = n;
		price = p;
		qty = q;
	}
}

class Customer
{
	private String custId;
    private String name;
    private String address;
    private String phone;
	
	public String getCustId()
    {
        return custId;
    }
	
	public String getName()
    {
        return name;
    }
	
	public String getAddress()
    {
        return address;
    }
	
	public void setAddress(String a)
    {
        address = a;
    }
	
	public String getPhone()
    {
        return phone;
    }
	
	public void setPhone(String p)
    {
        phone = p;
    }
	
	public Customer(String c, String n, String a, String p)
    {
        custId = c;
        name = n;
        address = a;
        phone = p;
    }
}

public class ProductCustomer
{
	public static void main(String args[])
	{
		Product p = new Product("P002","Laptop",52000,10);
		Customer c = new Customer("C002","Sam","Sawantwadi","9421239876");
		
		System.out.println("----- Product Details -----");
		System.out.println("Item No : "+p.getItemNo());
		System.out.println("Item Name : "+p.getName());
		System.out.println("Item Price : "+p.getPrice());
		System.out.println("Item Quantity : "+p.getQty());
		
		System.out.println();

        System.out.println("----- CUSTOMER DETAILS -----");
        System.out.println("Customer ID : " + c.getCustId());
        System.out.println("Name        : " + c.getName());
        System.out.println("Address     : " + c.getAddress());
        System.out.println("Phone       : " + c.getPhone());
		
		p.setPrice(75000);
		p.setQty(15);
		
		c.setAddress("Pune");
		c.setPhone("8967542310");
		
		System.out.println("----- UPDATED DETAILS -----");
        System.out.println("Product Price : " + p.getPrice());
        System.out.println("Product Qty   : " + p.getQty());

        System.out.println("Customer Address : " + c.getAddress());
        System.out.println("Customer Phone   : " + c.getPhone());
	}
}