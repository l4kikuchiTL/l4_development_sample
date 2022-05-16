'use strict';

console.log('JavaScriptファイルからログ出力');

// 数量プルダウン変更時
document.getElementById('form').number.addEventListener("change", function(){
    // 単価取得
    let bag_unit_price = document.getElementById('unit_price').textContent;
    console.log('単価：' + bag_unit_price);
    // 単価の3桁区切りを削除
    let bag_unit_price2 = parseInt(bag_unit_price.replace(/,/g, ''));
    console.log('単価（カンマ削除）：' + bag_unit_price2);
    // 数量取得
    let bag_number = parseInt(document.getElementById('form').number.value);
    console.log('数量：' + bag_number);
    
    // 数量×単価
    let bag_subtotal = bag_number * bag_unit_price2; 
    console.log('数量×単価：' + bag_subtotal);
    // 価格欄に反映
    document.getElementById('output_total').textContent = bag_subtotal.toLocaleString();
    // 税込価格を反映
    let bag_grandtotal = cal_tax(bag_subtotal); 
    console.log('税込価格：' + bag_grandtotal);
    document.getElementById('grand_total').textContent = bag_grandtotal.toLocaleString();
	}, false);
	

// 消費税計算用ファンクション
function cal_tax(price) {
    // 現在の税率は10%
    const tax = 0.1;
    const new_price = price + price * tax;

    console.log('税込価格：' + new_price);

    return new_price;
}



