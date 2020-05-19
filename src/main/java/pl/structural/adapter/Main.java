package pl.structural.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //jak wykorzystac adapter

        //tworzymy nasz komputer
        Computer myComputer = new Computer();

        //jezeli mamy zdjecia na usb
        UsbInterface usb = new Usb();

        //podlaczamy usb
        myComputer.setUsbInterface(usb);

        //mozemy odczytac zdjecia
        List<Picture> pictures = myComputer.readPictures();
        System.out.println(pictures);

        //jezeli mamy zdjecia na karcie sd
        SdCardInterface sdCard = new SdCard();

        //niestety nie mozemy zrobic myComputer.setUsbInterface(sdCard) poniewaz karta sd nie jest kompatybilna
        //tworzymy adapter
        UsbInterface adapter = new SdCardAdapter(sdCard);

        //podlaczamy do komputera adapter
        myComputer.setUsbInterface(adapter);

        //odczytujemy zdjecia
        List<Picture> picturesFromSdCard = myComputer.readPictures();
        System.out.println(picturesFromSdCard);
    }
}
