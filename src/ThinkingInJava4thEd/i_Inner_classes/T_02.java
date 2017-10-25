package ThinkingInJava4thEd.i_Inner_classes;

//p292
// Create a class that holds a String, and has a toString() method that displays this String. Add several instances of your new class to a  Sequence3 ojbect, then display them.

public class T_02 {
}

class Word {
    private String word;

    public Word(String s) {
        word = s;
    }

    public String toString() {
        return word;
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector3 {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector3 selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Word3 w1 = new Word3("Word3");
        Word3 w2 = new Word3("Sentence");
        Word3 w3 = new Word3("Book");
        Sequence3 message = new Sequence3(3);
        message.add(w1);
        message.add(w2);
        message.add(w3);
        Selector3 sel = message.selector();
        while (!sel.end()) {
            System.out.print(sel.current() + " ");
            sel.next();
        }
    }
}