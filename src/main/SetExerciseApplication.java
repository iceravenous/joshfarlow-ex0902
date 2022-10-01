package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetExerciseApplication {
	
	// instantiate new hashset

	public static void main(String[] args) {
		Set<String> deck = new LinkedHashSet<>();
		
		// extract the data from the CSV
		deck=extractDataFromCSV("PokerHands.csv");
		printToConsole(deck);


		// remove ACE HIGH and QUEEN HIGH
		
		
		// Update PAIR to DEUCES
		
		
		
	}
	
	public static void printToConsole(Set<String> cards) {
		for (String card : cards) {
			System.out.println(card);
		}
	}
	
	public static Set<String> extractDataFromCSV(String fileName) {
		BufferedReader fileReader = null;
		
		try {
			//int i = 0;
			String line = null;
			Set<String> cards = new LinkedHashSet<>();
						
			fileReader = new BufferedReader(new FileReader(fileName));
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				String hand = new String(lineData[1]);
				cards.add(hand);
				

				//i++;
			}
//			for (String card : cards) {
//				System.out.println(card);
//			}
			//return students
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		return null;
	}

}
