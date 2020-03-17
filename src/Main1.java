import javax.jnlp.SingleInstanceListener;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str=in.nextLine();
            int k=in.nextInt();
            String[] a=str.split(",");
            int[] b=new int[a.length];
            for(int i=0;i<a.length;i++){
                b[i]=Integer.parseInt(a[i]);
            }
            for(int i=0;i<b.length;i++){
                int j;
                for(j=i;j>0;j--){
                    if(b[i+1]>b[j]){
                        break;
                    }
                }
                for(int d=i;d>j;d--){
                    b[d+1]=b[d];
                }
                b[j+1]=b[i+1];
            }

        }
    }
}