package com.gbz.kata_losange;

public class LetterPosition {

	public static final int CODE_POSITION_A = 65;

	public static int getNumberOfGivenLetter(char letter) {
		return (int) letter - CODE_POSITION_A + 1;
	}

	public static char getLetterForGivenNumber(int i) {

		return String.valueOf((char) (CODE_POSITION_A + i - 1)).charAt(0);
	}
}
