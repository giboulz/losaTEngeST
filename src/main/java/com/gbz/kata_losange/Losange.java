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

		res = generateClosingLine(index, res);

		res = createOpeningPartDiamond(index, res);

		res = createClosingPartDiamond(index, res);

		if (!isOneLineDiamond(index)) {
			res = generateClosingLine(index, res);
		}

		return res;
	}

	private String createClosingPartDiamond(int index, String res) {
		for (int i = index - 1; i >= 2; i--) {
			res = generateLineInDiamond(index, res, i);
		}
		return res;
	}

	private String createOpeningPartDiamond(int index, String res) {
		for (int i = 2; i <= index; i++) {
			res = generateLineInDiamond(index, res, i);
		}
		return res;
	}

	private boolean isOneLineDiamond(int index) {
		return index == 1;
	}

	private String generateLineInDiamond(int index, String res, int i) {
		char currentLetter = LetterPosition.getLetterForGivenNumber(i);
		res = addSpace(index - i, res);
		res += currentLetter;
		res = addSpace(1 + ((i - 2) * 2), res);
		res += currentLetter + "\n";
		return res;
	}

	private String generateClosingLine(int index, String res) {
		res = addSpace(index - 1, res);
		res += "A";
		res += "\n";
		return res;
	}

	private String addSpace(int nbSpace, String res) {
		String spaces = "";
		for (int i = 0; i < nbSpace; i++) {
			spaces += " ";
		}
		return res + spaces;
	}

	public char getTargetLetter() {
		return targetLetter;
	}

	public void setTargetLetter(char targetLetter) {
		this.targetLetter = targetLetter;
	}

}
