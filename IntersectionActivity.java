import java.util.*;
public class IntersectionActivity {
  /* Optimaized an intersection algorithm that finds shared values of elements between two
  arrays from a O(n^2) time to O(n) time using a hashMap with different passes through the arrays*/
  public static void main(String[] args){
    int[] a = {2, 4, 6, 7, 9};
    int[] b = {1, 2, 3, 5, 6, 8, 9};
    intersection(a, b);
  }
  private static void intersection(int[] a, int[] b){
    HashMap<Integer, Integer> map = new HashMap<>();
    Integer key = Integer.valueOf(0);

    //puts the first list into the map
    for(int element: a){
      map.put(element, 0);
    }

    //if key exists that's equal to b[i] then place a 1 in the key's value
    for(int element: b){
      if(map.containsKey(element)){
        map.put(element, 1);
      }
    }

    Iterator<Integer> keys = map.keySet().iterator();

    //for every key, if a value exists equal to 1 then it intersects
    while(keys.hasNext()){
      key = keys.next();
      if(map.get(key) == 1){
        System.out.print(key + " ");
      }
    }
  }
}
