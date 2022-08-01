package Task1;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        System.out.print("Can fly - ");
        return true;
    }

    @Override
    public String toString() {
        return "Flying bird has feathers and lay eggs";
    }

}
