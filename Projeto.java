package ProjetoNegocio;

import java.util.Scanner;

public class Projeto {
	
	Scanner resposta = new Scanner(System.in);

	void inicio () throws InterruptedException {
	System.out.println("Ol� ! \n 91% das pessoas com COVID apresentam sintomas. "
			+ " de acordo com isso, indicaremos o melhor curso de a��o para voc�. "
			+ "vamos come�ar ? ");	
	        Thread.sleep(1000);	
	}
	
	void pergunta1 () {
		int pgt1;
		System.out.println(" ? 1 - SIM | 2 - N�O");
		pgt1 = resposta.nextInt();
	}
	
	
	void pergunta2 () {
		int pgt2;
		System.out.println("");
	}

	
}
