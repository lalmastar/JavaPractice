package Newton_Revision.DSA_0;
import java.util.*;
public class Golden_Ratio {
    public static void checkGoldenRatio(float a, float b){
        if(a <= b){
            float temp = a;
            a = b;
            b = temp;
        }

        String ratio1 = String.format("%.3f", a/b);
        String ratio2 = String.format("%.3f", (a+b)/a) ;

        if(ratio1.equals(ratio2) && ratio1.equals("1.618")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        checkGoldenRatio(a, b);
    }
}
