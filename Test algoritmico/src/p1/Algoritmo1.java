package p1;

import java.util.ArrayList;

import java.util.Scanner;

public class Algoritmo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		Integer number= LeerNumero();
		
		if (number%2==0){
			System.out.println("El numero introducido es par");
		}else {
			System.out.println("El numero introducido es impar");
		}
		
		al.add(number);
		while(number>(1*number%2)) {
			number=number-2;
			al.add(number);
		}
		System.out.println(al);

	}

	static int LeerNumero(){
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Por favor inserte un numero");
		return reader.nextInt();

	}




}
