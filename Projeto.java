package ProjetoNegocio;

import java.util.Scanner;

public class Projeto {
	
	Scanner resposta = new Scanner(System.in);

	void inicio () throws InterruptedException {
	System.out.println("Olá ! \n 91% das pessoas com COVID apresentam sintomas. "
			+ " de acordo com isso, indicaremos o melhor curso de ação para você. "
			+ "vamos começar ? ");	
	        Thread.sleep(1000);	
	}
	
	void pergunta1 () {
		int pgt1;
		System.out.println(" ? 1 - SIM | 2 - NÃO");
		pgt1 = resposta.nextInt();
	}
	
	
	void pergunta2 () {
		int pgt2;
		System.out.println("");
	}

	
}
