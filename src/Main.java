public class Main {
    public static void main(String[] args) {
        //declare variables
        int counterOne = 0 ;
        int counterTwo = 30 ;
        int counterThree = 0 ;
        int counterFour = 10 ;

        // complete for counter for part 1
            for (int i = 0; i < 31; i++) {
                System.out.println(counterOne) ;
                counterOne = counterOne + 1 ;
            }
        // write for counter for part 2
            for (int i = 30; i > -1; i--) {
                System.out.println(counterTwo) ;
                counterTwo = counterTwo - 1 ;
            }
        // write counter for part 3
            for (int i = 0; i < 7; i++) {
                System.out.println(counterThree) ;
                counterThree = counterThree +3 ;
            }
        // write counter for part 4
            for (int i = 5; i > -1; i--) {
                System.out.println(counterFour) ;
                counterFour = counterFour - 2 ;
            }
    }
}