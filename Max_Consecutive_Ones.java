public class Max_Consecutive_Ones {
    static int maxConsecutiveOnes(int N) {
        
        // Your code here
        int result=0,z;
        while(N>0){
            z=N<<1;
            N=N&z;
            result++;
        }
        return result;
        
    }
    public static void main(String args[]){
        System.out.println(maxConsecutiveOnes(14));
    }
}