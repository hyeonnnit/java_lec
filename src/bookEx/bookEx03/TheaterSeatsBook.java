package bookEx.bookEx03;

public class TheaterSeatsBook {
    public static void main(String[] args) {

        int [][] seats = {
                {0,0,0,1,1,0,0,0,0,0},
                {0,0,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,0}};

        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int k = 0; k < seats[i].length; k++) {
                count += seats[i][k];
            }
        }
        System.out.println("전체 관객수는: " + count);
    }
}
