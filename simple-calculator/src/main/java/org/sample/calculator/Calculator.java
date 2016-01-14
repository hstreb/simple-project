package org.sample.calculator;

import org.apache.log4j.Logger;

public class Calculator {

	private static final Logger log = Logger.getLogger(Calculator.class.getName());

	public int add(int a, int b) {
		log.info("call add(" + a + ", " + b + ")");
		return a + b;
	}

	public int sub(int a, int b) {
		log.info("call sub(" + a + ", " + b + ")");
		return a - b;
	}

}
