package pl.structural.adapter;

import java.util.List;

//definicja naszego interfejsu usb
public interface UsbInterface {
    List<Picture> readPictureViaUsb();
}
