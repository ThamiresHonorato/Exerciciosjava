package Turma22;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	 int n1, n2, n3, ordem;
	 
	 System.out.println(" Entre com o primeiro número inteiro  : ");
		n1 = leia.nextInt();
		System.out.println(" Entre com o segundo número inteiro : ");
		n2 = leia.nextInt();
		System.out.println(" Entre com o terceiro número inteiro : ");
		n3 = leia.nextInt();
		 if (n1 < n2 )  {
			 if (n2 < n3) {
				 
				 System.out.println(n1 +"\n" + n2+ "\n"  + n3 );
			 }
			 else if (n1 < n3) {
				 System.out.println(n1 +"\n" + n3+ "\n"  + n2 );
			 }
			 else {
			 System.out.println(n3 +"\n" +  n1+ "\n" + n2  );
				 
			 
			 }
		 }
	}

	
}
