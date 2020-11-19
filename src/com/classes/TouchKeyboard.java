package com.classes;

import com.interfaces.Keyboard;

public class TouchKeyboard implements Keyboard {
    @Override
    public void press() {
        System.out.println("Touch keyboard");
    }
}
