package day2;

import java.util.*;

public class Sample {

    public static void main(String[] args) {
        // 条件分岐
        int point = 40;
        boolean pass = point > 60;
        if (pass) {
            System.out.println("あなたの点数:" + point + " 及第点です");
        } else if (point > 40) {
            System.out.println("あなたの点数:" + point + " がんばりましょう");
        } else {
            System.out.println("あなたの点数:" + point + " 落第点です");
        }

        boolean manten = point == 100;
        if (manten) {
            System.out.println("満点です！");
        }

        int point1 = new Random().nextInt(101);
        int point2 = new Random().nextInt(101);
        boolean passTwoTests = point1 > 60 || point2 > 60;
        if (passTwoTests) {
            System.out.println("あなたのテスト１ 点数:" + point1 + " テスト２ 点数: " + point2 + " 及第点です");
        } else {
            System.out.println("あなたのテスト１ 点数:" + point1 + " テスト２ 点数: " + point2 + " 落第点です");
        }

        // 繰り返し処理 その１
        System.out.println("あなたは1人目の来訪者です。ようこそ！");
        System.out.println("あなたは2人目の来訪者です。ようこそ！");
        System.out.println("あなたは3人目の来訪者です。ようこそ！");
        System.out.println("あなたは4人目の来訪者です。ようこそ！");
        System.out.println("あなたは5人目の来訪者です。ようこそ！");

        // 繰り返し処理 その２（for）
        for (int i = 1; i <= 6; i++) {
            System.out.println("あなたは" + i + "人目の来訪者です。ようこそ！");
        }

        // 繰り返し処理（while）どこが悪いでしょう？
        int i = 0;
        while (i < 10) {
            System.out.println((i+1) + "回目の処理");
            i++;
        }

        int testscore = 80;
        int grade;
        if (testscore >= 80) {
            grade = 5;
        } else if (testscore >= 70) {
            grade = 4;
        } else if (testscore >= 60) {
            grade = 3;
        } else if (testscore >= 50) {
            grade = 2;
        } else {
            grade = 1;
        }

        System.out.println("成績は" + grade + "です");

        // データコンテナ（配列）
        int mathscore = 20;
        int japanesescore = 80;
        int sciencescore = 40;
        int englishscore = 60;

        // 平均点を計算
        double average = (mathscore + japanesescore + sciencescore + englishscore) / 4;
        System.out.println("平均点は" + average + "点でした");

        // 配列版
        int[] scores;
        int sum = 0;
        scores = new int[4];

        scores[0] = mathscore;
        scores[1] = japanesescore;
        scores[2] = sciencescore;
        scores[3] = englishscore;
        // scores[4] = 50;

        for (int score : scores) {
            sum += score;
        }
        average = sum / scores.length;
        System.out.println("【配列版】平均点は" + average + "点でした");

        // sumリセット
        sum = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < 4; j++) {
            int score = new Random().nextInt(101);
            list.add(score);
        }
        for (int score : list) {
            sum += score;
        }
        average = sum / list.size();
        System.out.println("【ArrayList版】平均点は" + average + "点でした");

        // sumリセット
        sum = 0;

        String[] subjects = { "数学", "国語", "科学", "英語" };
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String subject : subjects) {
            int score = new Random().nextInt(101);
            map.put(subject, score);
        }
        for (String subject : subjects) {
            int score = map.get(subject);
            sum += score;
        }
        average = sum / map.size();
        System.out.println("【HashMap版】平均点は" + average + "点でした");
    }
 }
