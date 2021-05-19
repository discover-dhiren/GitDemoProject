package com.shuffling.algo;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class WeightedDeckInitializer {
	
	/**
	 * Method to initialize Weighted Shuffled Deck
	 * 
	 * @param randomizer - Randomizer Instance
	 * @param weight - No of Decks to be randomized
	 * @param deckCount - No of Cards in a Deck
	 * @return Weighted Shuffled Deck
	 */
	public static List<Integer> initializeWeightedShuffledDeck(SecureRandom randomizer, int weight, int deckCount) {
		List<Integer> weightedDeck = new ArrayList<>();
        List<Integer> shuffledList = new ArrayList<>();
        
        for(int iteration=0; iteration<weight; iteration++) {
        	
	        for (int i=0; i<deckCount; i++) {
	            int randomNumber = randomizer.nextInt(deckCount);
	            
	            if (randomNumber<deckCount && !shuffledList.contains(randomNumber))
	            	shuffledList.add(randomNumber);
	            else
	            	i--;
	            
			}
	        
	        weightedDeck.addAll(shuffledList);
	        
	        shuffledList.clear();
        }
        
        return weightedDeck;
	}
	
}