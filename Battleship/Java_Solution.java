class Solution {
  
  public double getHitProbability(int R, int C, int[][] G) {
   float hitcell = 0;
   int c = C;
    int r = R;
    while(R>0)
   {
     while(C>0)
     {
       if(G[R-1][C-1]==1)
       {hitcell++;}
        C = C - 1;
     }
      if(R!=0)
      {
        C = c;
      }
      R = R - 1;
   }
    int m = c*r;
    double answer = hitcell/m;
    return answer;
  }
  
}

