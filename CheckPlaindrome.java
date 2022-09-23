// 1. Find if a String is Plaindrome or not. Hint: Use toCharArray( )

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String revStr = sb.reverse().toString();
	    System.out.println("Checking string: " + str + " -> " + revStr);
        
        if(str.equals(revStr)){
            System.out.println("The string is Plaindrome");
        }else{
            System.out.println("The string is not Plaindrome");
        }
    }
}