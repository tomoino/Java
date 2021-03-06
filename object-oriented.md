# オブジェクト指向
> ソフトウェアを開発するときに用いる部品化の考えのこと[1]

1つのプロジェクトを複数の部品に分化して組み上げる手法。オブジェクト指向という考え方に基づいて部品を分けることで人間がプログラムを把握しやすくなる。

## メリット
> プログラムを容易に変更しやすくなる（柔軟性・保守性の向上）
> プログラムの一部を簡単に転用できる（再利用性）


[1]

## 手続き型プログラミングとの違い
オブジェクト指向では、いきなりコーディングに入るのではなく現実世界に即した設計図をまず作る。
現実世界に出てくる登場人物単位で作る。

# オブジェクトと責務
それぞれのオブジェクトに責務（役割・責任）を割り当ててクラスを作る。

## 責任の種類
- 行動責任：あらかじめ設定された役割を果たす責任。
    - メソッド：そのオブジェクトが行う行動や動作の手順
- 情報保持責任：データを保持する責任。
    - プロパティ：そのオブジェクトに関する情報を覚えておく

オブジェクトは別のオブジェクトと相互作用できる

# オブジェクト指向の3大機能
1. カプセル化
2. 継承
3. 多態性

# クラス
オブジェクトの設計図。これをもとにオブジェクト(インスタンス)を生成する。
クラスを定義するとその型が使えるようになる。
Object Classがあるなら、Object型が使えるということになる。

* has-a関係：クラスが別のクラスをフィールドとして利用している場合

# カプセル化
フィールドへの読み書きやメソッドの呼び出しを制限できる機能（アクセス制御）。
不正な値の入力など、現実世界との乖離をメソッドによるフィールド保護によって防ぐ。

## メンバに対するアクセス制御
|  指定方法  | アクセスを許可する範囲   |
| ---- | ---- |
|  private  |  自分自身のクラスのみ  |
|  未修飾(package private) | 自分と同じパッケージに属するクラス |
| protected |  自分と同じパッケージに属するか、自分を継承した子クラス  |
| public | 全てのクラス |

基本的にはフィールドはprivate、メソッドはpublicにしておくと良い。

## getter / setter
getフィールド名、setフィールド名という風にメソッドを用意する。
### メリット
* ReadOnly、WriteOnlyなどフィールドの読み書き制限ができる。
* フィールド名など内部の変更がきく
* setterではバリデーションをかけられる

## クラスに対するアクセス制御
|  指定方法  | アクセスを許可する範囲   |
| ---- | ---- |
|  未修飾(package private) | 自分と同じパッケージに属するクラス |
| public | 全てのクラス |

1つのファイルにpublicクラスは１つ。このクラス名はファイル名と同名。

# 継承
元となるクラスの差分だけ記述して類似クラスを作成する。親クラスになるほど一般化（汎化）され、子クラスになるほど具体化（特化）される。

## 多重継承
複数のクラスを親として子クラスを定義する。Javaでは許可されていない。

## オーバーライド
親クラスのメンバを上書きして再定義すること。

## 継承・オーバーライドの禁止
クラスにfinalを付けると継承できなくなる。また、メソッドにfinalを付けるとオーバーライドできなくなる。

## is-a関係
子クラスは親クラスの一種でなければならない。そうでない場合は現実との乖離や多態性が利用できなくなる観点から継承を利用すべきではない。

# 高度な継承について
将来的に安全かつ効率よく使える親クラスを用意するための継承について。抽象クラスやインターフェースを扱う。

## クラスを作る際の不都合
* 処理内容を確定できない部分がある（詳細未定メソッド）
    * オーバーライド前提で空にしておくと、オーバーライドし忘れたり、意図的に空にしてるメソッドと区別がつかなくなったりして困る。
    * インスタンス化されると困る。

## 抽象クラス
### 詳細未定メソッド（抽象メソッド）
abstractを付けて詳細未定メソッドを作る。
```Java
public abstract void count(); 
```
抽象メソッドを含むクラスは抽象クラスでなければいけない。
### 抽象クラス
classの前にabstractを付ける。newによるインスタンス化ができなくなる。
抽象クラスを継承した場合、抽象メソッドをオーバーライドするか、抽象クラスにしないとエラーが出る。
```Java
public abstract class AbstractObject() {
    public abstract void count(); 
    ...
} 
```
## インターフェース
継承階層をうえにたどっていくとどんどん抽象的になっていき、持っている抽象メソッドやフィールドが減っていく。
インターフェースとは抽象クラスの中でも以下の条件を満たす特に抽象度の高いものを指す。
* 全てのメソッドが抽象メソッド
* 基本的にフィールドを一つも持たない
```Java
public interface class InterfaceObject() {
    void count(); // public abstractを省略できる 
    double PI = 3.14; // フィールドは基本使えないが、public static finalは例外
    ...
} 
```
インターフェースを継承する場合はextendsではなく、implementsを使う。
インターフェースは子クラスでオーバーライドしなければ使えないという性質があるので、クラスと違い多重継承できる。

# 多態性
* あるものをあえてざっくり似たようなものと捉えることでさまざまな機能を共有できる機能。
* 多態性には専用の文法はない。代入で変数の型を抽象クラスやインターフェースにして、より具体的なクラスをnewする。
* 下の例でいえば、Object is-a AbstractObjectの関係があるため型が違っても代入できる。
```Java
AbstractObject obj = new Object();
```
* is-aの関係はextendsやimplementsによって作られる。
* 捉え方が変わることで呼び出せるメソッドも変わる。変数の型によって呼び出せるメソッドが制限されるが、実際に呼び出されるのは具体的なメソッド。つまり、ざっくりと呼び出してもちゃんとそれぞれの動作をしてくれるということ。

## 多態性のメリット
* 実際には異なる型のものをざっくりととらえれば一つの凱列に入れて処理できる。
* ざっくりととらえることで関数の引数として利用しやすくなることがある。

# Javaの標準クラス
* 日付型DateとCalenderクラス
* Objectクラス：全ての祖先クラス