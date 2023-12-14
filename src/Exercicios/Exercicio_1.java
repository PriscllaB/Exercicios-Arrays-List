package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		ArrayList<String> cores = new ArrayList<>();
		String cores2;
		
		for (int contador= 0; contador<5; contador++){
			System.out.println("Digite uma cores: ");
			cores2 = leia.nextLine();
			
			cores.add(cores2);			
		}
		
		for (String list: cores) {	
			System.out.println(list);}
		
		Collections.sort(cores);
		
		 
		System.out.println("Ordenar por cores");
		
		for (String list: cores) {
		System.out.println(list);
		
	}
	}
}
