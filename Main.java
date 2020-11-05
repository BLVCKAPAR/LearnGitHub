
import java.util.*;
import java.math.*;

public class Main {

	/*public enum Direction{nord,est,sud,ouest;}
	public enum Color{blue,green,red,yellow;}*/
	
	//List<Integer> myList = new ArrayList<Integer>(); // -> []
	public static void main(String[] args) {
		args= new String[]{"3","9","4","eigth8"};
		// TODO Auto-generated method stub
		/*int allocation = 1300;
		int epargne = 100;
		int bonus = allocation*epargne;
		//declarer une constant en java
		final int constante = 10;
		
		epargne = epargne +100;
		allocation = allocation -1000;
		int temps = (5000-allocation)/500;
		allocation = allocation+ (30-10)*7;
		
		
		
		System.out.println("vous avez une allocation en cours de " + allocation + "\nTon Epargne"
				+ " est un montant de " + epargne + " vous avez un bonus de " + bonus
				+ " temps d'epargne " + temps);
		
		//System.out.println("Hello word");
		Licorne licorne = new Licorne();
		licorne.run();
		licorne.sleep();
		
		
		/*le polymorphisme : il s'agit de remplacer le comportement de la fonction
		qui a été définie par la classe mère
		Animal a = new Animal();
		Animal chien = new Chien();
		Animal oiseau = new Oiseau();
		
		chien.deplacer();
		oiseau.deplacer();
		a.deplacer();
		if(!true && false)
		 	System.out.println("vrai1");
			else if (!(true && true))
			System.out.println("vrai2");
			else if( 4 < 3 || 4 > 4) 
				System.out.println("vrai3");
			else if((!(1 == 2) || 3 != 3) && 35 > 34)
				System.out.println("vrai4");
		Direction direction=Direction.nord;
		
		switch(direction) {
			case nord:
				System.out.println("nous sommes au nord");
				break;
			case sud:
				System.out.println("nous sommes au sud");
				break;
			case ouest:
				System.out.println("nous sommes au ouest");
				break;
			case est:
				System.out.println("nous sommes au est");
				break;
			default:
				System.out.println("vous êtes perdu");
				break;
		}
		
        List<Integer> maListe = new ArrayList<Integer>();
        //List<Integer> myList = new ArrayList<Integer>(); // -> []
        
        int[][] tb = new int[30][12];
        
		if(args.length==1) {
			sayHelloTo(args[0]);
			sayHelloTo("Hello");
			
		}
		else if(args.length==2) {
			sayHelloTo(args[1]);
			sayHelloTo("Kevin");
			}
		System.out.println(factorial(3));
		
		List<Integer> liste;
		liste = new ArrayList<Integer>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);*/
		
		List<Integer> listeTemperature= new ArrayList<Integer>();
		
		try{
			for(String temperatureEnregistrer:args) {
			int temperature = Integer.parseInt(temperatureEnregistrer);
			listeTemperature.add(temperature);
	}
	
	
		int temperatureMoyenne = SimpleMaths.Moyenne(listeTemperature);
	System.out.println("La temperature moyenne est de : " + temperatureMoyenne);
		}catch(ArithmeticException e) {
			System.out.println("Aucun argument a éte rentrée");
			System.exit(-1);
		}catch(NumberFormatException e) {
			System.out.println("Tous les nombres en arguments doivent être des nombres");
			System.exit(-1);
		}
	/*public  static int factorial(int n) {
		if(n==1) {
			return 1;}
		else { 
			int b = n*factorial(n-1);
			return b;}
		
	}
	 private static void sayHelloTo(String recipient) {
	        System.out.println("Hello " + recipient + "!");
	        }*/
	 
	 }
}


