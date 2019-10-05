package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double shrek = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>shrek) {
				shrek = peeps.get(i);
			}
		}
		return shrek;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String wordShrek = "a";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>wordShrek.length()) {
				wordShrek = words.get(i);
			}
		}
		return wordShrek;
	}

	public static boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		String SOS = "... --- ...";
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains(SOS)==true) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		double hold = 0.0;
		for (int j = 0; j < results.size(); j++) {
			
		
		for (int i = 0; i < results.size()-1; i++) {
			if(results.get(i)>results.get(i+1)) {
				hold = results.get(i);
				results.set(i, results.get(i+1));
				results.set(i+1, hold);
			}
		}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		String hold = " ";
		for (int j = 0; j < unsortedSequences.size(); j++) {
			
		
		for (int i = 0; i < unsortedSequences.size()-1; i++) {
			if(unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
				hold = unsortedSequences.get(i);
				unsortedSequences.set(i, unsortedSequences.get(i+1));
				unsortedSequences.set(i+1, hold);
			}
		}		
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		String hold = " ";
		for (int j = 0; j < words.size(); j++) {
			for (int i = 0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1))>0) {
					hold = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, hold);
				}
			}
		}
		
		
		return words;
	}
}
