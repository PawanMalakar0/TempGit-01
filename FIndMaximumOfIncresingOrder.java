import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FIndMaximumOfIncresingOrder{
    public static void main(String[] args) {
      List <Integer> arr = new ArrayList<Integer>();
      int [] nums = new int[]{1,5,2,10};
for (int iterable_element : nums) {
    
    arr.add(iterable_element);
}
     FIndMaximumOfIncresingOrder fn = new FIndMaximumOfIncresingOrder();
     int res = fn.findMaxiumDiffinIncresingOr(arr);
     System.out.println(res);
    }

    public int findMaxiumDiffinIncresingOr(List <Integer> arr){
        int maximum=0;
       int size = arr.size()-1;
       int idx = 0;
       while(idx <size){

           int idj = idx+1;
           int first = arr.get(idx);
           while (idj <=size) {
            int last = arr.get(idj);
            if(last  < first){idj++; continue;}
            int total = last - first;
            maximum = Math.max(maximum, total);
            idj++;
           }
           
           idx++;
        }
   
        return (maximum == 0)? -1: maximum;

    }
}