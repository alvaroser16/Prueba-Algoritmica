package p2;

import java.util.Objects;

public class Persona {

	private Integer edad;
	private String Sexo;
	
	public Persona(Integer edad, String sexo) {
		super();
		this.edad = edad;
		Sexo = sexo;
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return Sexo;
	}

	
	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Sexo, edad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Sexo, other.Sexo) && edad == other.edad;
	}
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", Sexo=" + Sexo + "]";
	}
	
	
	
	
	
	
	
	
	
	}
	
    


