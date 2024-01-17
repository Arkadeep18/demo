import java.util.*;

public class Prac15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Subject 1");
		float subject1 = sc.nextFloat();
		System.out.println("Subject 2");
		float subject2 = sc.nextFloat();
		System.out.println("Subject 3");
		float subject3 = sc.nextFloat();
		System.out.println("Subject 4");
		float subject4 = sc.nextFloat();
		System.out.println("Subject 5");
		float subject5 = sc.nextFloat();
		
		float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5)/50f;
		System.out.println(cgpa +" cgpa");


	}

}
