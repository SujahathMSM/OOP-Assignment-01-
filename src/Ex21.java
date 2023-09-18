class A {
    int a;

    A (int a) {
        this.a = a;
    }

    void printValue() {
        System.out.println(a);
    }
}

public class Ex21 {
    public static void main(String[] args) {
        A a1 = new A(100);
        a1.printValue();
    }
}
