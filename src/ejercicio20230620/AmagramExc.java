package ejercicio20230620;

import java.util.HashMap;
import java.util.Map;

public class AmagramExc {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("asqwerdfa", "fdreqwas"));
		
	}
	
	
	public static boolean isAnagram(String s,String t) {
		boolean resp = true;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			map.put(c,map.getOrDefault(c, 0)+1 );
		}
		for(int i=0;i<t.length();i++) {
			char c= t.charAt(i);
			if(map.get(c)!= null) {
				if(map.get(c)==1) {
					map.remove(c);
				}else {
					map.put(c,map.getOrDefault(c, 0)-1 );
				}	
			}else {
				return false;
			}	
		}
		return map.isEmpty();
	}

}
