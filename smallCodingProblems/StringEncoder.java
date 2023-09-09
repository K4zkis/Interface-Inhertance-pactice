package com.fdmgroup.smallCodingProblems;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;

public class StringEncoder {
	
	@Test
	public void test() {
		assertEquals(")()))()))))()(",encode("Supralapsarian"));
		assertEquals(")()))()))))()(",encodeUpdated("Supralapsarian"));

	}
	
	
	static String encode(String word){
	    word = word.toLowerCase();
	    String[] wordArray = word.split("");
	    StringBuilder returnWord = new StringBuilder();
	    HashMap<String,Integer> letterOccurrences = new HashMap<>();
	    for (String letter : wordArray){
	      if(letterOccurrences.containsKey(letter))
	        letterOccurrences.put(letter,letterOccurrences.get(letter)+1);
	      else letterOccurrences.put(letter, 1);
	    }
	    for (String letter : wordArray){
	    	if (letterOccurrences.get(letter)>1)returnWord.append(")");
	    	else returnWord.append("(");
	    }
	    return returnWord.toString();
	  }
	static String encodeUpdated(String word){
	    word = word.toLowerCase();
	    String result = "";
	    for (int i = 0; i < word.length(); ++i) {
	      char c = word.charAt(i);
	      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
	    }
	    return result;
	  }

}
