package CodeChef;
import java.io.*;
public class Id_and_Ship {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int t = Integer.parseInt(s[0]);
        while(t-->0){
            String str = br.readLine();
            char ch = str.charAt(0);
            ch = Character.toLowerCase(ch);
            if(ch == 'b'){
                System.out.println("BattleShip");
            }
            else if(ch == 'c'){
                System.out.println("Cruiser");
            }
            else if(ch == 'd'){
                System.out.println("Destroyer");
            }
            else if(ch == 'f'){
                System.out.println("Frigate");
            }
        }
//        while(t-->0){
//            String str = br.readLine();
//            if(str.equals("B") || str.equals("b")){
//                System.out.println("BattleShip");
//            }
//            else if(str.equals("C") || str.equals("c")){
//                System.out.println("Cruiser");
//            }
//            else if(str.equals("D") || str.equals("d")){
//                System.out.println("Destroyer");
//            }
//            else if(str.equals("F") || str.equals("f")){
//                System.out.println("Frigate");
//            }
//        }
    }
}
