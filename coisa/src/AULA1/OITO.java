package AULA1;

import java.util.Scanner;

public class OITO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("BATATAA");
        Scanner entrada = new Scanner(System.in);
        //entrada n. inteiro
        
        System.out.println("Digite um número inteiro:");
        int num1 = entrada.nextInt();
        System.out.println("Numero inteiro: "+num1);
        //entrada n. double
        
        System.out.println("Digite um número double:");
        Double num2 = entrada.nextDouble();
        System.out.println("Numero double: "+num2);
        //entrada n. float
        
        System.out.println("Digite um número float:");
        Float num3 = entrada.nextFloat();
        System.out.println("Numero float: "+num3);
        //entrada n. String
        
        System.out.println("Digite um nome:");
        String nome = entrada.next();
        System.out.println("Nome: "+nome );

	}

}
