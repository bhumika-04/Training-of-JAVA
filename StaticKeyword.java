// static keyword — shared across all objects of a class

class Counter {

    static int count = 0; // shared by all objects

    Counter() {
        count++; // each new object increments count
    }

    static int getCount() {
        return count;
    }
}

class StaticKeyword {

    public static void main(String[] args) {

        System.out.println("Count before: " + Counter.getCount());

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Count after creating 3 objects: " + Counter.getCount());
    }
}
