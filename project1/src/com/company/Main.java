package com.company;

public class Main {

    public static void main(String[] args) {
	LiczbaHolder lh1 = new LiczbaHolder(12);
    LiczbaHolder lh2 = new LiczbaHolder(44);
        System.out.println(lh1.getA());
        lh1.setA(10);
        System.out.println(lh1.getA());
        ////////////////////////////////
        GenericHolder<Integer> gh1 = new GenericHolder(123);
        System.out.println(gh1.getA());
        //gh1.setA(new Car());
        System.out.println(gh1.getA());
        ////////////////////////////////
        ObjectHolder oh1 = new ObjectHolder(123);
        System.out.println(oh1.getA());
        oh1.setA(new Car());
        System.out.println((int)oh1.getA() + 1);

        /** Zadanie 1.1 - 1.2 */
        /*
        Compare MyComparator = new Compare();
        MyComparator.compareValues(1,1);
        MyComparator.compareValues(1.1d,2.2d);
        MyComparator.compareValues(1.0f,0.1f);
        MyComparator.compareValues((byte)1, (byte)2);
        MyComparator.compareValues("00001", "2");
        */
        /** Zadanie 1.3 */
        /*
        Compare MyComparator = new Compare();
        MyComparator.compareValues(new Car("BMW", 100.1d, 100, 100), new Car("AUDI", 100d, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 101, 100), new Car("AUDI", 100, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 100, 999), new Car("AUDI", 100, 101, 100));
        MyComparator.compareValues(new Car("BMW", 100.1f, 100, (byte)101), new Car("AUDI", 100.1f, 100, (byte)100));
         */

    }
}
