package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.iNumbers;
import service.implementsNumbers;

public class numbersMain {

	static ArrayList<Integer> num = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		iNumbers obj = new implementsNumbers();
		
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++) {
			num.add(sc.nextInt());
		}
		
		List<Integer> nonZero = obj.removeZero(num);
		System.out.println("Zero removed");
		System.out.println(nonZero);
		
		System.out.println("Sorted");
		obj.sortInAsending(nonZero);
		
		System.out.println("Sorted in Desending");
		obj.sortInDesending(nonZero);
	}
	
	
}
