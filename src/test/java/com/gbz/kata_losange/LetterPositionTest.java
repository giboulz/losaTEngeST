package com.gbz.kata_losange;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LetterPositionTest {

	@Test
	public void getNumberOfGivenLetter_should_give_1_for_A() {

		// act
		int res = LetterPosition.getNumberOfGivenLetter('A');
		// assert

		assertThat(res, is(1));
	}

	@Test
	public void getNumberOfGivenLetter_should_give_14_for_N() {
		// act
		int res = LetterPosition.getNumberOfGivenLetter('N');
		// assert

		assertThat(res, is(14));
	}

	@Test
	public void getNumberOfGivenLetter_should_give_26_for_Z() {
		// act
		int res = LetterPosition.getNumberOfGivenLetter('Z');
		// assert

		assertThat(res, is(26));
	}

	@Test
	public void getLetterForGivenNumber_should_give_A_for_1() {

		//act
		char res = LetterPosition.getLetterForGivenNumber(1);
		
		//assert
		assertThat(res, is('A')); 
		
	}
	
	@Test
	public void getLetterForGivenNumber_should_give_N_for_14() {

		//act
		char res = LetterPosition.getLetterForGivenNumber(14);
		
		//assert
		assertThat(res, is('N')); 
		
	}
	
	@Test
	public void getLetterForGivenNumber_should_give_Z_for_26() {

		//act
		char res = LetterPosition.getLetterForGivenNumber(26);
		
		//assert
		assertThat(res, is('Z')); 
		
	}
}
