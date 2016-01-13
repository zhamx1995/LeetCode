public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int na = 0;
        int nb = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(na<m || nb<n){
            if(na == m && nb < n){
                list.add(nums2[nb]);
                nb++;
            }
            else if(nb == n && na < m){
                list.add(nums1[na]);
                na++;
            }
            else{
            if(nums1[na] <= nums2[nb]){
                list.add(nums1[na]);
                na++;
            }
            else{
                list.add(nums2[nb]);
                nb++;
            }
            }
        }
        for(int i = 0; i<list.size(); i++){
            nums1[i] = list.get(i);
        }
        
    }
}