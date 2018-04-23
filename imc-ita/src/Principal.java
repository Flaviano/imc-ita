
public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(120,1.72);
		double imc1 = paciente1.calcularIMC();
		String resultadoP1 = paciente1.diagnostico(imc1);
		System.out.println("IMC do Paciente 1 é: " + imc1 + " que significa " + resultadoP1 );
		
		Paciente paciente2 = new Paciente(75,1.72);
		double imc2 = paciente2.calcularIMC();
		String resultadoP2 = paciente2.diagnostico(imc2);
		System.out.println("IMC do Paciente 2 é: " + imc2 + " que significa " + resultadoP2);
		
		
		
		Paciente paciente3 = new Paciente(68,1.72);
		double imc3 = paciente3.calcularIMC();
		String resultadoP3 = paciente3.diagnostico(imc3);
		System.out.println("IMC do Paciente 1 é: " + imc3 + " que significa " + resultadoP3);
		
	}

}
