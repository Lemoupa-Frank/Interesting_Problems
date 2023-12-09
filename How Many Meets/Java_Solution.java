#include <boost/math/common_factor.hpp> 
class Solution {
public:
    long long meetThem(long long A, long long B, long long C) {
    using namespace std; 
          return  (C / ((boost::math::lcm(A,B)) ));
       
    }
};
