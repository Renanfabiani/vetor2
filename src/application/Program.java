package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product [n];
		
		for (int i = 0; i<vect.length; i++) {//vect.lenth pega o tamanho do vetor
			sc.nextLine();//cria isso pois em cima criou um nextint, dai precisa criar a quebra de p�gina
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
			}
		
		double soma = 0.0;
		
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getPrice();//aqui eu pego s� o pre�o pelo elemento price
		}
		
		double media = soma/vect.length;
		
		System.out.printf("M�dia de pre�o = %.2f%n", media);
		
		sc.close();
		
	}

}
