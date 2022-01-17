package AdaptorDesign;

public class Main {


    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if(hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round the hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        //converts the square to circle
        SquarePegAdaptor smallSquarePegAdaptor = new SquarePegAdaptor(smallSqPeg);
        SquarePegAdaptor largeSquarePegAdaptor = new SquarePegAdaptor(largeSqPeg);

        if(hole.fits(smallSquarePegAdaptor)){
            System.out.println("Fitted small sq");
        }
        if(!hole.fits(largeSquarePegAdaptor)){
            System.out.println("Dont fitted");
        }
    }
}
