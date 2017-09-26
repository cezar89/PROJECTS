package firstNonRepeating;

import java.util.HashMap;

public class FirstNonRepeating {

	public Character getNonRepeating(String str){
		HashMap<Character,Integer> charHash = new HashMap<Character,Integer>();
		char c;
		int length = str.length();
		for (int i = 0 ; i<length ; i++){
			c = str.charAt(i);
			if (charHash.containsKey(c)){
				charHash.put(c, charHash.get(c)+1);
			}
			else{
				charHash.put(c, 1);
			}
		}
		for(int i = 0; i< length; i++){
			c = str.charAt(i);
			if (charHash.get(c)==1){
				return c;
			}
		}
		return null;
	}
}
