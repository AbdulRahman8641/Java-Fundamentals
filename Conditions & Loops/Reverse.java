import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String in=sc.nextLine();            //in=hello
        String res="";
        for(int i=in.length()-1;i>=0;i--){  //in.length() = 5 then for indices you have to subtract -1 --> in.length-1
                                            //(meaning it'll start from last)
                                            //also for strings it's input.length() not length as in Arrays
            res+=in.charAt(i);
        }
        System.out.println(res);
    }
}
