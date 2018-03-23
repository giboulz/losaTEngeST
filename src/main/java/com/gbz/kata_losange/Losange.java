package com.gbz.kata_losange;

public class Losange {

	private char targetLetter;

	public Losange(char targetLetter) {
		String tmp = "" + targetLetter;

		this.targetLetter = String.valueOf(targetLetter).toUpperCase().charAt(0);
	}

	@Override
	public String toString() {
		return this.compute();
	}

	public String compute() {
		int index = LetterPosition.getNumberOfGivenLetter(this.targetLetter);
		String res = "";

		res += generateClosingLine(index - 1, 'A', index - 2);

		for (int i = 1; i < index; i++) {

			res += generateNewLine(0, index - i, 0, this.targetLetter);
		}

		if (index != 1) {
			res += generateClosingLine(index - 1, 'A', index - 2);
		}

		return res;
	}

	private String generateClosingLine(int nbSpaceBefore, char letter, int nbSpaceAfter) {
		String res = "";

		res = addSpace(nbSpaceBefore, res);

		res += letter;

		res = addSpace(nbSpaceAfter, res);

		res += "\n";

		return res;
	}

	private String generateNewLine(int nbSpaceBefore, int nbSpaceInTheMiddle, int nbSpaceAfter, char letter) {
		String res = "";

		res = addSpace(nbSpaceBefore, res);

		res += letter;

		res = addSpace(nbSpaceInTheMiddle, res);
		res += letter;

		res = addSpace(nbSpaceAfter, res);

		res += "\n";

		return res;

	}

	private String addSpace(int nbSpaceInTheMiddle, String res) {
		for (int i = 0; i < nbSpaceInTheMiddle; i++) {
			res += " ";
		}
		return res;
	}

	public char getTargetLetter() {
		return targetLetter;
	}

	public void setTargetLetter(char targetLetter) {
		this.targetLetter = targetLetter;
	}

}
