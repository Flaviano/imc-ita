
public class Paciente {
	
	private double peso;
	private double altura;
	
	Paciente(double peso, double altura) {
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public double calcularIMC() {
		return this.peso / (this.altura * this.altura );
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	/*
		Baixo peso muito grave = IMC abaixo de 16 kg/m²
		Baixo peso grave = IMC entre 16 e 16,99 kg/m²
		Baixo peso = IMC entre 17 e 18,49 kg/m²
		Peso normal = IMC entre 18,50 e 24,99 kg/m²
		Sobrepeso = IMC entre 25 e 29,99 kg/m²
		Obesidade grau I = IMC entre 30 e 34,99 kg/m²
		Obesidade grau II = IMC entre 35 e 39,99 kg/m²
		Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
	*/
	public String diagnostico(double imc) {
		
		String diagnostico = "";
		
		if(imc < 16)
			diagnostico = "Baixo peso muito grave";
		else if(imc >= 16 && imc <= 16.99 )
			diagnostico = "Baixo peso grave";
		else if(imc >= 17 && imc <= 18.49)
			diagnostico = "Baixo peso"; 
		else if(imc >= 18.50 && imc <= 24.99)
			diagnostico = "Peso normal"; 
		else if(imc >= 25 && imc <= 29.99)
			diagnostico = "Sobrepeso";
		else if(imc >= 30 && imc <= 34.99)
			diagnostico = "Obesidade grau I";
		else if(imc >= 35 && imc <= 39.99)
			diagnostico = "Obesidade grau II";
		else if(imc >= 40)
			diagnostico = "Obesidade grau III (obesidade mórbida)";
		else 
			diagnostico = "Não detectado!";
		
		return diagnostico;
	}

}
