package ejercicio20230620;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int[] topFrequent(int[] nums, int k) {
		Map<Integer, Integer> mapa= new HashMap<>();
		int[] resp = new int[k];
		int index = 0;
		//fill a map with ocurrences
		for(int n : nums) {
			mapa.put(n, ( mapa.get(n) == null? 0 : mapa.get(n) )+1);
		}
		
		//fill a priority queue with ordered ocurrences
			//crear priorityqueue
		Queue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
				(a,b)-> a.getValue()-b.getValue());//constructor
				
		for (Map.Entry<Integer, Integer> entry : pq) {
			pq.offer(entry);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		while(!pq.isEmpty()) {
			resp[index++] = pq.poll().getValue();
		}
		
		//fill response with top priority
		
		return resp;
	}
	
	
}
