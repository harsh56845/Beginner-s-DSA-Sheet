// Time complicity -> O(N) -> Linear Time
// Space Complicity -> O(1) -> Constant Space
class Solution
{
    public long reverse_digit(long n)
    {
        long revNum = 0;
        while(n!=0){
            // rem last digit of a number
            long rem = n%10;
            // make a space in rev number to not to plus make it cocatince
            revNum = revNum*10 + rem;
            // remove last digit
            n/=10;
        }
        return revNum;
    }
}
