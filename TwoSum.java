import java.util.*;

class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int tmp[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                     tmp[0]=i;
                     tmp[1]=j;
                     break;
                }
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
         }
        System.out.println("Enter the value of sum: ");
        int k = sc.nextInt();
         int[] tmp=twoSum(nums, k);
         for(int i=0;i<tmp.length;i++){
            System.out.print(tmp[i]+" ");
        }
    }
}