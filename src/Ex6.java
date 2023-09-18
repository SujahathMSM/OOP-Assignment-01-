class Box1 {
    int length = 12;
    int width = 5;
    int height = 3;

    void printVolume() {
        int volume;
        volume = length*width*height;
        System.out.println("Volume: "+ volume);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        b1.printVolume();
        System.out.println("Length: "+ b1.length);
        System.out.println("Width: "+ b1.width);
        System.out.println("Height: "+ b1.height);
    }
}
