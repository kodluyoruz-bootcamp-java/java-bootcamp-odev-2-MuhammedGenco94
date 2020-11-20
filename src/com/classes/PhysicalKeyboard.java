package com.classes;

import com.interfaces.Keyboard;

public class PhysicalKeyboard implements Keyboard {
    @Override
    public void press() {
        System.out.println("* Physical keyboard");
    }
}
