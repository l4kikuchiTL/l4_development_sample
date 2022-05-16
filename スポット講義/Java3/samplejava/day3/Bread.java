package day3;

public class Bread {
    // メンバ変数
    private String maker;    // メーカー

    // コンストラクタ
    public Bread(String maker) {
        this.maker = maker;
    }

    // メソッド
    public void printMaker() {
        System.out.println("これは" + maker + "製のパンです");
    }

    public void newMaker() {  //ここでnewMakerのメソッドの定義を行う。（newMakerをmakerに上書き）
       //this.newMaker = maker;  //this.とは（質問）
    }

    public void setMaker(String newMaker) {
        // メンバ変数：メーカー　をnewMakerで書き換えてみよう
        this.maker = newMaker;
        System.out.println("This is made by" + newMaker); //newMakerのプリント
    }

}
