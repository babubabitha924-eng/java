import java.util.Scanner;

class person {
    String name;
    String gender;
    String address;
    int age;

    person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class employee3 extends person {
    int empid;
    String comname;
    String qualification;
    int salary;

    employee3(String name, String gender, String address, int age,
              int empid, String comname, String qualification, int salary) {

        // Call parent constructor
        super(name, gender, address, age);

        this.empid = empid;
        this.comname = comname;
        this.qualification = qualification;
        this.salary = salary;
    }
}
class teacher4 extends employee3{
    int teacherid;
    String subject;
    String department;
     teacher4(String name, String gender, String address, int age,int teacherid,
    String subject,
    String department,int empid,
    String comname,
    String qualification,
    int salary)
    {
        super(name,gender,address,age,empid,comname,qualification,salary);
        this.teacherid=teacherid;
        this.subject=subject;
        this.department=department;
    }
    void display()
    {
        System.out.println("name :"+name);
                System.out.println("age :"+age);
                        System.out.println("gender :"+gender);
        System.out.println("address :"+address);
        System.out.println("employee id :"+empid);
                System.out.println("company name :"+comname);
        System.out.println("qualifiocation :"+qualification);
        System.out.println("salary :"+salary);
                System.out.println("teacher id :"+teacherid);
        System.out.println("subject :"+subject);
        System.out.println("department :"+department);


    }
} 
public class multilevel
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("No. of teachers:");
        int num = sc.nextInt();
        sc.nextLine(); 

        teacher4[] t = new teacher4[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Enter the details of teacher " + (i + 1));

             System.out.println("Emp name:");
            String name = sc.nextLine();

            
            System.out.println("gender");
            String gender = sc.next();
            sc.nextLine();

           System.out.println("Address:");
            String add = sc.nextLine();

            System.out.println("age:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("employee id");
            int empid = sc.nextInt();
            sc.nextLine();

             System.out.println("company name:");
            String comname= sc.nextLine();

             System.out.println("qualification:");
            String qualification = sc.nextLine();

            System.out.println("Salary:");
            int salary = sc.nextInt();
            sc.nextLine();   

            System.out.println("Subject:");
            String subject = sc.nextLine();
    
            System.out.println("Department:");
            String depart = sc.nextLine();

            System.out.println("teacher id:");
            int teacherid = sc.nextInt();
            sc.nextLine();
            

            t[i] = new teacher4(name,gender,add,age,empid,comname,qualification,salary,subject,depart,teacherid);
        }

        System.out.println("\nTeacher details:");
        for (int i = 0; i < num; i++) {
            t[i].display();
        }

        sc.close();
    } 
    }
