class Solution {
    public long maximumTripletValue(int[] nums) {
        int size = 0;
        long max = 0L;
        if(nums.length == 3)
            {    
                return (long)((nums[0]-nums[1]) > 0 ? (long)(nums[0]-nums[1]) * nums[2] : 0);
            }
        while(size<nums.length-2)
        {
            for(int K = size + 1 ; K < nums.length - 1; K++)
            {
                if((nums[size]-nums[K])>0)
                    {                   
                        for(int a = K + 1; a < nums.length; a++)
                            {
                               System.out.println((nums[size]-nums[K]) * nums[a]); 
                                if( max < (long)(nums[size]-nums[K]) * nums[a])
                                    {
                                        max = (long)(nums[size]-nums[K]) * nums[a];
                                    }
                            }
                    }
            
            }  size++;
        }
        return max;
    }
}
