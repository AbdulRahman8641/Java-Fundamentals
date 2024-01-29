package Switches;
import java.util.Scanner;

public class Switches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String in=sc.nextLine();
        String drink=sc.nextLine();

//        switch(in){       //default seitch
//            case "mango":
//                System.out.println("King of fruit");
//                break;
//            case "banana":
//                System.out.println("Instant Stamina");
//                break;
//            default:
//                System.out.println("Enter valid fruit");  //no break required
//        }

//        switch (in) {             //enchanced switch
//            case "mango" -> System.out.println("King of fruit");
//            case "banana" -> System.out.println("Instant Stamina");
//            default -> System.out.println("Enter valid fruit");
//        }

//        switch (in) {
//            case "mango" ->{        //for multi line stmt case
//                System.out.print("King of fruit");
//                System.out.println("s");            //<---Interesting........
//            }
//            case "banana" -> System.out.println("Instant Stamina");
//            default -> System.out.println("Enter valid fruit");
//        }
//    }

    switch (in) {
        case "peach","banana" -> System.out.println("Good Combo");      //nested cases
        case "apple" -> {
            System.out.println("King of fruit");
            switch(drink){      //nested switch
                case "alcohol" -> System.out.println(drink+" Really ma man ?");    //it includes the break stmt too
                default -> System.out.println("Other than alcohol is fine");
            }
        }
        default -> System.out.println("Enter valid fruit");
        }
    }
}
