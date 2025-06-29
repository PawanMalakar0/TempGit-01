import java.util.Arrays;

class Solution{
public static void main(String[] args) {
    Solution sol = new Solution();
    int [] arr = new int[]{1,3};
    int [] ar2 = new int[]{2};
    double res = sol.MediunOfArray(arr,ar2);
    System.out.print(res + " ");
}
 public double MediunOfArray(int [] arr ,int arr2[] ){
    int [] tempArr = new int[arr.length +arr2.length];
    int arrIndex =0;
    int arr2Index = 0;
    int index = 0;
    int tempLength = 0;

   

    for(;index < tempArr.length ;index++){
        if(arr.length > arrIndex && arr2.length > arr2Index){
            
            if(arr[arrIndex] <= arr2[arr2Index]){
                tempArr[tempLength++] = arr[arrIndex++];
            }
            else if(arr[arrIndex] > arr2[arr2Index]){
               tempArr[tempLength++] =arr2[arr2Index++];
            }
           
        }else{
            break;
        }
    }
   while(arrIndex < arr.length){
    tempArr[tempLength++] = arr[arrIndex++];

   }
   while(arr2Index < arr2.length){
    tempArr[tempLength++] = arr2[arr2Index++];
    
    } 
    for (int elem  : tempArr) {
        System.out.print(elem + " ");
    }
    

double res ;
if (tempLength % 2 == 0) {
    res = (tempArr[tempLength/2 - 1] + tempArr[tempLength/2]) / 2.0;
} else {
    res = tempArr[tempLength/2];
}

return res;

 }

    public int searchInsert(int[] nums, int target) {
        int targetIndex = 0;
    for (int index = 0 ; index <  nums.length  ;index++){
       
        if(nums[index]==target) return index;

            System.out.println(nums[index] + " " + index + " " + target);

    }

    for (int index = 1; index <nums.length; index++) {

         if(nums[index -1] > target ){
            System.out.println(nums[index] + " " + index + " " + targetIndex );
            targetIndex = index-1;
            return targetIndex;

        }else if( nums[index -1] <  target && nums[index] >  target ){
            System.out.println(nums[index] + " " + index + " " + targetIndex );

         targetIndex = index;
         return targetIndex;
        
        }
    }
    return nums.length +1;
 

    
    }

}

