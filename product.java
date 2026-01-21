class sale
{
    int pcode;
    String pname;
    int price;
    void display()
    {
        System.out.println(pcode+" "+pname+" "+price);
    }
    sale(int pcode,String pname,int price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
}
public class product 
{
    public static void main(String[] args) 
    {
        sale p1 = new sale(101, "Laptop", 55000);
        sale p2 = new sale(102, "Mobile", 30000);
        sale p3 = new sale(103, "Tablet", 20000);
        sale lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }
        if (p3.price < lowest.price) {
            lowest = p3;
        }

        // Display result
        System.out.println("Product with the lowest price:");
        lowest.display();
    
    }
}
