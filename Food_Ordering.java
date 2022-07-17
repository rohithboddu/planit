package planit_task2;

import java.util.Scanner;

public class Food_Ordering {
	
	public void foodOrdering(String foodItem){
		
		if(foodItem.equals("pepporoni pizza"))
			System.out.println("Awesome pizza place,"+foodItem+",$20");}
	
	public void foodOrdering1(String foodItem) {
		if(foodItem.equals("burger"))
			System.out.println("wild burger joint, "+foodItem+",$15");
		
	}
		
	
	
	public static void main(String[] args) {
		
		System.out.println("Please choose the food to order \n 1. Pepporoni piza \n 2. Burger");
		Scanner sc =new Scanner(System.in);
		String input= sc.nextLine();
		Food_Ordering obj = new Food_Ordering();
		obj.foodOrdering(input);
		obj.foodOrdering1(input);

	}
}
