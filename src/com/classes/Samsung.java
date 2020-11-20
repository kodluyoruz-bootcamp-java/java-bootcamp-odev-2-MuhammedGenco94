package com.classes;

import com.interfaces.Keyboard;
import com.interfaces.MP3Play;
import com.interfaces.FileShare;

public class Samsung extends Phone implements FileShare, MP3Play {

    public Samsung() {
    }

    public Samsung(String name, String IMEINumber, String versionNumber, double ramCapacity, double screenSize, Keyboard keyboard) {
        super(name, IMEINumber, versionNumber, ramCapacity, screenSize, keyboard);
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
        return "Samsung Phone name has not been assigned !!";
    }

    boolean bluetoothIsOpen = false;

    @Override
    public void sendOverBluetooth() {
        if (!bluetoothIsOpen) {
            bluetoothIsOpen = true;
            System.out.println("Bluetooth has been opened !");
        }
        System.out.println("Sharing files...");
    }

    @Override
    public void listenMusic() {
        System.out.println("Opening MP3 to play music");
    }
}
