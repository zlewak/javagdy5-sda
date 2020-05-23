package pl.structural.adapter;

import java.util.List;

//nasz komputer przyjmuje tylko interfejs usb
public class Computer {

    //tutaj siedzi nasze gniazdo usb
    //Tutaj definicja przez podanie jakiego oczekuje interfejsu - anie jakiej konkretnie klasy
    private UsbInterface usbInterface;

    //tak wyglada metoda ktora wyciaga zdjecia
    //seter umozliwiajacy podlaczenie czegos do usb
    public void setUsbInterface(UsbInterface usbInterface) {
        this.usbInterface = usbInterface;
    }

    public List<Picture> readPictures(){
        return usbInterface.readPictureViaUsb();
    };

}
