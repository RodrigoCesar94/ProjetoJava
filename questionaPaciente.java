package ProjetoNegocio;

import java.util.Scanner;

public class questionaPaciente extends Paciente{
	
	Scanner resposta = new Scanner(System.in);
	
	Paciente  p1 = new Paciente();
	

	void inicio () throws InterruptedException {
	System.out.println(p1.getNome());
	System.out.println("Ol� \n 91% das pessoas com COVID apresentam sintomas. "
			+ " de acordo com isso, indicaremos o melhor curso de a��o para voc�. "
			+ "vamos come�ar ? ");	
	        Thread.sleep(1000);	
	}
	
	void pergunta1 () {
		int pgt1;
		System.out.println("Voc� est� ou esteve com altera��o do olfato ou paladar ? \n1 escolha 1- SIM | 2 - N�O");
		pgt1 = resposta.nextInt();
	}
	
	void pergunta2 () {
		int pgt2;
		System.out.println("Voc� est�/ esteve com febre nos �ltimos 15 dias  ?\n  escolha 1 - SIM | 2 - N�O");
		pgt2 = resposta.nextInt();
	
	}

	
}
