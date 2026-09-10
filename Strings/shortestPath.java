package Strings;
//import java.util.Scanner;
public class shortestPath {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String directions = "WNEENESENNN";
        int x=0,y=0;
        for(int i=0; i<directions.length(); i++){
            switch(directions.charAt(i)){
                case 'N':
                    x++;
                    break;
                case 'E':
                    y++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'W':
                    y--;
                    break;
            }
        }
        double shortestPath = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
        System.out.println("The Shortest Distance from (0,0) to ("+x+","+y+") is: "+shortestPath);
    }
}
