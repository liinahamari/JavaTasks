package ThinkingInJava4thEd.b_Operators;

//p104
// Create a class called Dog containing two Strings: name and says.  In main(), create two dog objects
// with names "spot" (who says "Ruff!") and "scruffy" (who says "Wurf!").  Then display their names and
// what they say.

public class _05 {
    String name, says;

    public _05(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        _05 dog1 = new _05("Spot", "RrrRRrrrR");
        _05 dog2 = new _05("Scruffy", "woof");
        System.out.println(dog1.name + " says: " + dog1.says);
        System.out.println(dog2.name + " says: " + dog2.says);
    }
}
