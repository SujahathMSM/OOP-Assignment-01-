class Box{
    int length;
    int height;
    int width;

    Box () {
        System.out.println("Default Constructor");
        length = 2;
        height = 2;
        width = 2;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        System.out.println("Length: " + b1.length);
        System.out.println("height: " + b1.height);
        System.out.println("width: " + b1.width);
    }
}
