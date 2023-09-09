package com.fdmgroup.smallCodingProblems;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.ArrayList;
public class ReduceOccurencesInArray {

	public static void main(String[] args) {
		/*My most horrible code written so far*/


	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
	
		HashMap<Integer,Integer> toReturn = new HashMap<>();
    // map representing the value with their occurences as value
    for(int i=0; i<elements.length;i++)
    	if(toReturn.containsKey(elements[i])){ 
    		int occurrences = toReturn.get(elements[i]);
    		if(occurrences <= maxOccurrences)toReturn.put(elements[i],occurrences+1);
    		else continue;
        }
    	else toReturn.put(elements[i],1);
      }
    // now we have a map with the elements and theiroccurrences
  // while staying below the desired occurrences
	ArrayList<Integer> returnedList = new ArrayList<>();
	TreeSet<Integer> keysToPut = (TreeSet<Integer>) toReturn.keySet();
	while (!toReturn.isEmpty()){
		Integer key = keysToPut.first();
		Integer one = 1;
		int occurrences = toReturn.get(key);
		if(occurrences>one){
			returnedList.add(key);
			toReturn.put(key,occurrences-1);
		}
		else if (occurrences==one) {
			returnedList.add(key);
			toReturn.remove(key,one);
			keysToPut.remove(key);
		}
	}
	return returnedList.stream().mapToInt(i->i).toArray();
	}

 
		 
		 */

	

}
