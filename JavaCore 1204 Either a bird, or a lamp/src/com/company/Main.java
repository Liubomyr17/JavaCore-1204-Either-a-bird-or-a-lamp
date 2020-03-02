package com.company;

/*

1204 Either a bird, or a lamp
Write a method that determines which class object was passed to him and displays one of the inscriptions: Cat, Dog, Bird, Lamp.

Requirements:
1. The program should display the text on the screen.
2. The Cat class cannot be changed.
3. The Dog class cannot be changed.
4. The Bird class cannot be changed.
5. The Lamp class cannot be changed.
6. The printObjectType () method should display one of the labels, depending on the transferred object. For example, "Lamp" for objects of type Solution.Lamp.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat) {
            System.out.print("Кошка");
        } else if (o instanceof Dog) {
            System.out.print("Собака");
        } else if (o instanceof Bird) {
            System.out.print("Птица");
        } else if (o instanceof Lamp) {
            System.out.print("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}



