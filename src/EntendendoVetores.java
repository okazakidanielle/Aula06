//Vari�vel guarda um valor por vez
//Vari�vel Armazenar v�rios dados de uma �nica vez = vetor [] cada um numa posi��o

import java.util.Scanner;

public class EntendendoVetores {
	
	
public static final int TAMANHO = 10;

	public static void main(String[] args) {
		int vetor[] = new int[TAMANHO];
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("O tamanho do vetor �" + vetor.length);
		
		for (int i=0; i<vetor.length;i++) {
			System.out.println("Digite um valor");
			vetor [i] = leitor.nextInt();
		}
		
		
		for (int i=0; i<10;i++) {
			System.out.println ("No �ndice" + i + "foi armazenado o valor" + vetor [i]);
		}
		
		leitor.close();
		
		
		
		
	}

}
