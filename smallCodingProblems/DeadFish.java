package com.fdmgroup.smallCodingProblems;

import java.util.ArrayList;

public class DeadFish {

    public static int[] parse(String data) {
        ArrayList<Integer> retArr = new ArrayList<>();
        int numPlaceholder = 0;
        for (int i =0; i<data.length();i++){
            System.out.println(data.charAt(i));
        	if(data.charAt(i) == 'i'){
              numPlaceholder++;
            }
            else if(data.charAt(i) == 'd'){
              numPlaceholder--;
            }
            else if(data.charAt(i) == 's'){
              numPlaceholder = numPlaceholder*numPlaceholder;
            }
            else if(data.charAt(i) == 'o'){
              retArr.add(numPlaceholder);
            }
            else continue;
          }
        return retArr.stream().mapToInt(i->i).toArray();
      }
}
