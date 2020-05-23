package pl.structural.adapter;

import java.util.List;

//adapter musi implementowac interfejs usb - taki interfejs, ktorego oczekuje klient
public class SdCardAdapter implements UsbInterface{

    //miejsce na karte sd
    private SdCardInterface sdCard;

    public SdCardAdapter(SdCardInterface sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public List<Picture> readPictureViaUsb() {
        return sdCard.readPicturesFromSdCard();
    }
}
