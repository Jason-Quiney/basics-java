package assignmet2;
import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		//triangle problem
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the First angle");
		int ang1=s1.nextInt();
		System.out.println("Enter the Second angle");
		int ang2=s1.nextInt();
		System.out.println("Enter the third angle");
		int ang3=s1.nextInt();
		if (ang1+ang2+ang3==180) {
			System.out.println("this is a tringle");			
		
		 if (ang1==90 ||ang2==90||ang3==90) {
			System.out.println("this is a rightangle tringle");
			System.out.println("you win the Second prize");
		}
		
		else if (ang1==ang2||ang3==ang1) {
			System.out.println("this is a equelatrial tringle");
			System.out.println("you win the Third prize");
		}
		else {
			System.out.println("you win the first prize");
		}
		}
		else {
			System.out.println("Sorry,Better luck next time");
		}

	}

}
