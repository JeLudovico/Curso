package Curso;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros: ");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0){
			System.out.println("S�o numeros multiplos");
		}
		else {
			System.out.println("N�o s�o numeros multiplos");
		}
		
		sc.close();
	}
	
	
	
}
