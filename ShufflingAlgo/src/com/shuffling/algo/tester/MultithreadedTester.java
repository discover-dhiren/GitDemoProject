package com.shuffling.algo.tester;

import java.util.concurrent.CountDownLatch;

public class MultithreadedTester {
	
	public static void main(String[] args) {
		CountDownLatch threadLatch = new CountDownLatch(1);
		
		Thread thread1 = new Thread(new TestThread(threadLatch));
		thread1.setName("Thread 1");
		thread1.start();
		
//		Thread thread2 = new Thread(new TestThread(threadLatch));
//		thread2.setName("Thread 2");
//		thread2.start();
//		
//		Thread thread3 = new Thread(new TestThread(threadLatch));
//		thread3.setName("Thread 3");
//		thread3.start();
		
		System.out.println("Will start all Threads simultanelously");
		threadLatch.countDown();
		
//		int card = 38;
//		
//		System.out.println(Thread.currentThread().getName()+" has Card: "+card);
//		
//		Map<Integer, Integer> favoredCards = new HashMap<>();
//		
//		favoredCards.putAll(TexasFavoredCardProvider.fillFavoredCards(card, false));
//		
//		favoredCards.entrySet().stream().
//			forEach(favoredCardEntry -> System.out.println(Thread.currentThread().getName()+" will remove Card: "+favoredCardEntry.getKey()+" for "+favoredCardEntry.getValue()+" times."));
		
	}

}
