class Solution(object):
    def containsDuplicate(self, nums):
    
        g=set()
        # i=0
        for i in nums:
            if(i in g):
                return True
            g.add(i)
            
        return False
           
        
        