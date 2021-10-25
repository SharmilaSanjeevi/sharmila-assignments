package sketch;

class A {
    int x;

    A(int x) {
        this.x = x;
        System.out.println("Inside A");
    }

    int getX() {
        return x;
    }
}

class B extends A {
    B() {
        super(10);
        System.out.println("Inside B");
    }
}


public class Main {
    public static void main(String[] args) {

    B b = new B();
        System.out.println(b.getX());
    }
}
