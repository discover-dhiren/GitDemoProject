package com.shuffling.algo.texas;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shuffling.algo.ShufflingAlgo;
import com.shuffling.algo.WeightedDeckInitializer;

public final class TexasShufflingAlgo implements ShufflingAlgo {
	
	/**
	 * Cards are:
	 * 0  - A of Club
	 * 1  - 2 of Club
	 * 2  - 3 of Club
	 * 3  - 4 of Club
	 * 4  - 5 of Club
	 * 5  - 6 of Club
	 * 6  - 7 of Club
	 * 7  - 8 of Club
	 * 8  - 9 of Club
	 * 9  - 10 of Club
	 * 10 - J of Club
	 * 11 - Q of Club
	 * 12 - K of Club
	 * 13 - A of Diamond
	 * 14 - 2 of Diamond
	 * 15 - 3 of Diamond
	 * 16 - 4 of Diamond
	 * 17 - 5 of Diamond
	 * 18 - 6 of Diamond
	 * 19 - 7 of Diamond
	 * 20 - 8 of Diamond
	 * 21 - 9 of Diamond
	 * 22 - 10 of Diamond
	 * 23 - J of Diamond
	 * 24 - Q of Diamond
	 * 25 - K of Diamond
	 * 26 - A of Heart
	 * 27 - 2 of Heart
	 * 28 - 3 of Heart
	 * 29 - 4 of Heart
	 * 30 - 5 of Heart
	 * 31 - 6 of Heart
	 * 32 - 7 of Heart
	 * 33 - 8 of Heart
	 * 34 - 9 of Heart
	 * 35 - 10 of Heart
	 * 36 - J of Heart
	 * 37 - Q of Heart
	 * 38 - K of Heart
	 * 39 - A of Spade
	 * 40 - 2 of Spade
	 * 41 - 3 of Spade
	 * 42 - 4 of Spade
	 * 43 - 5 of Spade
	 * 44 - 6 of Spade
	 * 45 - 7 of Spade
	 * 46 - 8 of Spade
	 * 47 - 9 of Spade
	 * 48 - 10 of Spade
	 * 49 - J of Spade
	 * 50 - Q of Spade
	 * 51 - K of Spade
	 */
	
	/**
	 * Secure Random Instance to be used to generate Random Numbers for Shuffled Deck
	 */
	private SecureRandom randomizer;
	
	/**
	 * Method to provide Shuffled Deck for the given No. of Players for Texas Game,
	 * taking in account Aggression Flag
	 * 
	 * @param playerCount - Player Count
	 * @param aggressive - 'true' if Algorithm should provide aggressive Results, else 'false'
	 * @return Shuffled Deck Array
	 */
	@Override
	public int[] shuffleDeck(int playerCount, boolean aggressive) {
		//Initialize Radomizer:
		byte[] randomSeed = new byte[20];
        
        new SecureRandom().nextBytes(randomSeed);
        
        randomSeed[(int)(Math.random()*20)] = (byte)(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli());
		
        randomizer = new SecureRandom(randomSeed);
		
		//Initialize Weighted Deck:
		List<Integer> weightedDeck = WeightedDeckInitializer.initializeWeightedShuffledDeck(randomizer, 6, deckCount);
		
		//Compose Shuffled Deck:
		int[] shuffledDeck = getShuffledDeck(weightedDeck, playerCount, aggressive);
		
		return shuffledDeck;
	}
	
	/**
	 * Method to get Shuffled Deck from Weighted Randomized Deck
	 * 
	 * @param weightedDeck
	 * @param playerCount
	 * @return shuffledDeck
	 */
	private int[] getShuffledDeck(List<Integer> weightedDeck, int playerCount, boolean aggressive) {
		int[] shuffledDeck = new int[deckCount]; 
		
		List<List<Integer>> playerCardList = new ArrayList<>();
		
		boolean playerCardsDistributed = false;
		boolean communityCardsDistributed = false;
		
		int count = 0;
		int cardNo = 1;
		int cardIndex;
		
		List<Integer> distributedCardList = new ArrayList<>();
		
		for (int i=0; i<deckCount; i++) {
			if (!playerCardsDistributed) {
				//Have to get Player Cards:
				if (cardNo==1) {
					//This is Player's First Card:
					cardIndex = getCardIndex(weightedDeck, null, aggressive);
					
					//Add this Card to shuffledDeck:
					shuffledDeck[i] = cardIndex;
					
					//Also add this Card to this Player's Card List:
					playerCardList.add(new ArrayList<>(Arrays.asList(cardIndex)));
					distributedCardList.add(cardIndex);
				} else {
					//This is second Card:
					//Reduced Chances of Him getting favored Cards that he already has:
					cardIndex = getCardIndex(weightedDeck, playerCardList.get(count), aggressive);
					
					//Add this Card to shuffledDeck:
					shuffledDeck[i] = cardIndex;
					
					//Also add this Card to this Player's Card List:
					playerCardList.get(count).add(cardIndex);
					distributedCardList.add(cardIndex);
				}
			} else if (!communityCardsDistributed) {
				//Have to get Community Cards:
				//Hence merge all Distributed Cards & reduce
				//Reduced Chances of getting favored Cards:
				//Here aggression should be preferably kept low, as high aggression
				//might be counter-productive:
				cardIndex = getCardIndex(weightedDeck, distributedCardList, false);
				
				//Add this Card to shuffledDeck:
				shuffledDeck[i] = cardIndex;
				
				//Also add this Card to this Distributed Card List:
				distributedCardList.add(cardIndex);
			} else {
				//Irrelevant Cards:
				cardIndex = getCardIndex(weightedDeck, null, aggressive);
				
				//Add this Card to shuffledDeck:
				shuffledDeck[i] = cardIndex;
			}
			
			//Set the properties:
			count++;
			
			if (!playerCardsDistributed) {
				//Players Cards haven't been distributed:
				if (count>=playerCount) {
					count = 0;
					cardNo++;
				}
				
				playerCardsDistributed = cardNo>2;
			} else if (!communityCardsDistributed) {
				if (count>=5) {
					communityCardsDistributed = true;
				}
			}
			
		}
		
		return shuffledDeck;
	}
	
	/**
	 * Get Card Index from Weighted Randomized Deck
	 * 
	 * @param weightedDeck
	 * @param distributedCards
	 * @param aggressive
	 * @return 
	 */
	private int getCardIndex(List<Integer> weightedDeck, List<Integer> distributedCards, boolean aggressive) {
		int cardIndex;
		
		if (distributedCards==null) {
			cardIndex = weightedDeck.remove(randomizer.nextInt(weightedDeck.size()));
		} else {
			//Reduced Favored Cards weight:
			List<Integer> updatedWeightedDeck = new ArrayList<>(weightedDeck);
			
			reduceFavoredWeight(updatedWeightedDeck, distributedCards, aggressive);
			
			cardIndex = updatedWeightedDeck.remove(randomizer.nextInt(updatedWeightedDeck.size()));
		}
		
		while (weightedDeck.contains(cardIndex)) {
			weightedDeck.remove((Object)cardIndex);
		}
		
		return cardIndex;
	}
	
	/**
	 * Method to reduce weight of Favored Cards as per given Distributed Cards:
	 * 
	 * @param updatedWeightedDeck
	 * @param distributedCards
	 * @param aggressive
	 */
	private void reduceFavoredWeight(List<Integer> updatedWeightedDeck, List<Integer> distributedCards, boolean aggressive) {
		//To reduce. consider following approach:
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		//Populate Favored Cards, so that their weight can be managed properly:
		distributedCards.stream().
			forEach(card -> {
				Map<Integer, Integer> tempFlavoredCards = TexasFavoredCardProvider.fillFavoredCards(card, aggressive);
				
				if (tempFlavoredCards!=null)
					favoredCards.putAll(TexasFavoredCardProvider.fillFavoredCards(card, aggressive));
				
			});
		
		//Now Remove the Favored Cards as per their Removal Weight from WeightedDeck:
		favoredCards.entrySet().stream().forEach(favoredCardEntry -> {
			//Randomly Remove occurrence of this Card as per the Weight represented by Value:
			for (int i=0; i<favoredCardEntry.getValue(); i++) {
				int count = (int)updatedWeightedDeck.stream().filter(weightedCard -> weightedCard==favoredCardEntry.getKey()).count();
				
				if (count>1) {
					int removalCount = randomizer.nextInt(count)+1;
					
					for (int j=0; j<updatedWeightedDeck.size(); j++) {
						if (updatedWeightedDeck.get(j)==favoredCardEntry.getKey()) {
							removalCount--;
							
							if (removalCount<=0) {
								updatedWeightedDeck.remove(j);
								break;
							}
						}
					}
				} else {
					break;
				}
			}
		});
		
	}
	
}