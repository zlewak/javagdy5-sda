package pl.structural.adapter;

import java.util.Arrays;
import java.util.List;

//implementacja naszego flash drivea usb
public class Usb implements UsbInterface {
    @Override
    public List<Picture> readPictureViaUsb() {
        return Arrays.asList(new Picture(1,"pierwsze z usb"), new Picture(2, "drugie z usb"));
    }
}
