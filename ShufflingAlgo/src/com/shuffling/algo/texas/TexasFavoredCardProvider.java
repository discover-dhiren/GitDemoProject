package com.shuffling.algo.texas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shuffling.algo.RemovalCount;

final class TexasFavoredCardProvider {
	
	/**
	 * Method to populate Cards that favor given Cards &how much their weight is to be reduced
	 * 
	 * @param card - Cards whose Favored Cards are to be calculated & returned
	 * @param aggressive - If 'true' the Favored Cards will be added in aggression(Removal Weight will be higher),
	 * 					   otherwise under Mild Aggression
	 * @return Map of Favored Cards & their Removal Weights,
	 * 		   or 'null' if the Card is an Invalid Card
	 */
	static Map<Integer, Integer> fillFavoredCards(int card, boolean aggressive) {
		switch (card) {
			case 0:	//A of Club
			case 13://A of Diamond
			case 26://A of Heart
			case 39://A of Spade
				return fillAceFavoredCards(card, aggressive);
			case 1:	//2 of Club
			case 14://2 of Diamond
			case 27://2 of Heart
			case 40://2 of Spade
				return fillTwoFavoredCards(card, aggressive);
			case 2:	//3 of Club
			case 15://3 of Diamond
			case 28://3 of Heart
			case 41://3 of Spade
				return fillThreeFavoredCards(card, aggressive);
			case 3:	//4 of Club
			case 16://4 of Diamond
			case 29://4 of Heart
			case 42://4 of Spade
				return fillFourFavoredCards(card, aggressive);
			case 4:	//5 of Club
			case 17://5 of Diamond
			case 30://5 of Heart
			case 43://5 of Spade
				return fillFiveFavoredCards(card, aggressive);
			case 5:	//6 of Club
			case 18://6 of Diamond
			case 31://6 of Heart
			case 44://6 of Spade
				return fillSixFavoredCards(card, aggressive);
			case 6:	//7 of Club
			case 19://7 of Diamond
			case 32://7 of Heart
			case 45://7 of Spade
				return fillSevenFavoredCards(card, aggressive);
			case 7:	//8 of Club
			case 20://8 of Diamond
			case 33://8 of Heart
			case 46://8 of Spade
				return fillEightFavoredCards(card, aggressive);
			case 8:	//9 of Club
			case 21://9 of Diamond
			case 34://9 of Heart
			case 47://9 of Spade
				return fillNineFavoredCards(card, aggressive);
			case 9:	//10 of Club
			case 22://10 of Diamond
			case 35://10 of Heart
			case 48://10 of Spade
				return fillTenFavoredCards(card, aggressive);
			case 10://J of Club
			case 23://J of Diamond
			case 36://J of Heart
			case 49://J of Spade
				return fillJackFavoredCards(card, aggressive);
			case 11://Q of Club
			case 24://Q of Diamond
			case 37://Q of Heart
			case 50://Q of Spade
				return fillQueenFavoredCards(card, aggressive);
			case 12://K of Club
			case 25://K of Diamond
			case 38://K of Heart
			case 51://K of Spade
				return fillKingFavoredCards(card, aggressive);
			default:
				return null;
		}
	}
	
	/**
	 * Method to populate Card that favor given Ace
	 * 
	 * @param card - Identifier for which Ace it is(0, 13, 26, 39) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @return Map of Favored Cards & their Removal Weights
	 */
	private static Map<Integer, Integer> fillAceFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<Integer, Integer>();
		
		List<Integer> aceCards =  new ArrayList<Integer>(Arrays.asList(0, 13, 26, 39));
		
		aceCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 10, J, Q, K of Same Suit			5
			//Same Suit = 6, 7, 8, 9 of Same Suit								3
			//Same Face Value = A of Other Suits								4
			//Different Suit Sequence = 2, 3, 4, 5, 10, J, Q, K of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+9), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+10), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+11), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			favoredCards.put((card+12), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			
			aceCards.stream().forEach(aceCard -> {
				//Same Face Value: High(4)
				favoredCards.put(aceCard, RemovalCount.HIGH.ordinal());			//A of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((aceCard+1), RemovalCount.HIGH.ordinal());		//2 of Other Suit
				favoredCards.put((aceCard+2), RemovalCount.HIGH.ordinal());		//3 of Other Suit
				favoredCards.put((aceCard+3), RemovalCount.HIGH.ordinal());		//4 of Other Suit
				favoredCards.put((aceCard+4), RemovalCount.HIGH.ordinal());		//5 of Other Suit
				favoredCards.put((aceCard+9), RemovalCount.HIGH.ordinal());		//10 of Other Suit
				favoredCards.put((aceCard+10), RemovalCount.HIGH.ordinal());	//J of Other Suit
				favoredCards.put((aceCard+11), RemovalCount.HIGH.ordinal());	//Q of Other Suit
				favoredCards.put((aceCard+12), RemovalCount.HIGH.ordinal());	//K of Other Suit
			});
			
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, J, K	of Same Suit		5
			//Same Suit = 3, 5, 6, 7, 8, 9, 10, Q of Same Suit					3
			//Same Face Value = A of Other Suits								4
			//Different Suit Sequence Intermediates = 3, 5, 10, Q of Other Suits3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+10), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+12), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card+4), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+11), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			
			aceCards.stream().forEach(aceCard -> {
				//Same Face Value: High(4)
				favoredCards.put(aceCard, RemovalCount.HIGH.ordinal());			//A of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((aceCard+2), RemovalCount.MEDIUM.ordinal());	//3 of Other Suit
				favoredCards.put((aceCard+4), RemovalCount.MEDIUM.ordinal());	//5 of Other Suit
				favoredCards.put((aceCard+9), RemovalCount.MEDIUM.ordinal());	//10 of Other Suit
				favoredCards.put((aceCard+11), RemovalCount.MEDIUM.ordinal());	//Q of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 2
	 * 
	 * @param card - Identifier for which 2 it is(1, 14, 27, 40) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillTwoFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> twoCards =  new ArrayList<Integer>(Arrays.asList(1, 14, 27, 40));
		
		twoCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 3, 4, 5, 6 of Same Suit					5
			//Same Suit = 7, 8, 9, 10, J, Q, K of Same Suit						3
			//Same Face Value = 2 of Other Suits								4
			//Different Suit Sequence = A, 3, 4, 5, 6 of Other Suits			4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+10), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+11), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			twoCards.stream().forEach(twoCard -> {
				//Same Face Value: High(4)
				favoredCards.put(twoCard, RemovalCount.HIGH.ordinal());			//2 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((twoCard-1), RemovalCount.HIGH.ordinal());		//A of Other Suit
				favoredCards.put((twoCard+1), RemovalCount.HIGH.ordinal());		//3 of Other Suit
				favoredCards.put((twoCard+2), RemovalCount.HIGH.ordinal());		//4 of Other Suit
				favoredCards.put((twoCard+3), RemovalCount.HIGH.ordinal());		//5 of Other Suit
				favoredCards.put((twoCard+4), RemovalCount.HIGH.ordinal());		//6 of Other Suit
			});
			
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 3, 5, 6 of Same Suit			5
			//Same Suit = A, 4, 7, 8, 9, 10, J, Q, K of Same Suit				3
			//Same Face Value = 2 of Other Suit									4
			//Different Suit Sequence Intermediates = A, 4, 6 of Other Suit		3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+10), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+11), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			twoCards.stream().forEach(twoCard -> {
				//Same Face Value: High(4)
				favoredCards.put(twoCard, RemovalCount.HIGH.ordinal());			//2 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((twoCard-1), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((twoCard+2), RemovalCount.MEDIUM.ordinal());	//4 of Other Suit
				favoredCards.put((twoCard+4), RemovalCount.MEDIUM.ordinal());	//6 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 3
	 * 
	 * @param card - Identifier for which 3 it is(2, 15, 28, 41) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillThreeFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> threeCards =  new ArrayList<Integer>(Arrays.asList(2, 15, 28, 41));
		
		threeCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 4, 5, 6, 7 of Same Suit				5
			//Same Suit = 8, 9, 10, J, Q, K of Same Suit						3
			//Same Face Value = 3 of Other Suits								4
			//Different Suit Sequence = A, 2, 4, 5, 6, 7 of Other Suits			4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+10), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			threeCards.stream().forEach(threeCard -> {
				//Same Face Value: High(4)
				favoredCards.put(threeCard, RemovalCount.HIGH.ordinal());		//3 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((threeCard-2), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((threeCard-1), RemovalCount.HIGH.ordinal());	//2 of Other Suit
				favoredCards.put((threeCard+1), RemovalCount.HIGH.ordinal());	//4 of Other Suit
				favoredCards.put((threeCard+2), RemovalCount.HIGH.ordinal());	//5 of Other Suit
				favoredCards.put((threeCard+3), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((threeCard+4), RemovalCount.HIGH.ordinal());	//7 of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Same Suit			5
			//Same Suit = A, 4, 6, 8, 9, 10, J, Q, K of Same Suit				3
			//Same Face Value = 3 of Other Suits								4
			//Different Suit Sequence Intermediates = A, 4, 6 of Other Suits	3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card+1), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card+3), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+10), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			threeCards.stream().forEach(threeCard -> {
				//Same Face Value: High(4)
				favoredCards.put(threeCard, RemovalCount.HIGH.ordinal());		//3 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((threeCard-2), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((threeCard+1), RemovalCount.MEDIUM.ordinal());	//4 of Other Suit
				favoredCards.put((threeCard+3), RemovalCount.MEDIUM.ordinal());	//6 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 4
	 * 
	 * @param card - Identifier for which 4 it is(3, 16, 29, 42) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillFourFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> fourCards =  new ArrayList<Integer>(Arrays.asList(3, 16, 29, 42));
		
		fourCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Same Suit				5
			//Same Suit = 9, 10, J, Q, K of Same Suit							3
			//Same Face Value = 4 of Other Suits								4
			//Different Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Other Suits		4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			fourCards.stream().forEach(fourCard -> {
				//Same Face Value: High(4)
				favoredCards.put(fourCard, RemovalCount.HIGH.ordinal());		//4 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((fourCard-3), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((fourCard-2), RemovalCount.HIGH.ordinal());	//2 of Other Suit
				favoredCards.put((fourCard-1), RemovalCount.HIGH.ordinal());	//3 of Other Suit
				favoredCards.put((fourCard+1), RemovalCount.HIGH.ordinal());	//5 of Other Suit
				favoredCards.put((fourCard+2), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((fourCard+3), RemovalCount.HIGH.ordinal());	//7 of Other Suit
				favoredCards.put((fourCard+4), RemovalCount.HIGH.ordinal());	//8 of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Same Suit			5
			//Same Suit = A, 3, 6, 8, 9, 10, J, Q, K of Same Suit				3
			//Same Face Value = 4 of Other Suits								4
			//Different Suit Sequence Intermediates = A, 3, 6, 8 of Other Suits	3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-3), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card+4), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+9), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			fourCards.stream().forEach(fourCard -> {
				//Same Face Value: High(4)
				favoredCards.put(fourCard, RemovalCount.HIGH.ordinal());		//4 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((fourCard-3), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((fourCard-1), RemovalCount.MEDIUM.ordinal());	//3 of Other Suit
				favoredCards.put((fourCard+2), RemovalCount.MEDIUM.ordinal());	//6 of Other Suit
				favoredCards.put((fourCard+4), RemovalCount.MEDIUM.ordinal());	//8 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 5
	 * 
	 * @param card - Identifier for which 5 it is(4, 17, 30, 43) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillFiveFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> fiveCards =  new ArrayList<Integer>(Arrays.asList(4, 17, 30, 43));
		
		fiveCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Same Suit			5
			//Same Suit = 10, J, Q, K of Same Suit								3
			//Same Face Value = 5 of Other Suits								4
			//Different Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			fiveCards.stream().forEach(fiveCard -> {
				//Same Face Value: High(4)
				favoredCards.put(fiveCard, RemovalCount.HIGH.ordinal());		//5 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((fiveCard-4), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((fiveCard-3), RemovalCount.HIGH.ordinal());	//2 of Other Suit
				favoredCards.put((fiveCard-2), RemovalCount.HIGH.ordinal());	//3 of Other Suit
				favoredCards.put((fiveCard-1), RemovalCount.HIGH.ordinal());	//4 of Other Suit
				favoredCards.put((fiveCard+1), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((fiveCard+2), RemovalCount.HIGH.ordinal());	//7 of Other Suit
				favoredCards.put((fiveCard+3), RemovalCount.HIGH.ordinal());	//8 of Other Suit
				favoredCards.put((fiveCard+4), RemovalCount.HIGH.ordinal());	//9 of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Same Suit		5
			//Same Suit = A, 3, 6, 8, 10, J, Q, K of Same Suit					3
			//Same Face Value = 5 of Other Suits								4
			//Different Suit Sequence Intermediates = A, 3, 6, 8 of Other Suits	3
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-4), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card+1), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card+3), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+8), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			fiveCards.stream().forEach(fiveCard -> {
				//Same Face Value: High(4)
				favoredCards.put(fiveCard, RemovalCount.HIGH.ordinal());		//5 of Other Suit
				
				//Different Suit Sequence: Medium(3)
				favoredCards.put((fiveCard-4), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((fiveCard-2), RemovalCount.MEDIUM.ordinal());	//3 of Other Suit
				favoredCards.put((fiveCard+1), RemovalCount.MEDIUM.ordinal());	//6 of Other Suit
				favoredCards.put((fiveCard+3), RemovalCount.MEDIUM.ordinal());	//8 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 6
	 * 
	 * @param card - Identifier for which 6 it is(5, 18, 31, 44) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillSixFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> sixCards =  new ArrayList<Integer>(Arrays.asList(5, 18, 31, 44));
		
		sixCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Same Suit			5
			//Same Suit = A, J, Q, K of Same Suit								3
			//Same Face Value = 6 of Other Suits								4
			//Different Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			sixCards.stream().forEach(sixCard -> {
				//Same Face Value: High(4)
				favoredCards.put(sixCard, RemovalCount.HIGH.ordinal());			//6 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((sixCard-4), RemovalCount.HIGH.ordinal());		//2 of Other Suit
				favoredCards.put((sixCard-3), RemovalCount.HIGH.ordinal());		//3 of Other Suit
				favoredCards.put((sixCard-2), RemovalCount.HIGH.ordinal());		//4 of Other Suit
				favoredCards.put((sixCard-1), RemovalCount.HIGH.ordinal());		//5 of Other Suit
				favoredCards.put((sixCard+1), RemovalCount.HIGH.ordinal());		//7 of Other Suit
				favoredCards.put((sixCard+2), RemovalCount.HIGH.ordinal());		//8 of Other Suit
				favoredCards.put((sixCard+3), RemovalCount.HIGH.ordinal());		//9 of Other Suit
				favoredCards.put((sixCard+4), RemovalCount.HIGH.ordinal());		//10 of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Same Suit		5
			//Same Suit = A, 3, 5, 8, 10, J, Q, K of Same Suit					3
			//Same Face Value = 6 of Other Suits								4
			//Different Suit Sequence Intermediates = 3, 5, 8, 10 of Other Suits3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//2 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-3), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+4), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+7), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			sixCards.stream().forEach(sixCard -> {
				//Same Face Value: High(4)
				favoredCards.put(sixCard, RemovalCount.HIGH.ordinal());			//6 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((sixCard-3), RemovalCount.MEDIUM.ordinal());	//3 of Other Suit
				favoredCards.put((sixCard-1), RemovalCount.MEDIUM.ordinal());	//5 of Other Suit
				favoredCards.put((sixCard+2), RemovalCount.MEDIUM.ordinal());	//8 of Other Suit
				favoredCards.put((sixCard+4), RemovalCount.MEDIUM.ordinal());	//10 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 7
	 * 
	 * @param card - Identifier for which 7 it is(6, 19, 32, 45) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillSevenFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> sevenCards =  new ArrayList<Integer>(Arrays.asList(6, 19, 32, 45));
		
		sevenCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Same Suit			5
			//Same Suit = A, 2, Q, K of Same Suit								3
			//Same Face Value = 7 of Other Suits								4
			//Different Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//3 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			sevenCards.stream().forEach(sevenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(sevenCard, RemovalCount.HIGH.ordinal());		//7 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((sevenCard-4), RemovalCount.HIGH.ordinal());	//3 of Other Suit
				favoredCards.put((sevenCard-3), RemovalCount.HIGH.ordinal());	//4 of Other Suit
				favoredCards.put((sevenCard-2), RemovalCount.HIGH.ordinal());	//5 of Other Suit
				favoredCards.put((sevenCard-1), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((sevenCard+1), RemovalCount.HIGH.ordinal());	//8 of Other Suit
				favoredCards.put((sevenCard+2), RemovalCount.HIGH.ordinal());	//9 of Other Suit
				favoredCards.put((sevenCard+3), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((sevenCard+4), RemovalCount.HIGH.ordinal());	//J of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Same Suit		5
			//Same Suit = A, 2, 3, 5, 8, 10, Q, K of Same Suit					3
			//Same Face Value = 7 of Other Suits								4
			//Different Suit Sequence Intermediates = 3, 5, 8, 10 of Other Suits3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-4), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card+1), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card+3), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+6), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			sevenCards.stream().forEach(sevenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(sevenCard, RemovalCount.HIGH.ordinal());		//7 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((sevenCard-4), RemovalCount.MEDIUM.ordinal());	//3 of Other Suit
				favoredCards.put((sevenCard-2), RemovalCount.MEDIUM.ordinal());	//5 of Other Suit
				favoredCards.put((sevenCard+1), RemovalCount.MEDIUM.ordinal());	//8 of Other Suit
				favoredCards.put((sevenCard+3), RemovalCount.MEDIUM.ordinal());	//10 of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 8
	 * 
	 * @param card - Identifier for which 8 it is(7, 20, 33, 46) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillEightFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> eightCards =  new ArrayList<Integer>(Arrays.asList(7, 20, 33, 46));
		
		eightCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Same Suit			5
			//Same Suit = A, 2, 3, K of Same Suit								3
			//Same Face Value = 8 of Other Suits								4
			//Different Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			eightCards.stream().forEach(eightCard -> {
				//Same Face Value: High(4)
				favoredCards.put(eightCard, RemovalCount.HIGH.ordinal());		//8 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((eightCard-4), RemovalCount.HIGH.ordinal());	//4 of Other Suit
				favoredCards.put((eightCard-3), RemovalCount.HIGH.ordinal());	//5 of Other Suit
				favoredCards.put((eightCard-2), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((eightCard-1), RemovalCount.HIGH.ordinal());	//7 of Other Suit
				favoredCards.put((eightCard+1), RemovalCount.HIGH.ordinal());	//9 of Other Suit
				favoredCards.put((eightCard+2), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((eightCard+3), RemovalCount.HIGH.ordinal());	//J of Other Suit
				favoredCards.put((eightCard+4), RemovalCount.HIGH.ordinal());	//Q of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Same Suit		5
			//Same Suit = A, 2, 3, 5, 7, 10, Q, K of Same Suit					3
			//Same Face Value = 8 of Other Suits								4
			//Different Suit Sequence Intermediates = 5, 7, 10, Q of Other Suits3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//4 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-3), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+4), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			favoredCards.put((card+5), RemovalCount.MEDIUM.ordinal());			//K of Same Suit
			
			eightCards.stream().forEach(eightCard -> {
				//Same Face Value: High(4)
				favoredCards.put(eightCard, RemovalCount.HIGH.ordinal());		//8 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((eightCard-3), RemovalCount.MEDIUM.ordinal());	//5 of Other Suit
				favoredCards.put((eightCard-1), RemovalCount.MEDIUM.ordinal());	//7 of Other Suit
				favoredCards.put((eightCard+2), RemovalCount.MEDIUM.ordinal());	//10 of Other Suit
				favoredCards.put((eightCard+4), RemovalCount.MEDIUM.ordinal());	//Q of Other Suit
			});
		}
		
		return favoredCards;
	}

	/**
	 * Method to populate Card that favor given 9
	 * 
	 * @param card - Identifier for which 9 it is(8, 21, 34, 47) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillNineFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> nineCards =  new ArrayList<Integer>(Arrays.asList(8, 21, 34, 47));
		
		nineCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Same Suit			5
			//Same Suit = A, 2, 3, 4 of Same Suit								3
			//Same Face Value = 9 of Other Suits								4
			//Different Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//5 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			
			nineCards.stream().forEach(nineCard -> {
				//Same Face Value: High(4)
				favoredCards.put(nineCard, RemovalCount.HIGH.ordinal());		//9 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((nineCard-4), RemovalCount.HIGH.ordinal());	//5 of Other Suit
				favoredCards.put((nineCard-3), RemovalCount.HIGH.ordinal());	//6 of Other Suit
				favoredCards.put((nineCard-2), RemovalCount.HIGH.ordinal());	//7 of Other Suit
				favoredCards.put((nineCard-1), RemovalCount.HIGH.ordinal());	//8 of Other Suit
				favoredCards.put((nineCard+1), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((nineCard+2), RemovalCount.HIGH.ordinal());	//J of Other Suit
				favoredCards.put((nineCard+3), RemovalCount.HIGH.ordinal());	//Q of Other Suit
				favoredCards.put((nineCard+4), RemovalCount.HIGH.ordinal());	//K of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Same Suit		5
			//Same Suit = A, 2, 3, 4, 5, 7, 10, Q of Same Suit					3
			//Same Face Value = 9 of Other Suits								4
			//Different Suit Sequence Intermediates = 5, 7, 10, Q of Other Suits3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+4), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-4), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card+1), RemovalCount.MEDIUM.ordinal());			//10 of Same Suit
			favoredCards.put((card+3), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			
			nineCards.stream().forEach(nineCard -> {
				//Same Face Value: High(4)
				favoredCards.put(nineCard, RemovalCount.HIGH.ordinal());		//9 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((nineCard-4), RemovalCount.MEDIUM.ordinal());	//5 of Other Suit
				favoredCards.put((nineCard-2), RemovalCount.MEDIUM.ordinal());	//7 of Other Suit
				favoredCards.put((nineCard+1), RemovalCount.MEDIUM.ordinal());	//10 of Other Suit
				favoredCards.put((nineCard+3), RemovalCount.MEDIUM.ordinal());	//Q of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given 10
	 * 
	 * @param card - Identifier for which 10 it is(9, 22, 35, 48) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillTenFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> tenCards =  new ArrayList<Integer>(Arrays.asList(9, 22, 35, 48));
		
		tenCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Same Suit			5
			//Same Suit = 2, 3, 4, 5 of Same Suit								3
			//Same Face Value = 10 of Other Suits								4
			//Different Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Other Suits	4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-9), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			
			tenCards.stream().forEach(tenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(tenCard, RemovalCount.HIGH.ordinal());			//10 of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((tenCard-9), RemovalCount.HIGH.ordinal());		//A of Other Suit
				favoredCards.put((tenCard-4), RemovalCount.HIGH.ordinal());		//6 of Other Suit
				favoredCards.put((tenCard-3), RemovalCount.HIGH.ordinal());		//7 of Other Suit
				favoredCards.put((tenCard-2), RemovalCount.HIGH.ordinal());		//8 of Other Suit
				favoredCards.put((tenCard-1), RemovalCount.HIGH.ordinal());		//9 of Other Suit
				favoredCards.put((tenCard+1), RemovalCount.HIGH.ordinal());		//J of Other Suit
				favoredCards.put((tenCard+2), RemovalCount.HIGH.ordinal());		//Q of Other Suit
				favoredCards.put((tenCard+3), RemovalCount.HIGH.ordinal());		//K of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Same Suit		5
			//Same Suit = A, 2, 3, 4, 5, 7, 9, Q of Same Suit					3			
			//Same Face Value = 10 of Other Suits	`							4
			//Different Suit Sequence Intermediates = A, 7, 9, Q of Other Suits	3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//6 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+3), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-3), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+2), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			
			tenCards.stream().forEach(tenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(tenCard, RemovalCount.HIGH.ordinal());			//10 of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((tenCard-9), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((tenCard-3), RemovalCount.MEDIUM.ordinal());	//7 of Other Suit
				favoredCards.put((tenCard-1), RemovalCount.MEDIUM.ordinal());	//9 of Other Suit
				favoredCards.put((tenCard+2), RemovalCount.MEDIUM.ordinal());	//Q of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given J
	 * 
	 * @param card - Identifier for which J it is(10, 23, 36, 49) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillJackFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> jackCards =  new ArrayList<Integer>(Arrays.asList(10, 23, 36, 49));
		
		jackCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 7, 8, 9, 10, Q, K of Same Suit			5
			//Same Suit = 2, 3, 4, 5, 6 of Same Suit							3
			//Same Face Value = J of Other Suits								4
			//Different Suit Sequence = A, 7, 8, 9, 10, Q, K of Other Suits		4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-10), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//7 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			
			jackCards.stream().forEach(jackCard -> {
				//Same Face Value: High(4)
				favoredCards.put(jackCard, RemovalCount.HIGH.ordinal());		//J of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((jackCard-10), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((jackCard-4), RemovalCount.HIGH.ordinal());	//7 of Other Suit
				favoredCards.put((jackCard-3), RemovalCount.HIGH.ordinal());	//8 of Other Suit
				favoredCards.put((jackCard-2), RemovalCount.HIGH.ordinal());	//9 of Other Suit
				favoredCards.put((jackCard-1), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((jackCard+1), RemovalCount.HIGH.ordinal());	//Q of Other Suit
				favoredCards.put((jackCard+2), RemovalCount.HIGH.ordinal());	//K of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Same Suit			5
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, Q of Same Suits				3
			//Same Face Value = J of Other Suits								4
			//Different Suit Sequence Intermediates = A, 7, 9, Q of Other Suits	3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+2), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-10), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card-4), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card+1), RemovalCount.MEDIUM.ordinal());			//Q of Same Suit
			
			jackCards.stream().forEach(jackCard -> {
				//Same Face Value: High(4)
				favoredCards.put(jackCard, RemovalCount.HIGH.ordinal());		//J of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((jackCard-10), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((jackCard-4), RemovalCount.MEDIUM.ordinal());	//7 of Other Suit
				favoredCards.put((jackCard-2), RemovalCount.MEDIUM.ordinal());	//9 of Other Suit
				favoredCards.put((jackCard+1), RemovalCount.MEDIUM.ordinal());	//Q of Other Suit
			});
		}
		
		return favoredCards;
	}
	
	/**
	 * Method to populate Card that favor given Q
	 * 
	 * @param card - Identifier for which Q it is(11, 24, 37, 50) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillQueenFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> queenCards =  new ArrayList<Integer>(Arrays.asList(11, 24, 37, 50));
		
		queenCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 8, 9, 10, J, K of Same Suit				5
			//Same Suit = 2, 3, 4, 5, 6, 7 of Same Suit							3
			//Same Face Value = Q of Other Suits								4
			//Different Suit Sequence = A, 8, 9, 10, J, K of Other Suits		4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-11), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-10), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			
			queenCards.stream().forEach(queenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(queenCard, RemovalCount.HIGH.ordinal());		//Q of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((queenCard-11), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((queenCard-4), RemovalCount.HIGH.ordinal());	//8 of Other Suit
				favoredCards.put((queenCard-3), RemovalCount.HIGH.ordinal());	//9 of Other Suit
				favoredCards.put((queenCard-2), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((queenCard-1), RemovalCount.HIGH.ordinal());	//J of Other Suit
				favoredCards.put((queenCard+1), RemovalCount.HIGH.ordinal());	//K of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Same Suit			5
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, J of Same Suit				3
			//Same Face Value = Q of Other Suits								4
			//Different Suit Sequence Intermediates = A, 9, J of Other Suits	3

			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//8 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card+1), RemovalCount.VERY_HIGH.ordinal());		//K of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-11), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-10), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card-3), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card-1), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			
			queenCards.stream().forEach(queenCard -> {
				//Same Face Value: High(4)
				favoredCards.put(queenCard, RemovalCount.HIGH.ordinal());		//Q of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((queenCard-11), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((queenCard-3), RemovalCount.MEDIUM.ordinal());	//9 of Other Suit
				favoredCards.put((queenCard-1), RemovalCount.MEDIUM.ordinal());	//J of Other Suit
			});
		}
		
		return favoredCards;
	}

	/**
	 * Method to populate Card that favor given K
	 * 
	 * @param card - Identifier for which K it is(12, 25, 38, 51) - (Club, Diamond, Heart, Spade)
	 * @param aggressive - 'true' if aggressive, else 'false'
	 * @param favoredCards - Empty Collection to be filled with Favored Cards
	 */
	private static Map<Integer, Integer> fillKingFavoredCards(int card, boolean aggressive) {
		Map<Integer, Integer> favoredCards = new HashMap<>();
		
		List<Integer> kingCards =  new ArrayList<Integer>(Arrays.asList(12, 25, 38, 51));
		
		kingCards.remove((Object)card);
		
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 9, 10, J, Q of Same Suit					5
			//Same Suit = 2, 3, 4, 5, 6, 7, 8 of Same Suit						3
			//Same Face Value = K of Other Suits								4
			//Different Suit Sequence = A, 9, 10, J, Q of Other Suits			4
			
			//Same Suit Sequence: Very High(5)
			favoredCards.put((card-12), RemovalCount.VERY_HIGH.ordinal());		//A of Same Suit
			favoredCards.put((card-4), RemovalCount.VERY_HIGH.ordinal());		//9 of Same Suit
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card-2), RemovalCount.VERY_HIGH.ordinal());		//J of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-11), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-10), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			
			kingCards.stream().forEach(kingCard -> {
				//Same Face Value: High(4)
				favoredCards.put(kingCard, RemovalCount.HIGH.ordinal());		//K of Other Suit
				
				//Different Suit Sequence: High(4)
				favoredCards.put((kingCard-12), RemovalCount.HIGH.ordinal());	//A of Other Suit
				favoredCards.put((kingCard-4), RemovalCount.HIGH.ordinal());	//9 of Other Suit
				favoredCards.put((kingCard-3), RemovalCount.HIGH.ordinal());	//10 of Other Suit
				favoredCards.put((kingCard-2), RemovalCount.HIGH.ordinal());	//J of Other Suit
				favoredCards.put((kingCard-1), RemovalCount.HIGH.ordinal());	//Q of Other Suit
			});
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 10, Q of Same Suit				5
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 8, 9, J of Same Suit				3
			//Same Face Value = K of Other Suits								4
			//Different Suit Sequence Intermediates = A, 9, J of Other Suits	3
			
			//Same Suit Sequence Intermediates: Very High(5)
			favoredCards.put((card-3), RemovalCount.VERY_HIGH.ordinal());		//10 of Same Suit
			favoredCards.put((card-1), RemovalCount.VERY_HIGH.ordinal());		//Q of Same Suit
			
			//Same Suit: Medium(3)
			favoredCards.put((card-12), RemovalCount.MEDIUM.ordinal());			//A of Same Suit
			favoredCards.put((card-11), RemovalCount.MEDIUM.ordinal());			//2 of Same Suit
			favoredCards.put((card-10), RemovalCount.MEDIUM.ordinal());			//3 of Same Suit
			favoredCards.put((card-9), RemovalCount.MEDIUM.ordinal());			//4 of Same Suit
			favoredCards.put((card-8), RemovalCount.MEDIUM.ordinal());			//5 of Same Suit
			favoredCards.put((card-7), RemovalCount.MEDIUM.ordinal());			//6 of Same Suit
			favoredCards.put((card-6), RemovalCount.MEDIUM.ordinal());			//7 of Same Suit
			favoredCards.put((card-5), RemovalCount.MEDIUM.ordinal());			//8 of Same Suit
			favoredCards.put((card-4), RemovalCount.MEDIUM.ordinal());			//9 of Same Suit
			favoredCards.put((card-2), RemovalCount.MEDIUM.ordinal());			//J of Same Suit
			
			kingCards.stream().forEach(kingCard -> {
				//Same Face Value: High(4)
				favoredCards.put(kingCard, RemovalCount.HIGH.ordinal());		//K of Other Suit
				
				//Different Suit Sequence Intermediates: Medium(3)
				favoredCards.put((kingCard-12), RemovalCount.MEDIUM.ordinal());	//A of Other Suit
				favoredCards.put((kingCard-4), RemovalCount.MEDIUM.ordinal());	//9 of Other Suit
				favoredCards.put((kingCard-2), RemovalCount.MEDIUM.ordinal());	//J of Other Suit
			});
		}
		
		return favoredCards;
	}
	
}