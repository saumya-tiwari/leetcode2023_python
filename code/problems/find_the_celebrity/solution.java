/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    
    int noOfPeople;
    public int findCelebrity(int n) {
        this.noOfPeople = n;
        
        int celebrityCandidate = 0;
        
        for(int i = 0; i < n; i++){
            if(knows(celebrityCandidate, i))
                celebrityCandidate = i;
        }
        
        if(isCelebrity(celebrityCandidate))
            return celebrityCandidate;
        return -1;
        
    }
    
    private boolean isCelebrity(int candidate){
        for(int i = 0; i < noOfPeople; i++){
            if(candidate == i) continue;
            if(knows(candidate, i) || !knows(i, candidate))
                return false;
        }
        
        return true;
    }
}