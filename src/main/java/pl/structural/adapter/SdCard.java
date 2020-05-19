package pl.structural.adapter;

import java.util.Arrays;
import java.util.List;

//implementacja naszej karty sd
public class SdCard implements SdCardInterface {
    @Override
    public List<Picture> readPicturesFromSdCard() {
        return Arrays.asList(new Picture(1,"pierwsze z karty sd"), new Picture(2, "drugie z karty sd"));
    }
}
