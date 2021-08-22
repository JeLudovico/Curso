package Curso;

import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados");
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal){
			   duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " Hora(s)");
		
		sc.close();
		
	}
}
