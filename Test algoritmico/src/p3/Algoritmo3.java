package p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import p2.Persona;

public class Algoritmo3 {

//Este algoritmo esta diseñado de manera que se almacenen las variables 
//horas trabajadas y tarifa en dos array diferentes como se indica en el enunciado
//Se podra ir calculando el valor de los diferentes trabajadores segun el index de la lista que se pase
	
	
	
	public static void main(String[] args) throws FileNotFoundException {

		List<Float> horasTrabajadas = new  LinkedList<Float>();
		List<Float> tarifa = new  LinkedList<Float>();

		horasTrabajadas=leerHorasTrabajadas("datosp3.txt");
		tarifa=leerTarifa("datosp3.txt");
		int empleado=0;
		Float sueldo= calcularSueldo(empleado,horasTrabajadas,tarifa);
		System.out.printf( "El sueldo del empleado "+ empleado + " es "+"%.2f"+ "\u20ac\n",sueldo);



	}


	public static List<Float> leerHorasTrabajadas(String nomFich) throws
	FileNotFoundException{
		List <Float> lp = new LinkedList<Float>();
		Scanner sc=new Scanner(new File(nomFich));
		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			List<String> lisat= separaElementos(linea);
			Float p=(new Float(lisat.get(0)));
			lp.add(p);
		}
		return lp;
	}

	public static List<Float> leerTarifa(String nomFich) throws
	FileNotFoundException{
		List <Float> lp = new LinkedList<Float>();
		Scanner sc=new Scanner(new File(nomFich));
		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			List<String> lisat= separaElementos(linea);
			Float p=(new Float(lisat.get(1)));
			lp.add(p);
		}
		return lp;
	}

	public static List<String> separaElementos(String s){
		return Arrays.asList(s.split(","));
	}


	static Float calcularSueldo(Integer empleado, List<Float> h,List<Float> t) { 

		Float sueldo;
		
		if(h.get(empleado)>40) {
			sueldo= (float) (h.get(empleado)*t.get(empleado)+(h.get(empleado)-40)*t.get(empleado)*1.5);
		}else {
			sueldo=h.get(empleado)*t.get(empleado);
		}
		
		return sueldo;


	}
}