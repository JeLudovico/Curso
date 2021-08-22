package Curso;

import java.util.Scanner;

public class Exer2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int N = sc.nextInt();
		
		if (N < 0){
			System.out.println("Numero IMPAR");
		}
		else {
			System.out.println("Numero PAR");
		}
		
		sc.close();
		
	}

}
