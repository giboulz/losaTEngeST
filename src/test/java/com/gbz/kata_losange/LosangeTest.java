package com.gbz.kata_losange;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LosangeTest

{

	Losange sut;

	@Before
	public void setUp() {

	}

	@Test
	public void test_bidon() {
		assertThat("1", is("1"));
	}

	@Test
	public void toString_should_get_A_for_input_A() {
		// arrange
		sut = new Losange('A');

		// act
		String res = sut.toString();

		// assert
		assertThat(res, is("A\n"));
	}

	//the key is to create test that are not final. 
	//first test should go for 'ABBA'
	//then add some end line return
	//then a part of the space
	//and so on...
	@Test
	public void toString_should_get_ABBA_for_input_B() {
		// arrange
		sut = new Losange('B');

		// act
		String res = sut.toString();

		// assert
		// assertThat(res, is(" A\nB B\n A\n"));
		assertThat(res, is(" A\nB B\n A\n"));
	}

	@Test
	public void toString_should_get_ABCCBA_for_input_C() {
		// arrange
		sut = new Losange('C');

		// act
		String res = sut.toString();

		// assert
		assertThat(res, is("  A\n" + " B B\n" + "C   C\n" + " B B\n" + "  A\n"));
	}

	@Test
	public void toString_should_get_ABCDDCBA_for_input_D() {
		// arrange
		sut = new Losange('D');

		// act
		String res = sut.toString();

		// assert
		assertThat(res, is("   A\n" + "  B B\n" + " C   C\n" + "D     D\n" + " C   C\n" + "  B B\n" + "   A\n"));
	}

}
