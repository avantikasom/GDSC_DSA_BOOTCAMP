import java.util.*;

public class RotateArray {
        static void rotate(int[] nums, int k) {
            k=k%nums.length;
            int[] temp = new int[k];
            for(int i=0;i<k;i++){
                temp[i]=nums[nums.length-k+i];
            }
            
    
            for(int i=nums.length-1-k;i>=0;i--){
                nums[i+k]=nums[i];
             
            }
          
            for(int i=0;i<k;i++){
                nums[i]=temp[i];
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
             System.out.println("Enter the number of rotations: ");
            int k = sc.nextInt();
            rotate(nums,k);
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }

        }
    }