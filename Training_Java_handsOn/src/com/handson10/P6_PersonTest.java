/**
 * Reads people from user, stores in ArrayList,
 * sorts by first name, and prints result.
 */

package com.handson10;
import java.util.*;
class Person implements Comparable<Person> {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Person p) {
        return this.firstName.compareTo(p.firstName);
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

public class P6_PersonTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String last = sc.next();
            list.add(new Person(first, last));
        }

        Collections.sort(list);

        System.out.println("Sorted people by first name:");
        for (Person p : list) {
            System.out.println(p);
        }
    }
}