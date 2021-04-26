package fr.ibformation.scenarryoapp.launcher;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import fr.ibformation.scenarryoapp.bo.*;

public class Launcher {

	public static void main(String[] args) throws FileNotFoundException {

		Room room1 = new Room(0, 0, 0, 0);
		Category category1 = new Category(0, null);
		Actor actor1 = new Actor(0, null, null);
		FilmShow filmShow1 = new FilmShow(0, 0, 0, null, null, null);
		Movie movie1 = new Movie(0, null, null, null, null, null, null, null, null, null);
		Schedule schedule1 = new Schedule(0, null, null, null);
		
		System.out.println("test");
		
		
		
		
		
		
		
		
		
		
// methode pour filter les mauvais mots à partir d'une liste		
		
		String text = "je me promène dans un champ avec un connard et sa salope de copine. soudain nous croisons une pute et mon pote se met à l'enculer.";
		
		// renvoie le texte avec remplacement des bad_words
		String returnedText = badWordsFunction(text);
	    System.out.println(returnedText);

	    
	    
}
	
// --------------------------------------------------------------------------------------------------------------
// ------------------------------------------- functions --------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------

	// method to discriminate bad words
	
	public static String badWordsFunction(String text) throws FileNotFoundException {
		
		// import du fichier et conversion en un arraylist
	    File txt = new File("files/bad_words.txt");
	    Scanner scan = new Scanner(txt);
	    int countWord = 0;
	    ArrayList<String> badWords = new ArrayList<String>() ;
	    while(scan.hasNextLine()){
	    	badWords.add(scan.nextLine());
			countWord++;
			
	    }
		System.out.println("nombre de mauvais mots : "+countWord);
	    System.out.println(badWords);
	    
		// comparaison d'un text à la liste et remplacement des mauvais mots par ****
	    for (String word : badWords) {
	        String xxx = new String(new char[word.length()]).replace("\0", "*");        
	        text = text.toLowerCase().replace(word, xxx);
	    }
	    scan.close();
	    
	    return text;
	}
	
	
	
// --------------------------------------------------------------------------------------------------------------

}


