package Curso;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros: ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0){
			System.out.println("São numeros multiplos");
		}
		else {
			System.out.println("Não são numeros multiplos");
		}
		
		sc.close();
	}
	
	
	
}
