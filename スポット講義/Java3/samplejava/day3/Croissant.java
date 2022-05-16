package day3;

public class Croissant extends Bread /* implements Bakable, FactoryProduct */ {
    public Croissant(String maker) {
        super(maker);
    }

    public void bake() {
        System.out.println("焼けました！");
    }

    /*
    public void produceBy1000() {
        System.out.println("1000個焼けました！");
    }
    */
}
