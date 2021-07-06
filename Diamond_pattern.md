# Diamond_pattern (Java) - 書き途中
## 訓練校で出た課題「菱形を描く」  
<br>

Java言語の実習が5月いっぱい行われ、  
幾つかテキスト以外から課題が出されました。  

本日紹介するのは、そんな課題の１つで、  
5月10日頃に出された「菱形を描く」という課題になります。  
<br>
この課題が出た時期は、授業が始まってまだ一週間程、  
for文、while文あたりを授業で終えたところでの課題でした。  
<br>
周りに自分と同じ方法で描画した仲間はいなかったので、  
もしかしたら珍しかったのかも？と思い、  
未熟な部分は多々ありますが記録として残すことにしました。  
<br>
<hr>

## 課題を解くにあたってのお話  
<br>

1, 以下のような菱形をコンソールに出力する。  

![コンソール出力画面イメージ](https://github.com/kimihiro-abe/Diamond-pattern/blob/main/Daimond_pattern_00.png)


2, 描ければ方法は問わない  
<br>


## 課題を見て考えたこと  
じーっと、菱形の図形を見ていたら、  
２Dのシミュレーションゲームでしばしば見かける、  
移動可能範囲を示す下記のようなものが見えてきた。  
<img src="https://github.com/kimihiro-abe/Diamond-pattern/blob/main/Daimond_pattern_01.png" width="50%">
<br>

漠然とではあるが「**描画可能そうな予感**」がしたので、  
踏み込んで考えることにする。  
<br>
1, 地道に数えてみる...  
自分がいる場所（中心）をゼロとして見てみると、  
中心から五歩圏内だということがわかった。  
<img src="https://github.com/kimihiro-abe/Diamond-pattern/blob/main/Daimond_pattern_02.png" width="50%">
  
<br>
2, 中心をX=0,Y=0としてメモリをふってみる。  <br>
ひとまず、単純にXとYの値を足すと駄目だが、  <br>
マイナスの箇所を絶対値処理したら大丈夫そうである。  
<img src="https://github.com/kimihiro-abe/Diamond-pattern/blob/main/Daimond_pattern_03.png" width="50%">
<br>

3, ..が、念のためにエクセルで絶対値処理を検証してみた図。  
XとYの値を足したものが想定と一致！  
<img src="https://github.com/kimihiro-abe/Diamond-pattern/blob/main/Daimond_pattern_04.png" width="50%">

これでプログラムを組んでみたのが、  
アップしたリストになります。
<br>

## あとがき

思っていた以上にプログラムがスッキリしたことと、  
意図した通りの結果を出力出来たことに、  
細やかながら喜びがありました。
<br>
ひとまず、今回はこのへんで。
