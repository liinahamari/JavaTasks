package ThinkingInJava4thEd.h_Interfaces;

//p277
// Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface
// and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main(), create an object of your
// class and pass it to  each of the methods.

public class t_14 extends E1 implements D1{
    @Override
    public void a() {
        System.out.println("Ov.a()");
    }

    @Override
    public void b() {
        System.out.println("Ov.b()");
    }

    @Override
    public void c() {
        System.out.println("Ov.c()");
    }

    @Override
    public void d() {
        System.out.println("Ov.d()");
    }

    @Override
    public void e() {
        System.out.println("Ov.e()");
    }

    @Override
    public void f() {
        System.out.println("Ov.f()");
    }

    @Override
    public void g() {
        System.out.println("Ov.g()");
    }
    static void i(A1 a){
        System.out.println("A");
    }
    static void j(B1 b){
        System.out.println("B");
    }
    static void k(C1 c){
        System.out.println("C");
    }
    static void l(D1 d){
        System.out.println("D");
    }
    public static void main(String[] args) {
        t_14 t = new t_14();
        i(t);
        j(t);
        k(t);
        l(t);
    }
}

interface A1{
    void a();
    void b();
}
interface B1{
    void c();
    void d();
}
interface C1{
    void e();
    void f();
}
interface D1 extends A1, B1, C1{
    void g();
}

class E1{
    void h(){
        System.out.println("E1.h()");
    }
}