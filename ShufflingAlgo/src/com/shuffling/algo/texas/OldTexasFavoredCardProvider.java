package com.shuffling.algo.texas;

import java.util.Map;

import com.shuffling.algo.RemovalCount;

final public class OldTexasFavoredCardProvider {
	
	/**
	 * Method to populate Card that favor A of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubAceFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Club				5
			//Different Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Non-Club		4
			//Same Face Value = A of Diamond, A of Heart, A of Spade			4
			//Same Suit = 6, 7, 8, 9 of Club 									3
			
			//Same Suit Sequence:
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			
			//Different Suit Sequence:
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Face Value:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = K, J, 2, 4 of Club				5
			//Different Suit Sequence Intermediates = Q, 10, 3, 5 of Non-Club	3
			//Same Face Value = A of Diamond, A of Heart, A of Spade			4
			//Same Suit = 3, 5, 6, 7, 8, 9, 10, Q of Club						3
			
			//Same Suit Sequence Intermediates:
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			
			//Different Suit Sequence Intermediates:
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			
			//Same Face Value:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
		}
	}
		
	/**
	 * Method to populate Card that favor 2 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubTwoFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 3, 4, 5, 6 of Club						5
			//Different Suit Sequence = A, 3, 4, 5, 6 of Non-Club				4
			//Same Face Value = 2 of Diamond, 2 of Heart, 2 of Spade			4
			//Same Suit = 7, 8, 9, 10, J, Q, K of Club 							3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Face Value:
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 3, 5, 6 of Club				5
			//Different Suit Sequence = A, 4, 6 of Non-Club						3
			//Same Face Value = 2 of Diamond, 2 of Heart, 2 of Spade			4
			//Same Suit = A, 4, 7, 8, 9, 10, J, Q, K of Club 					3
			
			//Same Suit Sequence:
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 3 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubThreeFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 4, 5, 6, 7 of Club						5
			//Different Suit Sequence = A, 2, 4, 5, 6, 7 of Non-Club			4
			//Same Face Value = 3 of Diamond, 3 of Heart, 3 of Spade			4
			//Same Suit = 8, 9, 10, J, Q, K of Club								3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Face Value:
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Club				5
			//Different Suit Sequence = A, 4, 6 of Non-Club						3
			//Same Face Value = 3 of Diamond, 3 of Heart, 3 of Spade			4
			//Same Suit = A, 4, 6, 8, 9, 10, J, Q, K of Club					3
			
			//Same Suit Sequence:
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 4 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubFourFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Club					5
			//Different Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Non-Club			4
			//Same Face Value = 4 of Diamond, 4 of Heart, 4 of Spade			4
			//Same Suit = 9, 10, J, Q, K of Club								3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Face Value:
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Club				5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Club					3
			//Same Face Value = 4 of Diamond, 4 of Heart, 4 of Spade			4
			//Same Suit = A, 3, 6, 8, 9, 10, J, Q, K of Club					3
			
			//Same Suit Sequence:
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 5 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubFiveFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Club				5
			//Different Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Non-Club		4
			//Same Face Value = 5 of Diamond, 5 of Heart, 5 of Spade			4
			//Same Suit = 10, J, Q, K of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Club				5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Club					3
			//Same Face Value = 5 of Diamond, 5 of Heart, 5 of Spade			4
			//Same Suit = A, 3, 6, 8, 10, J, Q, K of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 6 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubSixFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Club				5
			//Different Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Non-Club		4
			//Same Face Value = 6 of Diamond, 6 of Heart, 6 of Spade			4
			//Same Suit = A, J, Q, K of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			
			//Different Suit Sequence:
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Face Value:
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Club				5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Club					3
			//Same Face Value = 6 of Diamond, 6 of Heart, 6 of Spade			4
			//Same Suit = A, 3, 5, 8, 10, J, Q, K of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(1, RemovalCount.VERY_HIGH.ordinal());	//2 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			
			//Different Suit Sequence:
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 7 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubSevenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Club				5
			//Different Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Non-Club		4
			//Same Face Value = 7 of Diamond, 7 of Heart, 7 of Spade			4
			//Same Suit = A, 2, Q, K of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(2, RemovalCount.VERY_HIGH.ordinal());	//3 of Club
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			
			//Different Suit Sequence:
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Face Value:
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Club				5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Club					3
			//Same Face Value = 7 of Diamond, 7 of Heart, 7 of Spade			4
			//Same Suit = A, 2, 3, 5, 8, 10, Q, K of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			
			//Different Suit Sequence:
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 8 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubEightFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Club				5
			//Different Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Non-Club		4
			//Same Face Value = 8 of Diamond, 8 of Heart, 8 of Spade			4
			//Same Suit = A, 2, 3, K of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			
			//Different Suit Sequence:
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(12, RemovalCount.MEDIUM.ordinal());	//K of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Club				5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Club					3
			//Same Face Value = 8 of Diamond, 8 of Heart, 8 of Spade			4
			//Same Suit = A, 2, 3, 5, 7, 10, Q, K of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(3, RemovalCount.VERY_HIGH.ordinal());	//4 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			
			//Different Suit Sequence:
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Club
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Club
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Club
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Club
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Club
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Club
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 9 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubNineFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Club				5
			//Different Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Non-Club		4
			//Same Face Value = 9 of Diamond, 9 of Heart, 9 of Spade			4
			//Same Suit = A, 2, 3, 4 of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(4, RemovalCount.VERY_HIGH.ordinal());	//5 of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Club				5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Club					3
			//Same Face Value = 9 of Diamond, 9 of Heart, 9 of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 7, 10, Q of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
		}
	}
	
	/**
	 * Method to populate Card that favor 10 of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubTenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Club				5
			//Different Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Non-Club		4
			//Same Face Value = 10 of Diamond, 10 of Heart, 10 of Spade			4
			//Same Suit = 2, 3, 4, 5 of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Club				5
			//Different Suit Sequence = 7, 9, Q, A of Non-Club					3
			//Same Face Value = 10 of Diamond, 10 of Heart, 10 of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 7, 9, Q of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(5, RemovalCount.VERY_HIGH.ordinal());	//6 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
		}
	}
	
	/**
	 * Method to populate Card that favor J of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubJackFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 7, 8, 9, 10, Q, K of Club					5
			//Different Suit Sequence = A, 7, 8, 9, 10, Q, K of Non-Club		4
			//Same Face Value = J of Diamond, J of Heart, J of Spade			4
			//Same Suit = 2, 3, 4, 5, 6 of Club									3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(6, RemovalCount.VERY_HIGH.ordinal());	//7 of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Club				5
			//Different Suit Sequence = 7, 9, Q, A of Non-Club					3
			//Same Face Value = J of Diamond, J of Heart, J of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, Q of Club						3
			
			//Same Suit Sequence:
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
		}
	}
	
	/**
	 * Method to populate Card that favor Q of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubQueenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 8, 9, 10, J, K of Club					5
			//Different Suit Sequence = A, 8, 9, 10, J, K of Non-Club			4
			//Same Face Value = Q of Diamond, Q of Heart, Q of Spade			4
			//Same Suit = 2, 3, 4, 5, 6, 7 of Club								3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Club				5
			//Different Suit Sequence = 9, J, A of Non-Club						3
			//Same Face Value = Q of Diamond, Q of Heart, Q of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, J of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(7, RemovalCount.VERY_HIGH.ordinal());	//8 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(12, RemovalCount.VERY_HIGH.ordinal());	//K of Club
			
			//Different Suit Sequence:
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
		}
	}

	/**
	 * Method to populate Card that favor K of Club
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillClubKingFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 9, 10, J, Q of Club						5
			//Different Suit Sequence = A, 9, 10, J, Q of Non-Club				4
			//Same Face Value = K of Club, K of Heart, K of Spade				4
			//Same Suit = 2, 3, 4, 5, 6, 7, 8 of Club							3
			
			//Same Suit Sequence:
			favoredCards.put(0, RemovalCount.VERY_HIGH.ordinal());	//A of Club
			favoredCards.put(8, RemovalCount.VERY_HIGH.ordinal());	//9 of Club
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(10, RemovalCount.VERY_HIGH.ordinal());	//J of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			
			//Different Suit Sequence:
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 10, Q of Club					5
			//Different Suit Sequence = 9, J, A of Non-Club						3
			//Same Face Value = K of Diamond, K of Heart, K of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 8, 9, J of Club					3
			
			//Same Suit Sequence:
			favoredCards.put(9, RemovalCount.VERY_HIGH.ordinal());	//10 of Club
			favoredCards.put(11, RemovalCount.VERY_HIGH.ordinal());	//Q of Club
			
			//Different Suit Sequence:
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.MEDIUM.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
		}
	}

	/**
	 * Method to populate Card that favor A of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondAceFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Diamond			5
			//Different Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Non-Diamond	4
			//Same Face Value = A of Club, A of Heart, A of Spade				4
			//Same Suit = 6, 7, 8, 9 of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = K, J, 2, 4 of Diamond			5
			//Different Suit Sequence Intermediates = Q, 10, 3, 5 of Non-Diamond3
			//Same Face Value = A of Club, A of Heart, A of Spade				4
			//Same Suit = 3, 5, 6, 7, 8, 9, 10, Q of Diamond					3
			
			//Same Suit Sequence Intermediates:
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			
			//Different Suit Sequence Intermediates:
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 2 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondTwoFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 3, 4, 5, 6 of Diamond						5
			//Different Suit Sequence = A, 3, 4, 5, 6 of Non-Diamond			4
			//Same Face Value = 2 of Club, 2 of Heart, 2 of Spade				4
			//Same Suit = 7, 8, 9, 10, J, Q, K of Diamond						3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 3, 5, 6 of Diamond				5
			//Different Suit Sequence = A, 4, 6 of Non-Diamond					3
			//Same Face Value = 2 of Club, 2 of Heart, 2 of Spade				4
			//Same Suit = A, 2, 4, 7, 8, 9, 10, J, Q, K of Diamond				3
			
			//Same Suit Sequence:
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 3 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondThreeFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 4, 5, 6, 7 of Diamond					5
			//Different Suit Sequence = A, 2, 4, 5, 6, 7 of Non-Diamond			4
			//Same Face Value = 3 of Club, 3 of Heart, 3 of Spade				4
			//Same Suit = 8, 9, 10, J, Q, K of Diamond							3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Diamond				5
			//Different Suit Sequence = A, 4, 6 of Non-Diamond					3
			//Same Face Value = 3 of Club, 3 of Heart, 3 of Spade				4
			//Same Suit = A, 4, 6, 8, 9, 10, J, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 4 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondFourFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Diamond				5
			//Different Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Non-Diamond		4
			//Same Face Value = 4 of Club, 4 of Heart, 4 of Spade				4
			//Same Suit = 9, 10, J, Q, K of Diamond								3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Diamond				5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Diamond				3
			//Same Face Value = 4 of Club, 4 of Heart, 4 of Spade				4
			//Same Suit = A, 3, 6, 8, 9, 10, J, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 5 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondFiveFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Diamond			5
			//Different Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Non-Diamond	4
			//Same Face Value = 5 of Club, 5 of Heart, 5 of Spade				4
			//Same Suit = 10, J, Q, K of Diamond								3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Diamond			5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Diamond				3
			//Same Face Value = 5 of Club, 5 of Heart, 5 of Spade				4
			//Same Suit = A, 3, 6, 8, 10, J, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 6 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondSixFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Diamond			5
			//Different Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Non-Diamond	4
			//Same Face Value = 6 of Club, 6 of Heart, 6 of Spade				4
			//Same Suit = A, J, Q, K of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Diamond			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Diamond				3
			//Same Face Value = 6 of Club, 6 of Heart, 6 of Spade				4
			//Same Suit = A, 3, 5, 8, 10, J, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(14, RemovalCount.VERY_HIGH.ordinal());	//2 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 7 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondSevenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Diamond			5
			//Different Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Non-Diamond	4
			//Same Face Value = 7 of Club, 7 of Heart, 7 of Spade				4
			//Same Suit = A, 2, Q, K of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(15, RemovalCount.VERY_HIGH.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Diamond			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Diamond				3
			//Same Face Value = 7 of Club, 7 of Heart, 7 of Spade				4
			//Same Suit = A, 2, 3, 5, 8, 10, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 8 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondEightFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Diamond			5
			//Different Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Non-Diamond	4
			//Same Face Value = 8 of Club, 8 of Heart, 8 of Spade				4
			//Same Suit = A, 2, 3, K of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Diamond			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Diamond				3
			//Same Face Value = 8 of Club, 8 of Heart, 8 of Spade				4
			//Same Suit = A, 2, 3, 5, 7, 10, Q, K of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(16, RemovalCount.VERY_HIGH.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.MEDIUM.ordinal());	//K of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 9 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondNineFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Diamond			5
			//Different Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Non-Diamond	4
			//Same Face Value = 9 of Club, 9 of Heart, 9 of Spade				4
			//Same Suit = A, 2, 3, 4 of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(17, RemovalCount.VERY_HIGH.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Diamond			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Diamond				3
			//Same Face Value = 9 of Club, 9 of Heart, 9 of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 7, 10, Q of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor 10 of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondTenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Diamond			5
			//Different Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Non-Diamond	4
			//Same Face Value = 10 of Club, 10 of Heart, 10 of Spade			4
			//Same Suit = 2, 3, 4, 5 of Diamond									3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Diamond			5
			//Different Suit Sequence = 7, 9, Q, A of Non-Diamond				3
			//Same Face Value = 10 of Club, 10 of Heart, 10 of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 7, 9, Q of Diamond						3
			
			//Same Suit Sequence:
			favoredCards.put(18, RemovalCount.VERY_HIGH.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor J of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondJackFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 7, 8, 9, 10, Q, K of Diamond				5
			//Different Suit Sequence = A, 7, 8, 9, 10, Q, K of Non-Diamond		4
			//Same Face Value = J of Club, J of Heart, J of Spade				4
			//Same Suit = 2, 3, 4, 5, 6 of Diamond								3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(19, RemovalCount.VERY_HIGH.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Diamond			5
			//Different Suit Sequence = 7, 9, Q, A of Non-Diamond				3
			//Same Face Value = J of Club, J of Heart, J of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, Q of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor Q of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondQueenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 8, 9, 10, J, K of Diamond					5
			//Different Suit Sequence = A, 8, 9, 10, J, K of Non-Diamond		4
			//Same Face Value = Q of Club, Q of Heart, Q of Spade				4
			//Same Suit = 2, 3, 4, 5, 6, 7 of Diamond							3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Diamond			5
			//Different Suit Sequence = 9, J, A of Non-Diamond					3
			//Same Face Value = Q of Club, Q of Heart, Q of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, J of Diamond					3
			
			//Same Suit Sequence:
			favoredCards.put(20, RemovalCount.VERY_HIGH.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(25, RemovalCount.VERY_HIGH.ordinal());	//K of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor K of Diamond
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillDiamondKingFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 9, 10, J, Q of Diamond					5
			//Different Suit Sequence = A, 9, 10, J, Q of Non-Diamond			4
			//Same Face Value = K of Club, K of Heart, K of Spade				4
			//Same Suit = 2, 3, 4, 5, 6, 7, 8 of Diamond						3
			
			//Same Suit Sequence:
			favoredCards.put(13, RemovalCount.VERY_HIGH.ordinal());	//A of Diamond
			favoredCards.put(21, RemovalCount.VERY_HIGH.ordinal());	//9 of Diamond
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(23, RemovalCount.VERY_HIGH.ordinal());	//J of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 10, Q of Diamond				5
			//Different Suit Sequence = 9, J, A of Non-Diamond					3
			//Same Face Value = K of Club, K of Heart, K of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 8, 9, J of Diamond				3
			
			//Same Suit Sequence:
			favoredCards.put(22, RemovalCount.VERY_HIGH.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.VERY_HIGH.ordinal());	//Q of Diamond
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(14, RemovalCount.MEDIUM.ordinal());	//2 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
		}
	}
	
	/**
	 * Method to populate Card that favor A of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartAceFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Heart				5
			//Different Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Non-Heart	4
			//Same Face Value = A of Club, A of Diamond, A of Spade				4
			//Same Suit = 6, 7, 8, 9 of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = K, J, 2, 4 of Heart			5
			//Different Suit Sequence Intermediates = Q, 10, 3, 5 of Non-Heart	3
			//Same Face Value = A of Club, A of Diamond, A of Spade				4
			//Same Suit = 3, 5, 6, 7, 8, 9, 10, Q of Heart						3
			
			//Same Suit Sequence Intermediates:
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			
			//Different Suit Sequence Intermediates:
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			
			//Same Suit:
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 2 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartTwoFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 3, 4, 5, 6 of Heart						5
			//Different Suit Sequence = A, 3, 4, 5, 6 of Non-Heart				4
			//Same Face Value = 2 of Club, 2 of Diamond, 2 of Spade				4
			//Same Suit = 7, 8, 9, 10, J, Q, K of Heart							3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 3, 5, 6 of Heart				5
			//Different Suit Sequence = A, 4, 6 of Non-Heart					3
			//Same Face Value = 2 of Club, 2 of Diamond, 2 of Spade				4
			//Same Suit = A, 4, 7, 8, 9, 10, J, Q, K of Heart					3
			
			//Same Suit Sequence:
			
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 3 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartThreeFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 4, 5, 6, 7 of Heart					5
			//Different Suit Sequence = A, 2, 4, 5, 6, 7 of Non-Heart			4
			//Same Face Value = 3 of Club, 3 of Diamond, 3 of Spade				4
			//Same Suit = 8, 9, 10, J, Q, K of Heart							3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Heart				5
			//Different Suit Sequence = A, 4, 6 of Non-Heart					3
			//Same Face Value = 3 of Club, 3 of Diamond, 3 of Spade				4
			//Same Suit = A, 4, 6, 8, 9, 10, J, Q, K of Heart					3
			
			//Same Suit Sequence:
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 4 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartFourFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Heart					5
			//Different Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Non-Heart		4
			//Same Face Value = 4 of Club, 4 of Diamond, 4 of Spade				4
			//Same Suit = 9, 10, J, Q, K of Heart								3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Heart				5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Heart					3
			//Same Face Value = 4 of Club, 4 of Diamond, 4 of Spade				4
			//Same Suit = A, 3, 6, 8, 9, 10, J, Q, K of Heart					3
			
			//Same Suit Sequence:
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 5 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartFiveFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Heart				5
			//Different Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Non-Heart		4
			//Same Face Value = 5 of Club, 5 of Diamond, 5 of Spade				4
			//Same Suit = 10, J, Q, K of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Heart			5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Heart					3
			//Same Face Value = 5 of Club, 5 of Diamond, 5 of Spade				4
			//Same Suit = A, 3, 6, 8, 10, J, Q, K of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 6 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartSixFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Heart				5
			//Different Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Non-Heart	4
			//Same Face Value = 6 of Club, 6 of Diamond, 6 of Spade				4
			//Same Suit = A, J, Q, K of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			
			favoredCards.put(40, RemovalCount.HIGH.ordinal());		//2 of Spade
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Heart			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Heart				3
			//Same Face Value = 6 of Club, 6 of Diamond, 6 of Spade				4
			//Same Suit = A, 3, 5, 8, 10, J, Q, K of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(27, RemovalCount.VERY_HIGH.ordinal());	//2 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 7 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartSevenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Heart				5
			//Different Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Non-Heart	4
			//Same Face Value = 7 of Club, 7 of Diamond, 7 of Spade				4
			//Same Suit = A, 2, Q, K of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(28, RemovalCount.VERY_HIGH.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			
			favoredCards.put(41, RemovalCount.HIGH.ordinal());		//3 of Spade
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Heart			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Heart				3
			//Same Face Value = 7 of Club, 7 of Diamond, 7 of Spade				4
			//Same Suit = A, 2, 3, 5, 8, 10, Q, K of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 8 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartEightFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Heart				5
			//Different Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Non-Heart	4
			//Same Face Value = 8 of Club, 8 of Diamond, 8 of Spade				4
			//Same Suit = A, 2, 3, K of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			
			//Different Suit Sequence:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(42, RemovalCount.HIGH.ordinal());		//4 of Spade
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Heart			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Heart				3
			//Same Face Value = 8 of Club, 8 of Diamond, 8 of Spade				4
			//Same Suit = A, 2, 3, 5, 7, 10, Q, K of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(29, RemovalCount.VERY_HIGH.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.MEDIUM.ordinal());	//K of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 9 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartNineFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Heart				5
			//Different Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Non-Heart	4
			//Same Face Value = 9 of Club, 9 of Diamond, 9 of Spade				4
			//Same Suit = A, 2, 3, 4 of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(30, RemovalCount.VERY_HIGH.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(43, RemovalCount.HIGH.ordinal());		//5 of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Heart			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Heart				3
			//Same Face Value = 9 of Club, 9 of Diamond, 9 of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 7, 10, Q of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor 10 of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartTenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Heart				5
			//Different Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Non-Heart		4
			//Same Face Value = 10 of Club, 10 of Diamond, 10 of Spade			4
			//Same Suit = 2, 3, 4, 5 of Heart									3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(44, RemovalCount.HIGH.ordinal());		//6 of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Heart			5
			//Different Suit Sequence = 7, 9, Q, A of Non-Heart					3
			//Same Face Value = 10 of Club, 10 of Diamond, 10 of Spade			4
			//Same Suit = A, 2, 3, 4, 5, 7, 9, Q of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(31, RemovalCount.VERY_HIGH.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor J of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartJackFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 7, 8, 9, 10, Q, K of Heart				5
			//Different Suit Sequence = A, 7, 8, 9, 10, Q, K of Non-Heart		4
			//Same Face Value = J of Club, J of Diamond, J of Spade				4
			//Same Suit = 2, 3, 4, 5, 6 of Heart								3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(32, RemovalCount.VERY_HIGH.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(45, RemovalCount.HIGH.ordinal());		//7 of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Heart				5
			//Different Suit Sequence = 7, 9, Q, A of Non-Heart					3
			//Same Face Value = J of Club, J of Diamond, J of Heart				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, Q of Heart					3
			
			//Same Suit Sequence:
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor Q of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartQueenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 8, 9, 10, J, K of Heart					5
			//Different Suit Sequence = A, 8, 9, 10, J, K of Non-Heart			4
			//Same Face Value = Q of Club, Q of Diamond, Q of Spade				4
			//Same Suit = 2, 3, 4, 5, 6, 7 of Heart								3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(46, RemovalCount.HIGH.ordinal());		//8 of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Heart				5
			//Different Suit Sequence = 9, J, A of Non-Heart					3
			//Same Face Value = Q of Club, Q of Diamond, Q of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, J of Heart					3
			
			//Same Suit Sequence:
			favoredCards.put(33, RemovalCount.VERY_HIGH.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(38, RemovalCount.VERY_HIGH.ordinal());	//K of Heart
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor K of Heart
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillHeartKingFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 9, 10, J, Q of Heart						5
			//Different Suit Sequence = A, 9, 10, J, Q of Non-Heart				4
			//Same Face Value = K of Club, K of Diamond, K of Spade				4
			//Same Suit = 2, 3, 4, 5, 6, 7, 8 of Heart							3
			
			//Same Suit Sequence:
			favoredCards.put(26, RemovalCount.VERY_HIGH.ordinal());	//A of Heart
			favoredCards.put(34, RemovalCount.VERY_HIGH.ordinal());	//9 of Heart
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(36, RemovalCount.VERY_HIGH.ordinal());	//J of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(39, RemovalCount.HIGH.ordinal());		//A of Spade
			favoredCards.put(47, RemovalCount.HIGH.ordinal());		//9 of Spade
			favoredCards.put(48, RemovalCount.HIGH.ordinal());		//10 of Spade
			favoredCards.put(49, RemovalCount.HIGH.ordinal());		//J of Spade
			favoredCards.put(50, RemovalCount.HIGH.ordinal());		//Q of Spade
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 10, Q of Heart					5
			//Different Suit Sequence = 9, J, A of Non-Heart					3
			//Same Face Value = K of Club, K of Diamond, K of Spade				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 8, 9, J of Heart					3
			
			//Same Suit Sequence:
			favoredCards.put(35, RemovalCount.VERY_HIGH.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.VERY_HIGH.ordinal());	//Q of Heart
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(51, RemovalCount.HIGH.ordinal());		//K of Spade
			
			//Same Suit:
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(27, RemovalCount.MEDIUM.ordinal());	//2 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
		}
	}
	
	/**
	 * Method to populate Card that favor A of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeAceFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Spade				5
			//Different Suit Sequence = K, Q, J, 10, 2, 3, 4, 5 of Non-Spade	4
			//Same Face Value = A of Club, A of Diamond, A of Heart				4
			//Same Suit = 6, 7, 8, 9 of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			
			//Same Suit:
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = K, J, 2, 4 of Spade			5
			//Different Suit Sequence Intermediates = Q, 10, 3, 5 of Non-Spade	3
			//Same Face Value = A of Club, A of Diamond, A of Heart				4
			//Same Suit = 3, 5, 6, 7, 8, 9, 10, Q of Heart						3
			
			//Same Suit Sequence:
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			
			//Same Face Value:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			
			//Same Suit:
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 2 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeTwoFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 3, 4, 5, 6 of Spade						5
			//Different Suit Sequence = A, 3, 4, 5, 6 of Non-Spade				4
			//Same Face Value = 2 of Club, 2 of Diamond, 2 of Heart				4
			//Same Suit = 7, 8, 9, 10, J, Q, K of Spade							3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond

			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			
			//Same Suit:
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 3, 5, 6 of Spade				5
			//Different Suit Sequence = A, 4, 6 of Non-Spade					3
			//Same Face Value = 2 of Club, 2 of Diamond, 2 of Heart				4
			//Same Suit = 4, 7, 8, 9, 10, J, Q, K, A of Spade					3

			//Same Suit Sequence:
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			//Same Face Value:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 3 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeThreeFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 4, 5, 6, 7 of Spade					5
			//Different Suit Sequence = A, 2, 4, 5, 6, 7 of Non-Spade			4
			//Same Face Value = 3 of Club, 3 of Diamond, 3 of Heart				4
			//Same Suit = 8, 9, 10, J, Q, K of Spade							3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			
			//Same Suit:
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Spade				5
			//Different Suit Sequence = A, 4, 6 of Non-Spade					3
			//Same Face Value = 3 of Club, 3 of Diamond, 3 of Heart				4
			//Same Suit = A, 4, 6, 8, 9, 10, J, Q, K of Spade					3
			
			//Same Suit Sequence:
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(3, RemovalCount.MEDIUM.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(16, RemovalCount.MEDIUM.ordinal());	//4 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(29, RemovalCount.MEDIUM.ordinal());	//4 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			
			//Same Face Value:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 4 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeFourFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Spade					5
			//Different Suit Sequence = A, 2, 3, 5, 6, 7, 8 of Non-Spade		4
			//Same Face Value = 4 of Club, 4 of Diamond, 4 of Heart				4
			//Same Suit = 9, 10, J, Q, K of Spade								3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			
			//Same Suit:
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 5, 7 of Spade				5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Spade					3
			//Same Face Value = 4 of Club, 4 of Diamond, 4 of Heart				4
			//Same Suit = A, 3, 6, 8, 9, 10, J, Q, K of Spade					3
			
			//Same Suit Sequence:
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			//Same Face Value:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 5 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeFiveFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Spade				5
			//Different Suit Sequence = A, 2, 3, 4, 6, 7, 8, 9 of Non-Spade		4
			//Same Face Value = 5 of Club, 5 of Diamond, 5 of Heart				4
			//Same Suit = 10, J, Q, K of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			
			//Same Suit:
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Spade			5
			//Different Suit Sequence = A, 3, 6, 8 of Non-Spade					3
			//Same Face Value = 5 of Club, 5 of Diamond, 5 of Heart				4
			//Same Suit = A, 3, 6, 8, 10, J, Q, K of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(5, RemovalCount.MEDIUM.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(18, RemovalCount.MEDIUM.ordinal());	//6 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(31, RemovalCount.MEDIUM.ordinal());	//6 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			
			//Same Face Value:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 6 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeSixFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Spade				5
			//Different Suit Sequence = 2, 3, 4, 5, 7, 8, 9, 10 of Non-Spade	4
			//Same Face Value = 6 of Club, 6 of Diamond, 6 of Heart				4
			//Same Suit = A, J, Q, K of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(1, RemovalCount.HIGH.ordinal());		//2 of Club
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			
			favoredCards.put(14, RemovalCount.HIGH.ordinal());		//2 of Diamond
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			
			favoredCards.put(27, RemovalCount.HIGH.ordinal());		//2 of Heart
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 2, 4, 7, 9 of Spade			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Spade				3
			//Same Face Value = 6 of Club, 6 of Diamond, 6 of Heart				4
			//Same Suit = A, 3, 5, 8, 10, J, Q, K of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(40, RemovalCount.VERY_HIGH.ordinal());	//2 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			//Same Face Value:
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 7 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeSevenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Spade				5
			//Different Suit Sequence = 3, 4, 5, 6, 8, 9, 10, J of Non-Spade	4
			//Same Face Value = 7 of Club, 7 of Diamond, 7 of Heart				4
			//Same Suit = A, 2, Q, K of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(41, RemovalCount.VERY_HIGH.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.HIGH.ordinal());		//3 of Club
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			
			favoredCards.put(15, RemovalCount.HIGH.ordinal());		//3 of Diamond
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			
			favoredCards.put(28, RemovalCount.HIGH.ordinal());		//3 of Heart
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Spade			5
			//Different Suit Sequence = 3, 5, 8, 10 of Non-Spade				3
			//Same Face Value = 7 of Club, 7 of Diamond, 7 of Heart				4
			//Same Suit = A, 2, 3, 5, 8, 10, Q, K of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			
			//Different Suit Sequence:
			favoredCards.put(2, RemovalCount.MEDIUM.ordinal());		//3 of Club
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(7, RemovalCount.MEDIUM.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			
			favoredCards.put(15, RemovalCount.MEDIUM.ordinal());	//3 of Diamond
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(20, RemovalCount.MEDIUM.ordinal());	//8 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			
			favoredCards.put(28, RemovalCount.MEDIUM.ordinal());	//3 of Heart
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(33, RemovalCount.MEDIUM.ordinal());	//8 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			
			//Same Face Value:
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 8 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeEightFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Spade				5
			//Different Suit Sequence = 4, 5, 6, 7, 9, 10, J, Q of Non-Spade	4
			//Same Face Value = 8 of Club, 8 of Diamond, 8 of Heart				4
			//Same Suit = A, 2, 3, K of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			
			//Different Suit Sequence:
			favoredCards.put(3, RemovalCount.HIGH.ordinal());		//4 of Club
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(16, RemovalCount.HIGH.ordinal());		//4 of Diamond
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(29, RemovalCount.HIGH.ordinal());		//4 of Heart
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 4, 6, 9, J of Spade			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Spade				3
			//Same Face Value = 8 of Club, 8 of Diamond, 8 of Heart				4
			//Same Suit = A, 2, 3, 5, 7, 10, Q, K of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(42, RemovalCount.VERY_HIGH.ordinal());	//4 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			//Same Face Value:
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.MEDIUM.ordinal());	//K of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 9 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeNineFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Spade				5
			//Different Suit Sequence = 5, 6, 7, 8, 10, J, Q, K of Non-Spade	4
			//Same Face Value = 9 of Club, 9 of Diamond, 9 of Heart				4
			//Same Suit = A, 2, 3, 4 of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(43, RemovalCount.VERY_HIGH.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.HIGH.ordinal());		//5 of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(17, RemovalCount.HIGH.ordinal());		//5 of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(30, RemovalCount.HIGH.ordinal());		//5 of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Spade			5
			//Different Suit Sequence = 5, 7, 10, Q of Non-Spade				3
			//Same Face Value = 9 of Club, 9 of Diamond, 9 of Heart				4
			//Same Suit = A, 2, 3, 4, 5, 7, 10, Q of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(4, RemovalCount.MEDIUM.ordinal());		//5 of Club
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(9, RemovalCount.MEDIUM.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			
			favoredCards.put(17, RemovalCount.MEDIUM.ordinal());	//5 of Diamond
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(22, RemovalCount.MEDIUM.ordinal());	//10 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			
			favoredCards.put(30, RemovalCount.MEDIUM.ordinal());	//5 of Heart
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(35, RemovalCount.MEDIUM.ordinal());	//10 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			
			//Same Face Value:
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(48, RemovalCount.MEDIUM.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor 10 of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeTenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Spade				5
			//Different Suit Sequence = A, 6, 7, 8, 9, J, Q, K of Non-Spade		4
			//Same Face Value = 10 of Club, 10 of Diamond, 10 of Heart			4
			//Same Suit = 2, 3, 4, 5 of Spade									3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(5, RemovalCount.HIGH.ordinal());		//6 of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(18, RemovalCount.HIGH.ordinal());		//6 of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(31, RemovalCount.HIGH.ordinal());		//6 of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			
			//Same Suit:
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 6, 8, J, K of Spade			5
			//Different Suit Sequence = 7, 9, Q, A of Non-Spade					3
			//Same Face Value = 10 of Club, 10 of Diamond, 10 of Heart			4
			//Same Suit = A, 2, 3, 4, 5, 7, 9, Q of Spade						3
			
			//Same Suit Sequence:
			favoredCards.put(44, RemovalCount.VERY_HIGH.ordinal());	//6 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			//Same Face Value:
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor J of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeJackFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 7, 8, 9, 10, Q, K of Spade				5
			//Different Suit Sequence = A, 7, 8, 9, 10, Q, K of Non-Spade		4
			//Same Face Value = J of Club, J of Diamond, J of Heart				4
			//Same Suit = 2, 3, 4, 5, 6 of Spade								3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(45, RemovalCount.VERY_HIGH.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(6, RemovalCount.HIGH.ordinal());		//7 of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(19, RemovalCount.HIGH.ordinal());		//7 of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(32, RemovalCount.HIGH.ordinal());		//7 of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			
			//Same Suit:
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Spade				5
			//Different Suit Sequence = 7, 9, Q, A of Non-Spade					3
			//Same Face Value = J of Club, J of Diamond, J of Heart				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, Q of Spade					3
			
			//Same Suit Sequence:
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(6, RemovalCount.MEDIUM.ordinal());		//7 of Club
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(11, RemovalCount.MEDIUM.ordinal());	//Q of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(19, RemovalCount.MEDIUM.ordinal());	//7 of Diamond
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(24, RemovalCount.MEDIUM.ordinal());	//Q of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(32, RemovalCount.MEDIUM.ordinal());	//7 of Heart
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(37, RemovalCount.MEDIUM.ordinal());	//Q of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			//Same Face Value:
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(50, RemovalCount.MEDIUM.ordinal());	//Q of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor Q of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeQueenFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 8, 9, 10, J, K of Spade					5
			//Different Suit Sequence = A, 8, 9, 10, J, K of Non-Spade			4
			//Same Face Value = Q of Club, Q of Diamond, Q of Heart				4
			//Same Suit = 2, 3, 4, 5, 6, 7 of Spade								3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(7, RemovalCount.HIGH.ordinal());		//8 of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(20, RemovalCount.HIGH.ordinal());		//8 of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(33, RemovalCount.HIGH.ordinal());		//8 of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			//Same Suit:
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 8, 10, K of Spade				5
			//Different Suit Sequence = 9, J, A of Non-Spade					3
			//Same Face Value = Q of Club, Q of Diamond, Q of Heart				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 9, J of Spade					3
			
			//Same Suit Sequence:
			favoredCards.put(46, RemovalCount.VERY_HIGH.ordinal());	//8 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(51, RemovalCount.VERY_HIGH.ordinal());	//K of Spade
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			//Same Face Value:
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
		}
	}
	
	/**
	 * Method to populate Card that favor K of Spade
	 * 
	 * @param card - If can be used in future for estimations:
	 * @param aggressive
	 * @param favoredCards
	 */
	void fillSpadeKingFavoredCards(int card, boolean aggressive, Map<Integer, Integer> favoredCards) {
		if (aggressive) {
			//1. Aggressive:
			//Same Suit Sequence = A, 9, 10, J, Q of Spade						5
			//Different Suit Sequence = A, 9, 10, J, Q of Non-Spade				4
			//Same Face Value = K of Club, K of Diamond, K of Heart				4
			//Same Suit = 2, 3, 4, 5, 6, 7, 8 of Spade							3
			
			//Same Suit Sequence:
			favoredCards.put(39, RemovalCount.VERY_HIGH.ordinal());	//A of Spade
			favoredCards.put(47, RemovalCount.VERY_HIGH.ordinal());	//9 of Spade
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(49, RemovalCount.VERY_HIGH.ordinal());	//J of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			
			//Different Suit Sequence:
			favoredCards.put(0, RemovalCount.HIGH.ordinal());		//A of Club
			favoredCards.put(8, RemovalCount.HIGH.ordinal());		//9 of Club
			favoredCards.put(9, RemovalCount.HIGH.ordinal());		//10 of Club
			favoredCards.put(10, RemovalCount.HIGH.ordinal());		//J of Club
			favoredCards.put(11, RemovalCount.HIGH.ordinal());		//Q of Club
			
			favoredCards.put(13, RemovalCount.HIGH.ordinal());		//A of Diamond
			favoredCards.put(21, RemovalCount.HIGH.ordinal());		//9 of Diamond
			favoredCards.put(22, RemovalCount.HIGH.ordinal());		//10 of Diamond
			favoredCards.put(23, RemovalCount.HIGH.ordinal());		//J of Diamond
			favoredCards.put(24, RemovalCount.HIGH.ordinal());		//Q of Diamond
			
			favoredCards.put(26, RemovalCount.HIGH.ordinal());		//A of Heart
			favoredCards.put(34, RemovalCount.HIGH.ordinal());		//9 of Heart
			favoredCards.put(35, RemovalCount.HIGH.ordinal());		//10 of Heart
			favoredCards.put(36, RemovalCount.HIGH.ordinal());		//J of Heart
			favoredCards.put(37, RemovalCount.HIGH.ordinal());		//Q of Heart
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Suit:
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
		} else {
			//2. Mild:
			//Same Suit Sequence Intermediates = 10, Q of Spade					5
			//Different Suit Sequence = 9, J, A of Non-Spade					3
			//Same Face Value = K of Club, K of Diamond, K of Heart				4
			//Same Suit = A, 2, 3, 4, 5, 6, 7, 8, 9, J of Spade					3
			
			//Same Suit Sequence:
			favoredCards.put(48, RemovalCount.VERY_HIGH.ordinal());	//10 of Spade
			favoredCards.put(50, RemovalCount.VERY_HIGH.ordinal());	//Q of Spade
			
			//Different Suit Sequence:
			favoredCards.put(8, RemovalCount.MEDIUM.ordinal());		//9 of Club
			favoredCards.put(10, RemovalCount.MEDIUM.ordinal());	//J of Club
			favoredCards.put(0, RemovalCount.MEDIUM.ordinal());		//A of Club
			
			favoredCards.put(21, RemovalCount.MEDIUM.ordinal());	//9 of Diamond
			favoredCards.put(23, RemovalCount.MEDIUM.ordinal());	//J of Diamond
			favoredCards.put(13, RemovalCount.MEDIUM.ordinal());	//A of Diamond
			
			favoredCards.put(34, RemovalCount.MEDIUM.ordinal());	//9 of Heart
			favoredCards.put(36, RemovalCount.MEDIUM.ordinal());	//J of Heart
			favoredCards.put(26, RemovalCount.MEDIUM.ordinal());	//A of Heart
			
			//Same Face Value:
			favoredCards.put(12, RemovalCount.HIGH.ordinal());		//K of Club
			favoredCards.put(25, RemovalCount.HIGH.ordinal());		//K of Diamond
			favoredCards.put(38, RemovalCount.HIGH.ordinal());		//K of Heart
			
			//Same Suit:
			favoredCards.put(39, RemovalCount.MEDIUM.ordinal());	//A of Spade
			favoredCards.put(40, RemovalCount.MEDIUM.ordinal());	//2 of Spade
			favoredCards.put(41, RemovalCount.MEDIUM.ordinal());	//3 of Spade
			favoredCards.put(42, RemovalCount.MEDIUM.ordinal());	//4 of Spade
			favoredCards.put(43, RemovalCount.MEDIUM.ordinal());	//5 of Spade
			favoredCards.put(44, RemovalCount.MEDIUM.ordinal());	//6 of Spade
			favoredCards.put(45, RemovalCount.MEDIUM.ordinal());	//7 of Spade
			favoredCards.put(46, RemovalCount.MEDIUM.ordinal());	//8 of Spade
			favoredCards.put(47, RemovalCount.MEDIUM.ordinal());	//9 of Spade
			favoredCards.put(49, RemovalCount.MEDIUM.ordinal());	//J of Spade
		}
	}
	
}