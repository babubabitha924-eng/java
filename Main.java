class student1
{
    int id;
    String name;

    void display()
    {
        System.out.println(id + " " + name);
    }
}
public class Main
{
    public static void main(String[] args)
     {
        student1 s1=new student1();
        s1.id=101;
        s1.name="deepa";
        s1.display();

        
    }
}