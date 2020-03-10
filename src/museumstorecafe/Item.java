package museumstorecafe;

/******************************************************************************
 * Item.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This class defines menu items for the Museum Store Cafe
 *****************************************************************************/

public class Item 
{
    private String name;
    private String category;
    private double price;
    private int quantity;
    
    public Item (String name, String category, double price, int quantity)
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    } //end Items constructor
    
    public String getName()
    {
        return name;
    } //end getName
    
    public String getCategory()
    {
        return category;
    } //getCategory
    
    public double getPrice()
    {
        return price;
    } //end getPrice
    
    public int getQuantity()
    {
        return quantity;
    } //end getQuantity

    public void displayItem()
    {
        System.out.printf("%-8s Item: %-15s Price: $%-7.2f Quantity: %d\n",
                    getCategory(), getName(), 
                    getPrice(), getQuantity());
    } //end displayItem
        
} //end class Item

