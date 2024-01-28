import java.util.Scanner;
public class Reverse2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String in=sc.nextLine();
        String[] arr=in.split(""); // **This is the method to convert String --> Array of String datatype
        String res="";  //look at line 11

        for(int i=arr.length-1;i>=0;i--){   //arr.length=5 --> arr.length-1
            res +=arr[i];   //look at line 8
        }
        System.out.println(res);
    }
}
