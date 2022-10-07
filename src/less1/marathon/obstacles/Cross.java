package less1.marathon.obstacles;

import less1.marathon.competitors.Competitor;

public class Cross implements Obstacles{
     int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.run(dist);
    }
}
