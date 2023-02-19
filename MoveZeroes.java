
import java.util.*;

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
        int count=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               count++;
           }
       }
       int[] tmp= new int[nums.length-count];
       int j=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               tmp[j]=nums[i];
               j++;
           }
       }
       for(int i=0;i<nums.length;i++){
           if(i<(nums.length-count)){
               nums[i]=tmp[i];
           }
           else{
               nums[i]=0;
           }
                 
         }
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
             moveZeroes(nums);
             System.out.println("After moving zeroes to the end");
             for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
    }
}
