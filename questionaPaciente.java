package ProjetoNegocio;

import java.util.Scanner;

public class questionaPaciente extends Paciente{
	
	Scanner resposta = new Scanner(System.in);
	Paciente  p1 = new Paciente();
	
	void pergunta1 () {
		int pgt1;
		System.out.println("Você está ou esteve com alteração do olfato ou paladar ? \n1 escolha 1- SIM | 2 - NÃO");
		pgt1 = resposta.nextInt();
	}
	
	void pergunta2 () {
		int pgt2;
		System.out.println("Você está ou esteve com dor de cabeça ? \n  escolha 1 - SIM | 2 - NÃO");
		pgt2 = resposta.nextInt();
	}
	
	void pergunta3() {
		int pgt3;
		System.out.println("Você está ou esteve com Febre ?  \n escolha 1 - SIM | 2 - NÃO");
		pgt3 = resposta.nextInt();
	} 
	void pergunta4() {
		int pgt4;
		System.out.println("Você está ou esteve com Tosse ? \n escolha 1 - SIM | 2 - NÃO");
		pgt4 = resposta.nextInt();
		
		if(pgt4 == 1) {
		System.out.println("Sua tosse é seca ou carregada ?");
		int tpTosse = resposta.nextInt();
	 }
	 }
	void pergunta5() {
		int pgt5;
		System.out.println("Você está ou esteve com Falta de ar ? \n escolha 1 - SIM | 2 - NÃO");
		pgt5 = resposta.nextInt();
	}
    
    
}
