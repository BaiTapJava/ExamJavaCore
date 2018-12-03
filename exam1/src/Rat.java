public class Rat {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   private int weight;
   private int speed;

   public Rat () {

   }
   public Rat(String name,int weight,int speed) {
      this.name = name;
      this.speed = speed;
      this.weight =weight;
   }

   public void run() {
      System.out.println("Chuột đang chạy với tốc độ là: "+speed);
   }
   public String toString() {
      return "Ten cua meo: "+ name + "\n Can nang la: " + weight + "\n Toc do la:  " + speed;
   }

}
