 class student {
    int id;
    String name;

    void display()
    {
        System.out.println(id + "" + name);

    }
}
public class Hello
{
public static void main(String[] args) {
    student s1=new student();
    s1.id=100;
    s1.name="anu";
    s1.display();
}
}
 