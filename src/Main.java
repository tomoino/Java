public class Main {
    public static void main(String[] args) {
        // インスタンスの生成
        Object obj = new Object("object1"); // objにはインスタンスobjのために確保されたメモリの先頭番地が入っている
        obj.incValue();
        obj.printValue(); 
    }
}