package ejercicio20230625;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(    twoSum2(new int[] {4,1},2)   );
		
	}
	
	public static int[] twoSum2(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(i <  j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int [] {-1,-1};
    }
	
	 public static int[] twoSum(int[] numbers, int target) {
	        
		 int[] resp = new int[2];
	        for(int i = 0 ; i < numbers.length; i++){
	        	int j = numbers.length-1;
	        	
	        	while(j>=i) {
	        		if(numbers[i]+numbers[j] == target) {
		        		resp[0]=i+1;
		        		resp[1]=j+1;
		        		return resp;//break;
		        	}else {
		        		j--;
		        	}
	        	}
	        }
	        
	        return resp;
	  }

}
