class Test {
    int a = 3;
    int b = 4;

    Test (int i, int j) {a = i; b=j;}

    Test() {

    }
}

public class Ex16 {
    public static void main(String[] args) {
        Test t1 = new Test(1, 2);
        System.out.println(t1.a +" " +t1.b+" ");
        Test t2 = new Test();
        System.out.println(t2.a +" " +t2.b+" ");
    }
}
