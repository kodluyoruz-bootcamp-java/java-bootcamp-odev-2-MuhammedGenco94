package com.classes;

import com.interfaces.Keyboard;

public abstract class Phone implements PhoneBehaviour {
    private String name;
    private String IMEINumber;
    private String versionNumber;
    private int ramCapacity;
    private int screenSize;
    private Keyboard keyboard;

    public Phone(String name, String IMEINumber, String versionNumber, int ramCapacity, int screenSize, Keyboard keyboard) {
        this.name = name;
        this.IMEINumber = IMEINumber;
        this.versionNumber = versionNumber;
        this.ramCapacity = ramCapacity;
        this.screenSize = screenSize;
        this.keyboard = keyboard;
    }

    protected Phone() {
    }

    @Override
    public String makeCall() {
        return "Call has been made.";
    }

    @Override
    public String sendSMS() {
        return "SMS has been send.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIMEINumber() {
        return IMEINumber;
    }

    public void setIMEINumber(String IMEINumber) {
        this.IMEINumber = IMEINumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public abstract String getSpecifications();

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

}
