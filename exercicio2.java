package Turma22;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	 int n1, n2, n3, ordem;
	 
	 System.out.println(" Entre com o primeiro n�mero inteiro  : ");
		n1 = leia.nextInt();
		System.out.println(" Entre com o segundo n�mero inteiro : ");
		n2 = leia.nextInt();
		System.out.println(" Entre com o terceiro n�mero inteiro : ");
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
