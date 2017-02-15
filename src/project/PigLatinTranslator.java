package project;

import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		getInputAndTranslate();

	}

	public static void getInputAndTranslate() {
		Scanner kb = new Scanner(System.in);
		System.out.print("PLease enter a sentence you would like translated: ");
		String line = kb.nextLine();
		line = line.toLowerCase();
		String[] words = line.split(" ");
		System.out.println(line + "\ntranslates to: ");
		for (String word : words) {
			System.out.print(translate(word) + " ");
		}
	}

	public static String translate(String word) {
		String translatedWord = "";
		String patternForFirstVowel = "[aeiouAEIOU].*";
		String patternForFirstTwoConsonants = "[^aeiouAEIOU]{2}.*";
		String patternForFirstConsonantSecondVowel = "[^aeiouAEIOU][AEIOUaeiou].*";

		if (word.matches(patternForFirstVowel)) {
			translatedWord = word + "way";
		}

		if (word.matches(patternForFirstTwoConsonants)) {
			translatedWord = word.substring(2) + word.substring(0, 2) + "ay";
		}

		if (word.matches(patternForFirstConsonantSecondVowel)) {
			translatedWord = word.substring(1) + word.substring(0, 1) + "ay";
		}
		return translatedWord;
	}
}