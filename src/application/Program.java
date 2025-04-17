package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			while(true) {	
				if(ch == 'c' || ch == 'u' || ch == 'i') {
					break;
			}
				System.out.println("Caractere inválido, digite novamente");
				ch = sc.next().charAt(0);
			}
			
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			if (ch == 'c') {
				list.add(new Product(name, price));
			}
			
			if(ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYY:");
				Date manufactureDate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
				
			} else if (ch == 'i'){
				System.out.println("Customs fee:");
				Double cf = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cf));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
		
	}

}

