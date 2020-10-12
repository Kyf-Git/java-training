package fr.manulep.entrainement;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1
		if (name == null || name == "") {
			return "Hello World";
		} else
			return "Hello" + " " + name;
	}

	public static String[] removeNullElements(String[] array) {
		// 2
		ArrayList<String> array2 = new ArrayList<String>();
		String[] array3;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				array2.add(array[i]);
			}
		}
		array3 = new String[array2.size()];
		return array2.toArray(array3);
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		int[] array2 = new int[array.length + 1];
		array2[0] = element;

		for (int i = 0; i < array.length; i++) {
			array2[i + 1] = array[i];
		}

		return array2;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		int i;
		int j = 0;
		int[] array2;

		if (array.length > 3) {
			array2 = new int[array.length - 3];

			for (i = 3; i < array.length; i++) {
				array2[j] = array[i];
				j++;
			}

		} else {
			array2 = new int[0];
		}

		return array2;
	}

	public static String getFirstHalf(String word) {
		// 5
		if (word.length() % 2 == 0) {
			return word.substring(0, word.length() / 2);
		} else {
			return word.substring(0, (word.length() / 2) + 1);
		}
	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		ArrayList<String> wordBeginWithA = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			int firstLetter = array[i].charAt(0);

			if (firstLetter == 'a') {
				wordBeginWithA.add(array[i]);
			}
		}
		String[] result = new String[wordBeginWithA.size()];

		for (int i = 0; i < wordBeginWithA.size(); i++) {
			result[i] = wordBeginWithA.get(i);
		}

		return result;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		String[] vowel = { "a", "e", "i", "o", "u", "y" };
		ArrayList<String> wordBeginVowel = new ArrayList<>();

		for (String word : array) {
			if (word != null) {
				for (String letter : vowel) {
					if (word.startsWith(letter)) {
						wordBeginVowel.add(word);
					}
				}
			}
		}
		return wordBeginVowel.toArray(new String[wordBeginVowel.size()]);
	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8
		ArrayList<String> array2 = new ArrayList<String>();
		String[] array3;

		for (int i = 0; i < array.length; i++) {
			array2.add(array[i]);
		}
		Collections.reverse(array2);
		array3 = new String[array2.size()];

		return array2.toArray(array3);
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9

		int[] resultArray = new int[array.length + 1];

		// prendre la premiere moitié de array
		for (int i = 0; i < array.length / 2; i++) {
			resultArray[i] = array[i];
		}
		// ajouter element
		resultArray[array.length / 2] = element;
		// prendre la deuxieme moitié de array;
		for (int i = (array.length / 2) + 1; i < array.length + 1; i++) {
			resultArray[i] = array[i - 1];
		}
		return resultArray;

	}

	public static String shortestWord(String text) {
		// 10
		String[] justWords = text.split(" ");
		String shortestWord = justWords[0];

		for (String word : justWords) {
			if (word.length() < shortestWord.length()) {
				shortestWord = word;
			}
		}
		return shortestWord;
	}

	public static String removeCapitals(String text) {
		// 11
		String noCapitals = text.replaceAll("[^a-z\s]", "");
		return noCapitals;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		int sumOfNumbers = 0;

		for (int i = 0; i < numbers.length; i++) {
			sumOfNumbers = numbers[i] + sumOfNumbers;
		}
		return sumOfNumbers;
	}

	public static float makeNegative(float number) {
		// 15
		if (number < 0) {
			return number;
		} else {
			return number * -1;
		}
	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16

		Pattern p = Pattern.compile("[^a-zA-Z0-9 !]");
		Matcher m = p.matcher(string);

		boolean result = m.find();

		return result;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		String upperWord = word.toUpperCase();
		Character firstCharac = upperWord.charAt(0);
		String firstCharacToString = firstCharac.toString();

		Pattern p = Pattern.compile("[BCDFGHJKLMNPQRSTVWXZ]");
		Matcher m = p.matcher(firstCharacToString);

		boolean result = m.find();

		return result;
	}

	public static String getDomainName(String email) {
		// 18
		// separer la chaine de caractere par .split('@') => deviens un tableau en 2
		// partie
		// => enlever le ".com" avec replaceAll
		String[] arrOfStr = email.split("@", 0);
		String stringSplit = arrOfStr[1];
		String stringToReturn = stringSplit.replaceAll(".com", "");

		return stringToReturn;
	}

	public static int[] letterPosition(String name) {
		// 19
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		List<String> alphabetList = Arrays.asList(alphabet);

		String[] letterOfName = name.split("");
		int[] positionOfLetter = new int[letterOfName.length];

		for (int i = 0; i < letterOfName.length; i++) {
			String letterInLowCase = letterOfName[i].toLowerCase();
			positionOfLetter[i] = alphabetList.indexOf(letterInLowCase) + 1;
		}

		return positionOfLetter;
	}

	public static boolean isPeer(int number) {
		// 20
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
