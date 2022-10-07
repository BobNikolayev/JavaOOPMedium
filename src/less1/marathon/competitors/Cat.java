package less1.marathon.competitors;

public class Cat implements Competitor{

    String name;
    int maxRunDist;
    int maxJumpHeight;
    boolean isOnDistance = true;

    public Cat(String name) {
        this.name = name;
        maxRunDist = 500;
        maxJumpHeight = 5;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxJumpHeight){
            System.out.printf("%s run %d m \n", name, dist);
        }else{
            System.out.printf("%s cant run %d m \n", name, dist);
            isOnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxRunDist){
            System.out.printf("%s jump %d m \n", name, height);
        }else{
            System.out.printf("%s cant jump %d m \n", name, height);
            isOnDistance = false;
        }
    }


    @Override
    public void info() {
        System.out.printf("%s on distance %s\n",name,isOnDistance);
    }

    public boolean isOnDistance() {
        return isOnDistance;
    }
}
