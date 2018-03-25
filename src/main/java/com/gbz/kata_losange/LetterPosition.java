package com.gbz.kata_losange;

public class LetterPosition {

	public static final int CODE_POSITION_A = 65;

	public static int getNumberOfGivenLetter(char letter) {
		validateEntry(letter);
		return (int) letter - CODE_POSITION_A + 1;
	}

	private static void validateEntry(char letter) throws IllegalArgumentException {
		int letterIntValue = (int) letter;
		if (letterIntValue < 65 || letterIntValue > 91) {
			throw new IllegalArgumentException("Input must be capital Letter");
		}

	}

	public static char getLetterForGivenNumber(int i) {

		return String.valueOf((char) (CODE_POSITION_A + i - 1)).charAt(0);
	}
}
