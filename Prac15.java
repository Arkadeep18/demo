
public class Cmd2 {

	public static void main(String[] args) {		
		int a = 4;
		int b = 90;
		int c = 9;		//ascending order sorting
		
		int firstnum = Math.max(Math.max(a, b),c);
		int secnum = Math.min(Math.min(a, b), c);
		int midnum =(a+b+c)-(firstnum+secnum);
		System.out.println(firstnum+" > "+midnum+" > "+secnum);
		}

}
