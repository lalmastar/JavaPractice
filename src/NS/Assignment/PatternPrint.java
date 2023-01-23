package NS.Assignment;

public class PatternPrint {
    public static void pattern1(int rows){
        for (int i=1;i <= rows; i++ )
        {
            for (int j=1; j <= i; j++ )
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i=rows-1; i >= 1; i-- )
        {
            for(int j=1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int rows){
        for (int i = 1; i <=5 ; i++) {

        }
    }

    public static void main(String[] args) {
        int rows=5;
        pattern1(rows);
        pattern2(rows);

    }
}
