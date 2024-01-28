import java.util.Scanner;
public class Occurences {
    public static void main(String[] args){
        int[] input=new int[]{1,2,3,5,47,5,5};
        int count=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==5) {   //input[i] gives the element of the input array
                count++;
            }
        }
        if(count==0){   //if no element is present
            System.out.println("Occurred 0 times");
        }else{
            System.out.println(count);
        }
    }

}
