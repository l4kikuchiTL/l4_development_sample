package day1;

public class Sample {
    public static void main(String[] args) {
        //
        // Java基礎「最初のプログラム」
        //
        // System.out.println("Hello CTC!!!!!!!!!!!!!!");

        //
        // Java基礎「変数」
        //
        String valueString;
        int valueInt;
        double valueDouble;

        // ダメ
        // System.out.println(valueString);

        int a = 0;
        a = a - 1000;
        System.out.println("a = " + a);

        // 割り当てるとOK
        valueString = "変数には値を入れる必要あり"; // 文字列
        System.out.println(valueString);

        // 数値も割り当てる
        valueInt = 15; // 整数値
        valueDouble = 3.1415; // 小数値

        System.out.println(valueInt);
        System.out.println(valueDouble);


        // 何度でも入れ替えることができる
        valueString = "変数を置き換える";
        valueInt = 152;
        valueDouble = 123.456789;

        System.out.println(valueString);
        System.out.println(valueInt);
        System.out.println(valueDouble);

        //
        // 数値計算
        //
        double aa = 100;
        double b = 8;

        double result1 = aa + b;
        double result2 = aa - b;
        double result3 = aa * b;
        double result4 = aa / b;
        double result5 = aa % b;

        System.out.println("a + b = " + result1); // 足し算
        System.out.println("a - b = " + result2); // 引き算
        System.out.println("a x b = " + result3); // 掛け算
        System.out.println("a / b = " + result4); // 割り算
        System.out.println("a % b = " + result5); // 余り

        // 割り当てなおし
        a = a + 5;
        System.out.println("a + 5 = " + a);

        // インクリメント
        a++;
        System.out.println("aに1足すと = " + a);

        a += 10;
        System.out.println("今のaに10を足すと = " + a);

        // デクリメント
        a--;
        a--;
        System.out.println("aから1ずつ引くこと２回 = " + a);

        // 文字列結合
        String first = "こんにちは ";
        String second = "太郎さん！ ";

        System.out.println(first + second);

        // 他の基本的な型もOK
        int five = 5;
        double fivePointFive = 5.5;

        System.out.println(first + five + second + fivePointFive);
        System.out.println(five + fivePointFive);

   }
}