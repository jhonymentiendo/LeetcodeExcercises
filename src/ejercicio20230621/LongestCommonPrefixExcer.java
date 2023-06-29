package ejercicio20230621;

import java.util.Arrays;

public class LongestCommonPrefixExcer {

	public static void main(String[] args) {

		System.out.println(longestCommonPrefix(new String[] { "asprimera","ASdssegunda","asztercera","ascuarta" }));

	}

	public static String longestCommonPrefix2(String[] strs) {
		StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        //System.out.println(strs.);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            //if (first.charAt(i) != last.charAt(i)) {
        	if(first.toLowerCase().charAt(i) != last.toLowerCase().charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
	}

	public static String longestCommonPrefix(String[] strs) {
		
        StringBuilder resp = new StringBuilder();
        //ordenar el arreglo
        Arrays.sort(strs);
        String primeraPalabra = strs[0];
        String ultimaPalabra = strs[strs.length-1];
        for(int i=0;i<Math.min(primeraPalabra.length(),ultimaPalabra.length());i++){
            if(primeraPalabra.toLowerCase().charAt(i) != ultimaPalabra.toLowerCase().charAt(i) ){
                return resp.toString();
            }
            resp.append(primeraPalabra.charAt(i));
        }


        return resp.toString();
    }
	
}
