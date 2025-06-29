public class MedianOfShortedArray {
    public double findMedianSortedArrays(int[] arr, int[] arr2) {
        
    
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
   

double res ;
if (tempLength % 2 == 0) {
    res = (tempArr[tempLength/2 - 1] + tempArr[tempLength/2]) / 2.0;
} else {
    res = tempArr[tempLength/2];
}
return res;

 }

    


}