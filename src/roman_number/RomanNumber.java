package roman_number;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(romanToInt("III"));
		
	}

	
	public static int romanToInt(String s) {
		int resp=0;
		HashMap<Character, Integer> listaNumeros = new HashMap<>();
		listaNumeros.put('I',1);
		listaNumeros.put('V',5);
		listaNumeros.put('X',10);
		listaNumeros.put('L',50);
		listaNumeros.put('C',100);
		listaNumeros.put('D',500);
		listaNumeros.put('M',1000);

		for(int i = 0 ; i < s.length() ; i++) {
			
			if( i < s.length()-1 &&  listaNumeros.get(s.charAt(i)) < listaNumeros.get(s.charAt(i+1)) ) {
				resp-=listaNumeros.get(s.charAt(i));
			}else {
				resp+=listaNumeros.get(s.charAt(i));
			}
		}
		return resp;
	}
	
	
}
