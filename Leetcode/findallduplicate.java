import java.util.ArrayList;
import java.util.List;

public class findallduplicate{
    public static void main(String[] args){

    }
    public List<Integer> findDuplicates(int[] nums)
    {   List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(i!=correct){
                swaps(nums,i,correct);
                      
            }else{
                        i++;
                      }
        }
        for(int index=0;index<nums.length;index++){
            if(index+1!=nums[index]){
                list.add(nums[index]);
            }
        }
        return list;
    }
    public void swaps(int[] nums,int first ,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}