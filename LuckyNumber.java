import java.util.*;
public class LuckyNumber{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your lucky number (1-10): ");
        int a = sc.nextInt();
		Random random = new Random();   
        int x = random.nextInt(10);
        if(a==x){
            System.out.println("You win!");
        }
        else{
            System.out.println("Sorry! you loose.");
        }
	}
}