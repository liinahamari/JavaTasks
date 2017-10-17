package ThinkingInJava4thEd.f_Reusing_classes;

//p212
// Prove the previous sentence. (Even if you don't create a constructor for Cartoon(), the compiler will synthesize a default constructor for you
// that calls the base-class constructor.

public class t_03 extends Drawing {
    public static void main(String[] args) {
        t_03 t = new t_03();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}
