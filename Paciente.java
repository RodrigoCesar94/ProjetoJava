package ProjetoNegocio;

import java.util.Scanner;

public class Paciente {

	Scanner dadospaciente = new Scanner(System.in);
	
	private String nome; // encapsulamento dos atributos de Paciente.
	private String idade;
	
	
	public Scanner getDadospaciente() { // usando serviços getters and setters para recuperar os atributos privados. 
		return dadospaciente;
	}
	public void setDadospaciente(Scanner dadospaciente) {
		this.dadospaciente = dadospaciente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}

	
	
	
}
