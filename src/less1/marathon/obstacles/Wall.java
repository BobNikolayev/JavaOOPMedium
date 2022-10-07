package less1.marathon.obstacles;

import less1.marathon.competitors.Competitor;

public class Wall implements Obstacles{

    int height;

    public Wall(int dist) {
        this.height = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.jump(height);
    }
}
