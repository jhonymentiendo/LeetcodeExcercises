package ejercicio20230620;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentExercise {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString( topFrequent(new int[]{1,1,1,2,2,3,3,4,5,6}, 3 ) ) );
		
	}

	
	public static int[] topFrequent(int[] nums, int k) {
		Map<Integer,Integer> mapa = new HashMap<Integer,Integer>();	
		int[] resp = new int[k];
		int index =0;

		//this was my idea
		for (int i : nums) {
			mapa.put(i, (mapa.get(i)==null?0:mapa.get(i)) +1);
		}
		
	//gotta be honest, i didnt knew this object and still figuring out the constructor part
		PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
		for (Map.Entry<Integer,Integer> entry : mapa.entrySet()) {
			pq.offer(entry);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
	    //that do was my idea
		for(int i=0 ; i<k ; i++ ) {
			resp[index++] = pq.poll().getKey();
		}
		
		
	    return resp;

		}
	
	
}
