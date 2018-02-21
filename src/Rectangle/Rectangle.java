package Rectangle;
import java.util.Scanner;
public class Rectangle {

	int l, w;
	public Rectangle(int l2, int w2){

		l=l2;
		w=w2;

	}
	public int getarea(){

		int a=l*w; 
		return a;

	}

	public int getper(){

		int a=(2*l)+(2*w);
		return a;
	}

	public static void main(String[]args){

		Scanner scanner=new Scanner(System.in);



		for( double i=0; i<3; i++)

		{
			
			
			System.out.println("What is the length of the rectangle?");
			System.out.println("What is the width of the rectangle?");
		
			
			Rectangle  r=new Rectangle(scanner.nextInt(),scanner.nextInt());
			
			System.out.println(r.getarea());
			
			System.out.println(r.getper());
			
			
		}

	}

}
