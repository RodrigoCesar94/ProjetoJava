package ProjetoNegocio;

import java.util.Scanner;

public class questionaPaciente extends Paciente{
	
	Scanner resposta = new Scanner(System.in);
	Paciente  p1 = new Paciente();
	
	void pergunta1 () {
		int pgt1;
		System.out.println("Voc� est� ou esteve com altera��o do olfato ou paladar ? \n1 escolha 1- SIM | 2 - N�O");
		pgt1 = resposta.nextInt();
	}
	
	void pergunta2 () {
		int pgt2;
		System.out.println("Voc� est� ou esteve com dor de cabe�a ? \n  escolha 1 - SIM | 2 - N�O");
		pgt2 = resposta.nextInt();
	}
	
	void pergunta3() {
		int pgt3;
		System.out.println("Voc� est� ou esteve com Febre ?  \n escolha 1 - SIM | 2 - N�O");
		pgt3 = resposta.nextInt();
	} 
	void pergunta4() {
		int pgt4;
		System.out.println("Voc� est� ou esteve com Tosse ? \n escolha 1 - SIM | 2 - N�O");
		pgt4 = resposta.nextInt();
		
		if(pgt4 == 1) {
		System.out.println("Sua tosse � seca ou carregada ?");
		int tpTosse = resposta.nextInt();
	 }
	 }
	void pergunta5() {
		int pgt5;
		System.out.println("Voc� est� ou esteve com Falta de ar ? \n escolha 1 - SIM | 2 - N�O");
		pgt5 = resposta.nextInt();
	}
    
    
}
