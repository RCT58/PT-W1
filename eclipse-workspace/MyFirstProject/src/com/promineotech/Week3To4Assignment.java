package com.promineotech;
import java.util.Arrays;

public class Week3To4Assignment {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//adding new age to the array.
		ages = Arrays.copyOf(ages, ages.length+1);
		ages[ages.length-1] = 45;
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//calculating the average age
		int sum=0;
		for (int age : ages) {
			sum+= age;
		}
		System.out.println("Average age is: "+sum/ages.length);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//calculating the average number of letters per name
		for (String name : names) {
			sum+= name.length();
	}
		System.out.println("Average number of letters is: "+sum/names.length);
		
		//calculating all the names together
		String allNames="";
		for (String name:names) {
			allNames+=name+"";
		}
		System.out.println("All names: "+allNames);
		
		//Last age of the array of ages.
		int lastAge = ages[ages.length-1];
		System.out.println("Last age: "+lastAge);
		
		//First age of the array of ages.
		int firstAge=ages[0];
		System.out.println("First age: "+firstAge);
		
		//New array added 
		int[] nameLengths=new int[names.length];
		for (int i=0; i<names.length; i++) {
			nameLengths[i]=names[i].length();
		}
		
		//Sum of all 
		for(int length:nameLengths) {
			sum+=length;
		}
		System.out.println("Sum of all elements in the array: "+ sum);
		
		//Call the repeatWord method
		repeatWord("Hello", 3);
		
		fullName("Rudolph", "Trevino");
		
		//Boolean if sum is greater than 100
		boolean result = sum>100;
		if (result) {
		    System.out.println("true");
		} else {
		    System.out.println("false");
		}
		
		//Double array average of the elements.
		double[] numbers = {5.0, 20.0, 50.0, 30.0, 10.0};
		double average = arrayAverage(numbers);
		System.out.println(average);
		
		//Two double arrays boolean
		double[] arr1 = {5.0, 20.0, 50.0, 30.0, 10.0};
		double[] arr2 = {10.0, 15.0, 20.0, 25.0, 30.0};
		System.out.println(isFirstArrayGreater(arr1,arr2));
		
		//Boolean willBuyDrink 
		boolean isHot = true;
		double money = 20.0;
		System.out.println(willBuyDrink(isHot,money));
		
		//Boolean will go outToEat 
		boolean isNotRaining = true;
		double friends = 5;
		System.out.println(outToEat(isNotRaining,friends));
}
	public static String repeatWord(String word, int n) {
	    String repeatedWord = "";
	    for (int i = 0; i < n; i++) {
	        repeatedWord += word;
	    }
	    System.out.println(repeatedWord);
	    return repeatedWord;
	} 
	public static String fullName(String firstName, String lastName) {
	    String fullname = firstName + " " + lastName;
	    System.out.println(fullname);
	    return fullname;
	}
	public static double arrayAverage(double[] arr) {
	    double sum = 0;
	    for (double i : arr) {
	        sum += i;
	    }
	    return sum / arr.length;
	}
	public static boolean isFirstArrayGreater(double[] arr1, double[] arr2) {
	    double average1 = 0, average2 = 0;
	    for (double i : arr1) {
	        average1 += i;
	    }
	    for (double i : arr2) {
	        average2 += i;
	    }
	    average1 /= arr1.length;
	    average2 /= arr2.length;
	    return average1 > average2;
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}
	public static boolean outToEat(boolean notRaining, double amountOfFriends) {
	    return notRaining && amountOfFriends > 4;
	}
}
