public class employee {
    int eid;
    String ename;
    int salary;
    void display()
    {
        System.out.println(eid +" "+ename+" "+salary+" ");
    }
    employee(int eid,String ename,int salary)
    {
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
    }
    public static void main(String[] args) {
        employee e1=new employee(101,"divya",40000);
        employee e2=new employee(102,"deepa",30000);
        employee e3=new employee(103,"anu",20000);

        employee highest=e1;
        if(e2.salary>highest.salary)
        {
             highest=e2;
        }
        if(e3.salary>highest.salary)
        {
             highest=e3;
        }
        System.out.println("highest salary:");
        highest.display();


    }
}
