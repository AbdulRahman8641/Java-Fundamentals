import java.util.Scanner;
public class n_Fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(); //the nth number from the user
        int a=0;
        int b=1;
        int count=2;
        int temp;

        while(count<=n){
            temp=b;     //store b in temp
            b+=a;       //the 3rd element is a+b
            a=temp;     //then a would become the b value
            count++;    //total fibonacchi numbers added/printed
        }

        System.out.println(b);//print the nth number(b is the last number)
    }
}
