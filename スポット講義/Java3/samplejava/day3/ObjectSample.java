package day3;

public class ObjectSample {
    public static void main(String[] args) {
        Bread bread1 = new Bread("FamilyMart");
        Bread bread2 = new Bread("CTC");
        Bread bread3 = new Bread("Itochu");
    
        bread1.printMaker();
        bread2.printMaker();
        bread3.printMaker();

        bread1.setMaker("Mihara");  //bread1.setMakerできない。なぜ。
        
        bread1.printMaker();

        // bread1.setMakerを書いてみるとどうなりますか？？
    }
}
