public class Object {
    // Javaではクラス内で宣言された変数をフィールドという
    private String name;
    private int value;
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
    public void printValue() {
        System.out.println(this.value);
    }

    public void incValue() {
        this.value++;
    }

    // 静的メソッド：静的メソッド内では静的メンバしか使えない。
    public static void printObjectNum() {
        System.out.println(Object.objectNum);
    }

    // getter / setter
    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}