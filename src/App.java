public class App {
    /* mainメソッド */
    public static void main(String[] args) throws Exception {
        /* 変数 */
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
    }
}
