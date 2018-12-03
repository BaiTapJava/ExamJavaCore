public class Cat{
    String name;
    int speed;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    Cat (String name,int speed) {
        this.name =name;
        this.speed =speed;
    }

    public void run() {
        System.out.println("Toc cua meo chay la: "+speed);
    }
    public boolean catchRat(Rat rat) {
        if (rat.getSpeed()==getSpeed()){
            return true;
        }else {
            return false;
        }
    }
    public void eat(Rat food){

    }
}
