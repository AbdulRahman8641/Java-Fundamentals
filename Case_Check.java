import java.util.Scanner;
public class Case_Check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().trim().charAt(0);//**The system gives String so we use charAt to take the character from the string**

        if(ch >='a'&&ch<='z'){
            System.out.println("lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}
