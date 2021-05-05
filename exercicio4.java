package Turma22;

import java.util.Scanner;

public class exercicio4 {

	
	public static void main(String[]args) {
		int num;
		double res;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite um número : " );
		num = leia.nextInt();
		if (num % 2 == 0) {
			 res = Math.sqrt(num);
			 
		}
		else {
			 res = Math.pow(num, 2);
			 
		}
		 System.out.println("\n valor : " + res);
		 
		 
	}
}
