package org.serkan.task;

import java.io.IOException;

public class MainReporter {
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		if(args==null || args.length==0){
			throw new IllegalArgumentException("Err: Please add a file name parameter.");
		}
		final List<String> lines  = Files.readAllLines(Paths.get(args[0]));
		//assert lines size here
		final InputParser inputParser = new InputParser(lines);
		
		inputParser.getLogLines().stream().forEach(System.out::println); 
	}
}
