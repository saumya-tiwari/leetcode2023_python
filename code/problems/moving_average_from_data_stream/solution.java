class MovingAverage {

    List<Integer> numList;
    int k;
    public MovingAverage(int size) {
        
        numList = new ArrayList<>();
        k = size;
        
    }
    
    public double next(int val) {
        numList.add(val);
        
        double movingAvg = 0.0;
        
        
        for(int i  = 0, j = 0; j < numList.size(); j++){
            if(j > k - 1){
                movingAvg -= numList.get(i);
                i++;
            }
             movingAvg += numList.get(j);
        }
        
       if(numList.size() < k)
           return movingAvg / numList.size();
        else
            return movingAvg / k;
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */