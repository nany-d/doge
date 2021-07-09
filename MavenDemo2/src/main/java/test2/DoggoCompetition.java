package test2;

import java.util.ArrayList;

public class DoggoCompetition {

	private ArrayList<String> dogPlace = new ArrayList();

	public String doggoComp(int placement) {
		// Make an arraylist of all positions

		for (int i = 1; i <= 100; i++) {
			if (((i - 1) % 10) == 0) {
				String s = "st";
				dogPlace.add("" + i + s);
			} else if (((i - 2) % 10) == 0) {
				String s = "nd";
				dogPlace.add("" + i + s);
			} else if (((i - 3) % 10) == 0) {
				String s = "rd";
				dogPlace.add("" + i + s);
			} else {
				String s = "th";
				dogPlace.add("" + i + s);
			}

		}

		// add Doge remove that position
		for (int i = 1; i <= 101; i++) {
			if (i == 101) {
				dogPlace.add((i - 1), "Doge");
				break;
			}
			if (placement == i) {
				dogPlace.add((i - 1), "Doge");
				dogPlace.remove(i);
				break;
			}
		}

		// return the arraylist
		return "" + dogPlace;
	}
}
