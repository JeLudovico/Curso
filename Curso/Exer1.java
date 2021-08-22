package Curso;

import java.util.Scanner;

public class Exer1 {
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int N = sc.nextInt();
		
		if (N <0){
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		sc.close();

 }
}
//02-exercicios2-estrutura-condicional