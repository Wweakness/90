import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        int count = 0;
        int k=0;
        int end =0;
        for(int i=0;i<b.length;i++){
            if(Character.isDigit(b[i])){
                k++;
                if(k>count){
                    count=k;
                    end=i;
                }
            }
            else{

                    k=0;
                }
            }
        System.out.println(a.substring(end-count+1,end+1));
        }

    }


