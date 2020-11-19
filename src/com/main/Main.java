package com.main;

import com.classes.Apple;
import com.classes.PhysicalKeyboard;
import com.classes.Samsung;
import com.classes.TouchKeyboard;
import com.interfaces.Keyboard;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Iphone-X", "123N", "3.1.0.1", 6000, 13, new TouchKeyboard());
        System.out.println(apple.getSpecifications());
        apple.makeCall();
        apple.sendSMS();
        apple.makeVideoCall();
        apple.shareYourScreen();
        apple.getKeyboard().press();

        System.out.println("\n");

        Samsung samsung = new Samsung("Samsung S9 Plus", "1234ert", "3.6", 8, 8, new PhysicalKeyboard());
        System.out.println(samsung.getSpecifications());
        apple.makeCall();
        apple.sendSMS();
        samsung.sendOverBluetooth();
        samsung.listenMusic();
        samsung.getKeyboard().press();
    }
}
