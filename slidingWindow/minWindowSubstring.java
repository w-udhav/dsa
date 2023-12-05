package slidingWindow;

import java.util.HashMap;

public class minWindowSubstring {
  private static int solution(String s){
    HashMap<Character, Integer> map = new HashMap<>();
    int min = Integer.MAX_VALUE;
    for(char x : s.toCharArray()){
      if(map.containsKey(x)){
        map.put(x, map.get(x)+1);
      } else {
        map.put(x, 1);
      }
    }
    int count = map.size();
    int i=0, j=0;
    while(j < s.length()){

      if(count == 0){

      }

      

      j++;
    }

    return min;
  }
}
