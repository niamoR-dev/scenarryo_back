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
		
		// renvoie le nombre de mots dans la liste bad_words
		badWordsFunction();
		
		// import du fichier et conversion en un arraylist
	    File txt = new File("files/bad_words.txt");
	    Scanner scan = new Scanner(txt);
	    ArrayList<String> data = new ArrayList<String>() ;
	    while(scan.hasNextLine()){
	        data.add(scan.nextLine());
	    }
	    System.out.println(data);
	    String[] simpleArray = data.toArray(new String[]{});
	    
		// comparaison d'un text à la liste et remplacement des mauvais mots par ****
	    String text = "je me promène dans un champ avec un connard et sa salope de copine. soudain nous croisons une pute et mon pote se met à l'enculer.";
	    for (String word : simpleArray) {
	        String xxx = new String(new char[word.length()]).replace("\0", "*");        
	        text = text.replace(word, xxx);
	    }
	    System.out.println(text);
	    scan.close();

	    

}
	
// --------------------------------------------------------------------------------------------------------------
// ------------------------------------------- functions --------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------

	
// method to discriminate bad words

	public static void badWordsFunction() {
	
		try (
				FileInputStream fichier = new FileInputStream("files/bad_words.txt"); // This will be automaticaly closed when the try / catch is finished with this syntax
				Scanner s = new Scanner(fichier); // This will be automaticaly closed when the try / catch is finished with this syntax
			) {
				int countWord = 0;
				// If my scanner have a next line
				while (s.hasNextLine()) {
					countWord++;
					s.nextLine(); // Go to the next line
				}
				System.out.println("countWord : "+countWord);
			} catch (IOException e) {
				System.out.println("[DemoFile] numberOfLineIntoFile : An error from count the number of words into file !");
				System.out.println(e);
			}
		
	}

	
	
// --------------------------------------------------------------------------------------------------------------

}


