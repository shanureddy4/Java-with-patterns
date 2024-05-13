class A {
    void show(){
        System.out.println("Calling from A");
    }

    void display(){
        System.out.println("Display method in A");
    }
}

class B extends A {
    void show(){
        System.out.println("Calling from B");
    }

    void sampleDisplay (){
        System.out.println("sample display");
    }

}

public class DynamicMethodDispatching {


    public static void main(String[] args) {

        A b = new B();
        b.show(); // calling an overridden function.
        b.display();

        // b.sampleDisplay();
        var c = classReturn();
        c.display();

        M m = new N();
        m.show();

        N n = new N();
        n.display();
    }

    static A classReturn (){
        return new B();
    };

}

class M {
    static{
        System.out.println("static executed first");
    }
    void show(){
        System.out.println("show inside M ");
    }
}

class N extends M {
    void display(){
        System.out.println("display inside N");
    }
}