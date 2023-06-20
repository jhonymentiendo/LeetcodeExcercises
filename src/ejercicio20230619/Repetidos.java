package ejercicio20230619;

import java.util.HashMap;

public class Repetidos {

public static void main(String[] args) {
		
		System.out.println(containsDuplicate( new int[]{386,-180,-365,-335,-124,-605,-113,-550,-201,-571,-874,673,375,-415,125,-822,182,-374,135,-548,-665,334,-373,-616,420,536,167,736,181,-106,110,229,82,96,90,-392,-460,303,-860,954,-158,184,-725,625,-500,381,-394,700,766,-882,-475,-168,179,579,953,-54,98,755,770,-604,-13,642,-312,-373,-243,152,694,-480,-618,-484,-144,524,-14,815,-228,-604,937,-245,-849,274,165,-429,174,429,-91,-74,287,-768,-99,617,975,-315,-595,-659,996,677,-616,-165,858,-67,802,532,811,-786,965,-677,-899,346,-644,525,975,-317,-993,702,738,676,794,835,-499,779,576,-191,228,598,132,993,-252,-611,-246,939,-27,236,411,217,295,-391,-56,164,-363,573,735,170,-2,-846,-37,508,-85,682,787,-916,-921,-835,629,-876,197,385,-640,-496,9,990,264,-225,-705,-113,267,375,-422,182,353,-404,298,-434,496,-715,684,967,274,-169,-863,-862} ));
		
	}

	public static boolean containsDuplicate(int[] nums) {
        boolean resp = false;
        for(int i =0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j] ){
                    resp = true;
                }
            }
        }
    return resp;
    }
	
	public static boolean constainsDuplicate2(int[] nums) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		boolean resp = false;
		
			for(int i =0 ; i < nums.length ; i++){
				if(map.containsKey(nums[i])) {
					resp = true;
				}
				map.put(nums[i], 1);
			}
		
		return resp;
		
		
	} 

}
