import java.util.*;

class Stack<T>  
{ 
    ArrayList<T> A; 
    int top = -1; 
    int size; 

    Stack(int size) 
    { 
        this.size = size; 
        this.A = new ArrayList<T>(size); 
    } 

    void push(T X) 
    { 
        if (top + 1 == size)  
        { 
            System.out.println("Stack Overflow"); 
        } 
        else  
        { 
            top++; 
            if (A.size() > top) 
                A.set(top, X);  
            else 
                A.add(X); 
        } 
    } 

    T peek() 
    { 
        if (top == -1)  
        { 
            System.out.println("Stack Underflow");  
            return null; 
        }  
        return A.get(top); 
    } 

    T pop() 
    { 
        if (top == -1)  
        {  
            System.out.println("Stack Underflow"); 
            return null;
        }  
        return A.get(top--);
    } 

    boolean empty() { return top == -1; } 

    public String toString() 
    { 
        if (top == -1) return "Stack is empty";

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= top; i++) 
        { 
            ans.append(A.get(i));
            if (i != top) ans.append("->");
        }  
        return ans.toString(); 
    } 
} 

public class genericstack { 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter max size of stack: "); 
        int n = sc.nextInt(); 

        Stack<Integer> s1 = new Stack<>(n);  

        for(int i = 0; i < n; i++) 
        { 
            System.out.print("Enter element " + (i+1) + ": "); 
            s1.push(sc.nextInt()); 
        } 
         
        System.out.println("\nStack after pushing:\n" + s1);  
        s1.pop();  
        System.out.println("\nStack after pop:\n" + s1); 

        sc.close();
    } 
}