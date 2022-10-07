package less1;

import less1.marathon.competitors.Cat;
import less1.marathon.competitors.Competitor;
import less1.marathon.competitors.Human;
import less1.marathon.competitors.Robot;
import less1.marathon.obstacles.Cross;
import less1.marathon.obstacles.Obstacles;
import less1.marathon.obstacles.Wall;

public class Main {
    public static void main(String[] args) {

        Competitor competitors[] = {
                new Cat("barsik"),
                new Robot("destroyer"),
                new Human("Rob")
        };

        Obstacles obstacles[] = {
                new Wall(2),
                new Cross(1000)
        };


        for (Competitor c: competitors) {

            for (Obstacles o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }

        }

        for (Competitor c :competitors) {
            c.info();
        }




    }
}
