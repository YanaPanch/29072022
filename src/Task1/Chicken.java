package Task1;

public class Chicken extends NonFlyingBird{
    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly(){
        System.out.print("Chicken can fly - ");
        return false;
    }

    @Override
    public String toString() {
        return "Chicken has feathers and lay eggs";
    }
}
