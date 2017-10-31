package org.serkan.task;

import java.io.IOException;

public class MainReporter {
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		InputParser inputParser = new InputParser(args);
		inputParser.getLogLines().stream().forEach(System.out::println); 
	}
}
