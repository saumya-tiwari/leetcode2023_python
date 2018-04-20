class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       Map<String,Integer> map = new LinkedHashMap<>();
       Map<String,Integer> s = new LinkedHashMap<>();
        
        for(int i =0; i<list1.length;i++){
            map.put(list1[i], i);
        }
          
        
        for(int i =0; i<list2.length;i++){
            if(map.containsKey(list2[i]))
                s.put(list2[i],map.get(list2[i])+i);
            else
                map.put(list2[i],i);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(
                s.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                    Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        LinkedHashMap<Integer, List<String>> m1 = new LinkedHashMap<>();
        
        for(Map.Entry<String, Integer> me: list){
           
        }
        
       TreeSet<String> set = new TreeSet<>();
       TreeSet<Integer> set1 = new TreeSet<>();
       // String [] sarray = new String[];
         for(Map.Entry<String,Integer> e: list){
            set1.add(e.getValue());
            
        }
        
        
        int min = set1.first();
        for(Map.Entry<String,Integer> e: list){
           // System.out.println(e.getKey()+" "+e.getValue());
            if(e.getValue()<=min)
            set.add(e.getKey());
            
        }
            
          String [] sarray = set.toArray(new String[set.size()]);
          return sarray;   
        
    }
}