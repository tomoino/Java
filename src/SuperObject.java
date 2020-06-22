public class SuperObject extends Object{
    private int superValue;

    SuperObject () {
        super(); // 親クラスのコンストラクタ。書いてなければ自動で追加される。
        System.out.println("superObjectの生成");
    }

    public int getSuperValue() {
        return this.superValue;
    }

    public void setSuperValue(int superValue) {
        this.superValue = superValue;
    }

    //　オーバーライド
    public void incValue() {
        // 親のメソッドの呼び出し
        super.incValue();
        super.incValue();
    }
}