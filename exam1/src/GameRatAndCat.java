public class GameRatAndCat {
    public static void main(String[] args) {

        System.out.println("=========Thong tin cua chuot =========");
        Rat rat = new Rat("Jerry",13,10);
        System.out.println(rat);
        rat.run();
        System.out.println("==============================");

        System.out.println("=========Thong tin cua meo =========");

        Cat cat = new Cat("Tom",10);
        System.out.println("Meo ten la: "+cat.getName());
        System.out.println("Toc do cua meo la: "+cat.getSpeed());
        cat.run();

    }
}
