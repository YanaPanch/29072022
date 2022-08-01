package Task1;

public class Swallow extends FlyingBird{
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly(){
        System.out.print("Swallow can fly - ");
        return true;
    }

    @Override
    public String toString() {
        return "Swallow has feathers and lay eggs";
    }
}
