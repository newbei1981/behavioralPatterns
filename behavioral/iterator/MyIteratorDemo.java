package com.newbie.behavioral.iterator;

public class MyIteratorDemo {
    public static void main(String[] args) {
        String[] cities = {"Kiev", "Dnepr", "Kharkiv", "Lviv","Odessa"};

        Cities ukraineCities = new Cities("Ukraine", cities);

        Iterator iterator = ukraineCities.getIterator();
        System.out.println("Cities of " + ukraineCities.getCountryName() + " are :");
            while (iterator.hasNext()){
                System.out.println(iterator.next().toString());
            }
    }
}
