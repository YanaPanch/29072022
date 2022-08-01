package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Chicken chicken = new Chicken(true, true);
        Eagle eagle = new Eagle(true, true);
        Penguin penguin = new Penguin(true, true);
        Swallow swallow = new Swallow(true, true);

        List<Bird> birds = new ArrayList<>();
        birds.add(chicken);
        birds.add(eagle);
        birds.add(penguin);
        birds.add(swallow);

        for (Bird b : birds) {
            String info = b.toString();
            System.out.println(info);
        }

        for (Bird b : birds) {
            System.out.println(b.fly());
        }
    }
}
