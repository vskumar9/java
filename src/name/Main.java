package tnsif.lambdaexp;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Product[] products = new Product[7];
	
		products[0] = new Product(101,"Keboard",600);
		products[1] = new Product(102,"Processor",8000);
		products[2] = new Product(103,"Pendrive",800);
		
		products[3] = new Product(104,"Apple",2000);
		products[4] = new Product(105,"Hard Disk",5000);

		products[5] = new Product(106,"Mouse",500);
		products[6] = new Product(107,"Screen Gaurd",100);
		
		//Sort Custom Class Objects using Lambda Expression 
		//Comparator<Product> c= (p1,p2) -> p2.prodName.compareTo(p1.prodName);
		//Arrays.sort(products, c);
				
		
		//Sort Custom Class Objects using Lambda Expression 
		Arrays.sort(products, (p1,p2) -> p2.prodName.compareTo(p1.prodName));
		
		for(int i=0;i<products.length;i++)
		{
			System.out.println(products[i]);
		}
		
		
		
		
		
		
		

	}

}
