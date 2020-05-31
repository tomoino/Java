public class App {
    /* mainメソッド */
    public static void main(String[] args) throws Exception {
        /* 変数：変数の寿命はブロックが終了するまで。 */
        /* 整数 */
        long bigInt = 100000000L; // long型は最後にLを付ける
        int integer = 150000;
        short smallInteger = 30000;
        byte byteInteget = 100;
        /* 小数：真に厳密な計算ができないことに注意する */
        double height = 171.2;
        float weight = 67.5F; // float型は最後にFを付ける
        /* その他 */
        boolean exists = true;
        char gender = '男'; // charは引用符
        String hanzi = "漢字"; // Stringは二重引用符
        int strLen = hanzi.length(); // length()を付けると文字数を取得できる
        
        /* 定数: finalをつける */
        final double TAX = 1.10;

        /* 型変換 */
        int height2 = (int) height;
        String myHeight = "身長は" + height2 + "cm"; // 異なる型同士の演算では型変換を伴うことがある

        /* 各種関数 */
        System.out.println("Hello, World!"); // 標準出力、改行される
        System.out.print("Hello!\n"); // 改行されない
        String input = new java.util.Scanner(System.in).nextLine(); //1行の文字列入力を受け取る
        int inputInt = new java.util.Scanner(System.in).nextInt(); //1行の整数入力を受け取る

        double m = Math.max(height, weight); // 大きいほうの値
        int n = Integer.parseInt("123"); // 文字列をint型に変換する
        int r = new java.util.Random().nextInt(100); // 乱数を生成

        /* 条件分岐 */
        if (height >= 175) {
            System.out.println("Big");
        } else if (height >= 160) {
            System.out.println("Normal");
        } else {
            System.out.println("Small");
        }
        // switch, while, forはCと同様。

        /* 配列 */
        int[] arr; // 型名[]で宣言。int型の配列がメモリ上に作成
        // arr = new int[5]; // int型の要素を5個作成する。
        // arr = new int[5][10]; // 多次元配列も生成できる。
        arr = new int[] { 0, 1, 2, 3, 4}; // 配列の初期化。arrには配列の先頭要素のアドレスが代入される。
        System.out.println(arr.length); // 配列の長さ
        for (int value : arr) { // 配列の要素を順に取り出すときの書き方
            System.out.println(value);
        }
        int[] arr2 = arr; // arr2はarrと同じアドレスになる。
        /* ガベージコレクション：
        　　    newで確保された要素の寿命はブロックが終了しても続くため、本来Cのようにメモリ解放をしなくてはいけないが 、
                Javaではどの変数からも参照されなくなったメモリ領域を自動的に解放してくれる。
        */
        /* nullについて；
            nullを代入すると参照型の変数はどこも参照していない状態になる。
        */

    }
}
