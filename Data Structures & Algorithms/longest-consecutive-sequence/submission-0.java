class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
    {
      return 0;
    }
    Arrays.sort(nums);
    int res = 0;
    int curr = nums[0];
    int st = 0;
    int i = 0;

    while(i < nums.length)
    {
      if(curr != nums[i])
      {
        curr = nums[i];
        st = 0;
      }
      while( i < nums.length && nums[i] == curr)
      {
        i++;
      }
      st++;
      curr++;
      res = Math.max(res,st);
    }
    return res;
    }
}
