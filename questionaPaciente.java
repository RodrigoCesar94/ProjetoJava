package ProjetoNegocio;

import java.util.Scanner;

public class questionaPaciente extends Paciente{
	
	Scanner resposta = new Scanner(System.in);
	
	Paciente  p1 = new Paciente();
	

	void inicio () throws InterruptedException {
	System.out.println(p1.getNome());
	System.out.println("Olá \n 91% das pessoas com COVID apresentam sintomas. "
			+ " de acordo com isso, indicaremos o melhor curso de ação para você. "
			+ "vamos começar ? ");	
	        Thread.sleep(1000);	
	}
	
	void pergunta1 () {
		int pgt1;
		System.out.println("Você está ou esteve com alteração do olfato ou paladar ? \n1 escolha 1- SIM | 2 - NÃO");
		pgt1 = resposta.nextInt();
	}
	
	void pergunta2 () {
		int pgt2;
		System.out.println("Você está/ esteve com febre nos últimos 15 dias  ?\n  escolha 1 - SIM | 2 - NÃO");
		pgt2 = resposta.nextInt();
	
	}

	
}
