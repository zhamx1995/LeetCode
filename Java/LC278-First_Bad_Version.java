/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return find(1,n);
    }
    
    public int find(int l, int r){
        if(l == r){
            return r;
        }
        else{
        int middle = l/2 + r/2;
        if(isBadVersion(middle)){
            return find(l,middle);
        }
        else{
            return find(middle+1,r);
        }
        }
    }
}