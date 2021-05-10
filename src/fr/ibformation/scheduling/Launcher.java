package fr.ibformation.scheduling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




import fr.ibformation.scheduling.bo.Schedule;

public class Launcher {

	public static Scanner scannerName = new Scanner(System.in); // ouverture du scanner en globale
	public static List<Schedule> nameArray = new ArrayList<Schedule>(); // ouverture de la liste en globale



	// créer une class horaires


	// Afficher la liste des films à une heure donnée

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		nameArray.add( new Schedule(1, "Harry", "mardi", 22, 24));	
		nameArray.add( new Schedule(2, "Potter", "samedi", 10, 12));	
		nameArray.add( new Schedule(3, "École", "lundi", 10, 13));	
		nameArray.add( new Schedule(4, "des", "jeudi", 12, 13));	
		nameArray.add( new Schedule(5, "sorciers", "mardi", 14, 24));	
		nameArray.add( new Schedule(6, "Eragon", "jeudi", 14, 24));	
		nameArray.add( new Schedule(7, "Jean", "mercredi", 22, 24));	
		nameArray.add( new Schedule(8, "Merde", "mercredi", 22, 24));	
		nameArray.add( new Schedule(9, "Le", "mercredi", 22, 24));	
		nameArray.add( new Schedule(10, "Front", "mercredi", 22, 24));	
		nameArray.add( new Schedule(11, "National", "mercredi", 22, 24));	




		for (int i = 0;	i < nameArray.size(); i++) { // affichage de la liste 1 by 1
			System.out.println(nameArray.get(i)); 			
		}



		System.out.println("choisissez un jour de la semaine"); // demande de saisie du jour
		String day = scannerName.next();
		System.out.println("jour choisi : " + day); // affichage du jour

		System.out.println("choisissez l'heure qui vous intéresse");
		int hour = scannerName.nextInt();
		System.out.println("heure choisie : " + hour); // affichage du jour



		// affichage de la liste des films du jour choisie

		for (int i = 0;	i < nameArray.size(); i ++) {

			if (nameArray.get(i).getFilmShowDate().equalsIgnoreCase(day) && 
					nameArray.get(i).getStartingHour() == hour) {
				System.out.println(nameArray.get(i));



			}

		}

	}

	/* if .getArticle().equalsIgnoreCase(toModifyArticle)) {
				System.out.println("Tapez le nouveau nom d'article");
				String newArticle = scannerName.next();
				nameArray.get(i).setArticle(newArticle);
				break; */
}



