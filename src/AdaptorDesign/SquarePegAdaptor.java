package AdaptorDesign;

public class SquarePegAdaptor extends RoundPeg{
    //composition
    private SquarePeg peg;

    public SquarePegAdaptor(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        //returning result by converting square to circle
        double result=Math.sqrt(Math.pow(peg.getWidth()/2,2)*2);
        return result;
    }
}
