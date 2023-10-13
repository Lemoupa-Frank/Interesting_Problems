class Solution {
    public long maximumTripletValue(int[] nums) {
        int i = 0;
        long max = 0L;
        if(nums.length == 3)
            {    
                return (long)((nums[0]-nums[1]) > 0 ? (long)(nums[0]-nums[1]) * nums[2] : 0);
            }
        while(i<nums.length-2)
        {
            for(int j = i + 1 ; j < nums.length - 1; j++)
            {
                if((nums[i]-nums[j])>0)
                    {                   
                        for(int K = j + 1; K < nums.length; K++)
                            {
                                if( max < (long)(nums[i]-nums[j]) * nums[K])
                                    {
                                        max = (long)(nums[i]-nums[j]) * nums[K];
                                    }
                            }
                    }
            
            }  i++;
        }
        System.out.println(max);
        return max;
    }
}
