package Practice;


public class ReverseWord {

    public static String Reverse1(String str) {
        String arr[] = str.split("[.]");
        String ans = "";

        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            if(i!=0) ans+=".";
        }
        return ans;
    }
    public static void Reverse(String str) {
        String rev="";
        char ch;
        for(int i=0; i<str.length(); i++) {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
//		System.out.println(rev.charAt(1));
    }
    public static void ReversePrint(String str) {
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\n"+str.charAt(0));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="much.very.program.this.like.i";

//		Reverse(str);
//		ReversePrint(str);
        System.out.println(Reverse1(str));

    }

}
