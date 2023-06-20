package ejercicio20230620;

public class LongSubstringExcersice {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("pwwkew"));

	}
	
	public static int lengthOfLongestSubstring(String s) {
		int resp=0;
		String stemp="";
		for(char c : s.toCharArray()) {
			if(stemp.indexOf(c)!=-1) {
				stemp = stemp.substring(stemp.indexOf(c)+1);
				stemp+=c;
			}else {
				stemp +=c;
				resp = stemp.length()>resp?stemp.length():resp;
			}
		}
		
		return resp;
		
	}
	
	
}
