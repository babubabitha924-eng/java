import java.util.Scanner;
class Student {
    int academicmarks;
    Student(int academicmarks){
        this.academicmarks=academicmarks;
    }
    void academics(int marks){
        academicmarks=marks;
    }
}
interface Sports {
    void sports(int marks);
}
class Result extends Student implements Sports {
    int sportsmarks;
    Result(int sportsmarks,int academicmarks){
        super(academicmarks);
        this.sportsmarks=sportsmarks;
    }
    public void sports(int marks){
        sportsmarks=marks;
    }
    void display(){
        System.out.println("academic marks:"+academicmarks);
        System.out.println("sportsmarks"+sportsmarks);
    }
}
public class interfacesports {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the academic marks:");
        int marks=sc.nextInt();
        System.out.println("enter the sports marks");
        int smarks=sc.nextInt();

        Result r=new Result(smarks,marks);
        r.display();
        sc.close();

    }

}

