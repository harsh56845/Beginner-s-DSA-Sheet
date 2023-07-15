// Time Complicity -> O(N)
// Space COmplcity -> O(1)
class GfG
{
    public static void print(int arr[], int n)
    {
        // incr with 2
        for(int i=0;i<n;i=i+2){
            System.out.print(arr[i]+" ");
        }
    }
}
