import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> r=new ArrayList<Integer>();
        if(input==null||k==0||k>input.length){
            return r;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            r.add(input[i]) ;

        }
        return  r;

    }
}