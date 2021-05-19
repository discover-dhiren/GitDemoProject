package com.shuffling.algo.tester;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.CountDownLatch;

import com.shuffling.algo.ShufflingAlgo;
import com.shuffling.algo.texas.TexasShufflingAlgo;

public class TestThread implements Runnable {
	
	CountDownLatch latch;
	
	public TestThread(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		int card = (int) (Math.random()*52);
//		
//		switch(Thread.currentThread().getName()) {
//			case "Thread 1":
//				card = 38;
//				break;
//			case "Thread 2":
//				card = 45;
//				break;
//			default:
//				card = 7;
//		}
//		
//		System.out.println(Thread.currentThread().getName()+" has Card: "+card);
//		
//		Map<Integer, Integer> favoredCards = new HashMap<>();
//		
////		favoredCards.putAll(TexasFavoredCardProvider.fillFavoredCards(card, false));
//		
//		Map<Integer, Integer> tempFavoredCards = null;
//		
//		if (tempFavoredCards!=null)
//			favoredCards.putAll(tempFavoredCards);
//		
//		favoredCards.entrySet().stream().
//			forEach(favoredCardEntry -> System.out.println(Thread.currentThread().getName()+" will remove Card: "+favoredCardEntry.getKey()+" for "+favoredCardEntry.getValue()+" times."));
		
		ShufflingAlgo shuffleUtil = new TexasShufflingAlgo();
		
		System.out.println(Thread.currentThread().getName()+"'s Shuffled Deck is:");
		
		
		long initMilliSeconds = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();
		
		for(int card : shuffleUtil.shuffleDeck(9, false)) {
			System.out.print(card+"\t");
		}
		
		long endMilliSeconds = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();
		
		System.out.println("\nTime Take is: "+(endMilliSeconds-initMilliSeconds)+" Milli-Seconds");
		
		
	}
	
	/**
	 * Thread 1 has Card: 38
	 * Thread 1 will remove Card: 35 for 5 times.
	 * Thread 1 will remove Card: 37 for 5 times.
	 * 
	 * Thread 1 will remove Card: 12 for 4 times.
	 * Thread 1 will remove Card: 25 for 4 times.
	 * Thread 1 will remove Card: 51 for 4 times.
	 * 
	 * Thread 1 will remove Card: 0 for 3 times.
	 * Thread 1 will remove Card: 8 for 3 times.
	 * Thread 1 will remove Card: 10 for 3 times.
	 * Thread 1 will remove Card: 13 for 3 times.
	 * Thread 1 will remove Card: 21 for 3 times.
	 * Thread 1 will remove Card: 23 for 3 times.
	 * Thread 1 will remove Card: 26 for 3 times.
	 * Thread 1 will remove Card: 27 for 3 times.
	 * Thread 1 will remove Card: 28 for 3 times.
	 * Thread 1 will remove Card: 29 for 3 times.
	 * Thread 1 will remove Card: 30 for 3 times.
	 * Thread 1 will remove Card: 31 for 3 times.
	 * Thread 1 will remove Card: 32 for 3 times.
	 * Thread 1 will remove Card: 33 for 3 times.
	 * Thread 1 will remove Card: 34 for 3 times.
	 * Thread 1 will remove Card: 36 for 3 times.
	 * Thread 1 will remove Card: 39 for 3 times.
	 * Thread 1 will remove Card: 47 for 3 times.
	 * Thread 1 will remove Card: 49 for 3 times.
	 * 
	 *  
	 * Thread 2 has Card: 45
	 * Thread 2 will remove Card: 42 for 5 times.
	 * Thread 2 will remove Card: 44 for 5 times.
	 * Thread 2 will remove Card: 47 for 5 times.
	 * Thread 2 will remove Card: 49 for 5 times.
	 * 
	 * Thread 2 will remove Card: 6 for 4 times.
	 * Thread 2 will remove Card: 19 for 4 times.
	 * Thread 2 will remove Card: 32 for 4 times.
	 * 
	 * Thread 2 will remove Card: 2 for 3 times.
	 * Thread 2 will remove Card: 4 for 3 times.
	 * Thread 2 will remove Card: 7 for 3 times.
	 * Thread 2 will remove Card: 9 for 3 times.
	 * Thread 2 will remove Card: 15 for 3 times.
	 * Thread 2 will remove Card: 17 for 3 times.
	 * Thread 2 will remove Card: 20 for 3 times.
	 * Thread 2 will remove Card: 22 for 3 times.
	 * Thread 2 will remove Card: 28 for 3 times.
	 * Thread 2 will remove Card: 30 for 3 times.
	 * Thread 2 will remove Card: 33 for 3 times.
	 * Thread 2 will remove Card: 35 for 3 times.
	 * Thread 2 will remove Card: 39 for 3 times.
	 * Thread 2 will remove Card: 40 for 3 times.
	 * Thread 2 will remove Card: 41 for 3 times.
	 * Thread 2 will remove Card: 43 for 3 times.
	 * Thread 2 will remove Card: 46 for 3 times.
	 * Thread 2 will remove Card: 48 for 3 times.
	 * Thread 2 will remove Card: 50 for 3 times.
	 * Thread 2 will remove Card: 51 for 3 times.
	 * 
	 * 
	 * 
	 * Thread 3 has Card: 7
	 * Thread 3 will remove Card: 3 for 5 times.
	 * Thread 3 will remove Card: 5 for 5 times.
	 * Thread 3 will remove Card: 8 for 5 times.
	 * Thread 3 will remove Card: 10 for 5 times.
	 * 
	 * Thread 3 will remove Card: 20 for 4 times.
	 * Thread 3 will remove Card: 33 for 4 times.
	 * Thread 3 will remove Card: 46 for 4 times.
	 * 
	 * Thread 3 will remove Card: 0 for 3 times.
	 * Thread 3 will remove Card: 1 for 3 times.
	 * Thread 3 will remove Card: 2 for 3 times.
	 * Thread 3 will remove Card: 4 for 3 times.
	 * Thread 3 will remove Card: 6 for 3 times.
	 * Thread 3 will remove Card: 9 for 3 times.
	 * Thread 3 will remove Card: 11 for 3 times.
	 * Thread 3 will remove Card: 12 for 3 times.
	 * Thread 3 will remove Card: 17 for 3 times.
	 * Thread 3 will remove Card: 19 for 3 times.
	 * Thread 3 will remove Card: 22 for 3 times.
	 * Thread 3 will remove Card: 24 for 3 times.
	 * Thread 3 will remove Card: 30 for 3 times.
	 * Thread 3 will remove Card: 32 for 3 times.
	 * Thread 3 will remove Card: 35 for 3 times.
	 * Thread 3 will remove Card: 37 for 3 times.
	 * Thread 3 will remove Card: 43 for 3 times.
	 * Thread 3 will remove Card: 45 for 3 times.
	 * Thread 3 will remove Card: 48 for 3 times.
	 * Thread 3 will remove Card: 50 for 3 times.
	 * 
	 * */
	
}
