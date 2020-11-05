
import java.util.*;
import java.math.*;

public class Main {

	/*public enum Direction{nord,est,sud,ouest;}
	public enum Color{blue,green,red,yellow;}*/
	
	//List<Integer> myList = new ArrayList<Integer>(); // -> []
	public static void main(String[] args) {
	
		System.out.println("voici le factorielle de " + factorielle(4) + " " + fact(4) );
	}
	
	//ecriture de la fonction factiorielle
	public  static int factorielle(int n) {
		
		if (n==0) 
			return 1;
		else
			return n*factorielle(n-1);
		
	}
	public static int fact(int n) {
		int f =1;
		for(int i =1;i<=n;i++)
			f = f*i;
		
		return f;
	}
}