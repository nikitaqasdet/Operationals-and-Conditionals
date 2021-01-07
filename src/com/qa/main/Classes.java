package com.qa.main;

public class Classes {
	
	static String class1 = " Physics: ";
	static String class2 = " Chemistry: ";
	static String class3 = " Biology: ";
	static String class4 = "/150";
	static String class5 = " percentage: ";
	
	static int Phys = 140;
	static int Chem = 125;
	static int Bio = 110;
	
	static String student = "Jason";
	
	
	public static void main (String[] args) {
		
		System.out.println(student);
		System.out.println(class1 + Phys + class4);
		System.out.println(class2 + Chem + class4);
		System.out.println(class3 + Bio + class4);
		
		if (Phys < 150) {
		System.out.println(class1 + class5 + Phys * 100 / 450);
		} else {
			System.out.println("Precentage cannot be calculated");
		}
		if (Chem < 150) {
		System.out.println(class2 + class5 + Chem * 100 / 450);
		}  else {
			System.out.println("Precentage cannot be calculated");
		}
		if (Bio < 150) {
		System.out.println(class3 + class5 + Bio * 100 / 450);
		} else {
			System.out.println("Precentage cannot be calculated");
		}
	}
}