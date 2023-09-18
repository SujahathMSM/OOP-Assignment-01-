//--------------------Box.java------------------------
class Box {
    int length;
    int width;
    int height;

    Box(int l, int w, int h) {
        System.out.println("Parameterized constructor");
        length = l;
        width = w;
        height = h;
    }

    void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume : " + volume);
    }
}

// --------------------Ex9.java------------------------
class Ex9 {
    public static void main(String args[]) {
        Box1 b1 = new Box1(5, 4, 3);
        b1.printVolume();
        Box1 b2 = new Box1(12, 5, 3);
        b2.printVolume();
    }
}