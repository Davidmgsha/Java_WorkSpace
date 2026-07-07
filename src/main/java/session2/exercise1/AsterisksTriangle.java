package session2.exercise1;

public class AsterisksTriangle {
    public static void main(String[] args){
        for(int row = 1; row<=8; row++){
            for(int space =1; space<=row; space++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
