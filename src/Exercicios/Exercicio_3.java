package Exercicios;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		Set <Integer> numeros = new HashSet<Integer>();
		int entradaNum;
		for (int indice= 0; indice<10; indice++) {
			
			System.out.println("Digite o"+(indice+1)+ "numero:");
			entradaNum = leia.nextInt();
			numeros.add(entradaNum);
		} 
		{
			System.out.println ("\nListar dados do set:");
			Iterator<Integer> inumeros = numeros.iterator();
			while (inumeros.hasNext()) {
				System.out.println(inumeros.next());
				
			}
			
			
			
		}

	}


} 
