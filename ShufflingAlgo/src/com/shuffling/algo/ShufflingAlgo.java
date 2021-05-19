package com.shuffling.algo;

public interface ShufflingAlgo {
	
	/**
	 * Cards in a Deck
	 */
	short deckCount = 52;
	
	/**
	 * Method to provide Shuffled Deck for the given No. of Players, taking in account Aggression Flag
	 * 
	 * @param playerCount - Player Count
	 * @param aggressive - 'true' if Algorithm should provide aggressive Results, else 'false'
	 * @return Shuffled Deck Array
	 */
	public int[] shuffleDeck(int playerCount, boolean aggressive);
	
}