public class Object {
    // Javaではクラス内で宣言された変数をフィールドという
    String name;
    int value;
    // 静的メンバ：同じクラスからできたインスタンスで共有される
    // クラス名.静的メンバ名で呼び出せる Object.objectNum
    static int objectNum; 

    // コンストラクタ  
    Object(String name) {
        this.name = name;
    }
    // コンストラクタでもオーバーロードは可能
    Object() {
        this("default"); // 自分の他のコンストラクタを呼べる 
    }

    // メソッド
    void printValue() {
        System.out.println(this.value);
    }

    void incValue() {
        this.value++;
    }

    // 静的メソッド：静的メソッド内では静的メンバしか使えない。
    static void printObjectNum() {
        System.out.println(Object.objectNum);
    }
}