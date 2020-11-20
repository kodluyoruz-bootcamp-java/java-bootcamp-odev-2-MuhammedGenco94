package com.classes;

import com.interfaces.Keyboard;
import com.interfaces.ScreenShare;
import com.interfaces.VideoCall;

public class Apple extends Phone implements VideoCall, ScreenShare {
    public Apple() {
    }

    public Apple(String name, String IMEINumber, String versionNumber, double ramCapacity, double screenSize, Keyboard keyboard) {
        super(name, IMEINumber, versionNumber, ramCapacity, screenSize, keyboard);
    }

    @Override
    public void shareYourScreen() {
        System.out.println("Screen sharing...");
    }

    @Override
    public void makeVideoCall() {
        System.out.println("Making video call...");
    }

    @Override
    public String getSpecifications() {
        if (!(this.getName() == null)) {
            return "***************************************\n" +
                    "Brand Name: " + this.getName() + "\n" +
                    "IMEI Number: " + this.getIMEINumber() + "\n" +
                    "Version Number: " + this.getVersionNumber() + "\n" +
                    "RAM Capacity: " + this.getRamCapacity() + " MB\n" +
                    "Screen Size: " + this.getScreenSize() + " Inch\n";
        }
        return "Apple Phone name has not been assigned !!";
    }
}
