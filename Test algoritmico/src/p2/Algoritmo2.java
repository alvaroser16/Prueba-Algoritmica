package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algoritmo2 {


	public static void main(String[] args) throws FileNotFoundException {
		List<Persona> a = new  LinkedList<Persona>();
		a=leePersonas("datosp2.txt");
		
		mayoredad(a);
		menoredad(a);
		masculinomayor(a);
		femeninomayor(a);
		porcentajemayor_menor(a);
		porcentaje_mujeres(a);
		
		
	}







//Funcion para leer las Personas desde un archivo

	public static List<Persona> leePersonas(String nomFich) throws
	FileNotFoundException{
		List <Persona> lp = new LinkedList<Persona>();
		Scanner sc=new Scanner(new File(nomFich));
		while (sc.hasNextLine()) {
			String linea = sc.nextLine();
			List<String> lisat= separaElementos(linea);
			Persona p=new Persona(new Integer(lisat.get(0)),lisat.get(1));
			lp.add(p);
		}
		return lp;
	}

	public static List<String> separaElementos(String s){
		return Arrays.asList(s.split(","));
	}

	//a)Cantidad de personas mayores de edad.

	public static  void mayoredad(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getEdad()>=18) {
				i++;}
		}
		System.out.println("El numero de personas mayores de edad son "+i);
	}
	
	//b) Cantidad de personas  menores de edad.
	public static  void menoredad(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getEdad()<18) {
				i++;}
		}
		System.out.println("El numero de personas menores de edad son "+i);
	}
	
	//c)Cantidad de personas masculinas mayores de edad.

	public static  void masculinomayor(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getEdad()>=18 && aux.getSexo().equals("Masculino")) {
				i++;}
		}
		System.out.println("El numero de varones mayores de edad son "+i);
	}
	
	//d)Cantidad de personas femeninas menores de edad.
	
	public static  void femeninomayor(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getEdad()<18 && aux.getSexo().equals("Femenino")) {
				i++;}
		}
		System.out.println("El numero de Mujeres mayores de edad son "+i);
	}
	
	//e)Porcentaje que representan las personas mayores de edad respecto al total de personas.
	public static  void porcentajemayor_menor(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getEdad()>=18) {
				i++;}
		}
		float porcentaje=(float)i/(float)a.size();

		System.out.println("El porcentaje de mayores de edad es del "+ porcentaje*100+"%");
	}
	
	//f)Porcentaje que representan las mujeres respecto al total de personas.
	
	public static  void porcentaje_mujeres(List<Persona> a){

		int i=0;
		for(Persona aux:a) {

			if(aux.getSexo().equals("Femenino")) {
				i++;}
		}
		float porcentaje=(float)i/(float)a.size();

		System.out.println("El porcentaje de mujeres es del "+porcentaje*100+"%");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
