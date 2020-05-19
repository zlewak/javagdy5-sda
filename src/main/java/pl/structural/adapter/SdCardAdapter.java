package pl.structural.adapter;

import java.util.List;

public class SdCardAdapter implements UsbInterface{

    private SdCardInterface sdCard;

    public SdCardAdapter(SdCardInterface sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public List<Picture> readPictureViaUsb() {
        return sdCard.readPicturesFromSdCard();
    }
}
