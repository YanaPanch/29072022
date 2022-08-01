package Task1;

public class Penguin extends NonFlyingBird
{
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly(){
        System.out.print("Penguin can fly - ");
        return false;
    }

    @Override
    public String toString() {
        return "Penguin has feathers and lay eggs";
    }
}
