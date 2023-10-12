/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */



class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        
        int peak = peakIndex(1,length-2,mountainArr);
        
        int increse = bs(0,peak,target,mountainArr,false);
        
        if(mountainArr.get(increse) == target) return increse;
        
        int decrese = bs(peak+1,length -1,target,mountainArr,true);
        
        if(mountainArr.get(decrese) == target) return decrese;
        
        return -1;
    }
    
    public int peakIndex(int l, int h, MountainArray mountainArr){
        while(l != h){
            int m = l +(h - l)/2;
            if(mountainArr.get(m) < mountainArr.get(m+1)) l = m+1;
            else h = m;
        }
        return l;
    }
    
    public int bs(int l , int h , int target, MountainArray mountainArr, boolean reversed){
      
        while(l != h ){
            int m = l + (h - l) /2;
            if(reversed){
                if(mountainArr.get(m) > target) l = m+1;
                else h = m ;
            }else{
                if(mountainArr.get(m) < target) l = m + 1;
                else h = m;
            }
        }
        return l;
    }
    
    
}