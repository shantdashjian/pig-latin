package project;

import java.util.Scanner;

public class PigLatinDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PigLatin pigLatin = new PigLatin();
		System.out.print("PLease enter a sentence you would like translated: ");
		String line = kb.nextLine();
		line = line.toLowerCase();
		String[] words = line.split(" ");
		System.out.println(line + "\ntranslates to: ");
		for (String word : words) {
			System.out.print(pigLatin.translate(word) + " ");
		}
	}
}