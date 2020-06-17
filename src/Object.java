public class Object {
    // Javaではクラス内で宣言された変数をフィールドという
    String name;
    int value;

    // メソッド
    void printValue() {
        System.out.println(this.value);
    }

    void incValue() {
        this.value++;
    }
}