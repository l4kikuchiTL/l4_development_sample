'use strict';

console.log('JavaScriptファイルからログ出力');


// アラートダイアログボックス

window.alert('アラートを表示します');


// 変数を数値型に変換（parseInt）

let answerbox = parseInt(window.prompt('入社して何ヶ月ですか？数字を入力してください'));

// 入力された値[answerbox]の内容をconsole.logで確認

console.log(answerbox);

// answerbox = 0
if(answerbox === 0){

    window.alert('ようこそ');

// answerbox = マイナス
} else if(answerbox < 0){

    window.alert('ありえません');

// answerbox = それ以外
} else{

    // 変数を変更（+1 して、メッセージ表示）
    answerbox = answerbox + 1;

    window.alert('来月は' + answerbox + 'ヶ月目ですね');
};
