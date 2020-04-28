/* 
* Write a method maxOccurrences that accepts a List of integers as 
* a parameter and returns the number of times the most frequently
* occurring integer (the "mode") occurs in the list. Solve this 
* problem using a Map as auxiliary storage. If the list is empty, 
* return 0. 
*/

public static int maxOccurrences(List<Integer> list) {
   Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    int max=0;
    for(int n: list){
        if(map.containsKey(n)){
            map.put(n,map.get(n)+1);
        }else{
            map.put(n,1);
        }
        if(map.get(n)>max){
            max=map.get(n);
        }
        
    }
    return max;
}
