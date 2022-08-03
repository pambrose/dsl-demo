package org.athenian.java;

public class Main {

    //sampleStart
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress(new Address());
        person.getAddress().setStreet("1st St");
        person.getAddress().setNumber(23);
        person.getAddress().setCity("Tulsa");
        System.out.println(person);
    }
//sampleEnd
}