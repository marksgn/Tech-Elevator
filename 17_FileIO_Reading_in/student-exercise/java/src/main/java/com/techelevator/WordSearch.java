package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	public static void main(String[] args) {
	
		File inputFile = getFileToSearchFrom();
		String word = wordToSearch();
		searching(inputFile, word);	
	}

	public static File getFileToSearchFrom() {
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner(System.in);
		System.out.println("Please enter the path to the file: ");
		String filePath = fileInput.nextLine();
		
		File inputFile = new File(filePath);
		if (!inputFile.exists()) {
			System.out.println(filePath + " does Not exist");
			System.exit(1);
			
		}else if (!inputFile.isFile()) {
			System.out.println(filePath + " is not a file");
			System.exit(1);
			
		}return inputFile;
		
	}
	
	public static String wordToSearch() {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a word to search: ");
		String word = userInput.nextLine();
		return word;
	}
	
	public static String searching(File inputFile, String searchedWord) {
		
		@SuppressWarnings("resource")
		Scanner isItCaseSensitive = new Scanner(System.in);
		System.out.println("Would you like your search to be case sensitive? (Y/N)");
		String yesOrNo = isItCaseSensitive.nextLine().toLowerCase().substring(0, 1);
		
		try (Scanner input = new Scanner(inputFile)) {
			int x = 0;
			
			while (input.hasNextLine()) {
				if (yesOrNo.equals("n")) {
					x++;
					String line = input.nextLine();
					if (line.toLowerCase().contains(searchedWord.toLowerCase())) {
							System.out.println(x + ") " + line);
							
					}else {
					}
				}else {
					String line = input.nextLine();
					if (line.contains(searchedWord)) {
						System.out.println(x + ") " + line);
					}
				}
			}
		}catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist");
		}
		return " ";
	
	}
	

}
