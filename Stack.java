package stos;

public class Stack {

    private Pair head;

    public void put(double wartosc) {

        Pair item = head;
        head = new Pair(wartosc);
        head.next = item;
    }

    public double get() {

        double itemvalue = head.value;
        head = head.next;

        return itemvalue;
    }

    public static void main(String[] args) {

        Stack stos = new Stack();

        for (int i = 1; i < 10; i++) {
            stos.put(i);
            System.out.println("Dodano: " + (double)i);
        }

        double wartosc;
        for (int i = 1; i < 10; i++) {
            wartosc = stos.get();
            System.out.println("Zdjeto: " + wartosc);
        }

    }

    private class Pair {

        double value;
        Pair next;

        public Pair(double value) {
            this.value = value;
            this.next = null;
        }
    }
}
