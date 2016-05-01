package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16.03.2016.
 */
public class Shop {
    List<MusiInstrument> instruments;

    public Shop(List<MusiInstrument> instruments) {
        this.instruments = instruments;
    }

    public Shop(MusiInstrument instrument) {
        this.instruments = new ArrayList<MusiInstrument>();
        this.instruments.add(instrument);
    }

    public Shop() {
        this.instruments = new ArrayList<MusiInstrument>();
    }

    public List<MusiInstrument> getInstruments() {
        return this.instruments;
    }

    public void setInstruments(List<MusiInstrument> instruments) {
        this.instruments = instruments;
    }

    public void addInstrument (MusiInstrument instrument){
        instruments.add(instrument);
    }

    public void print(){
        for(MusiInstrument instrument : this.getInstruments())
            System.out.println(instrument.getType().toString() + " " + instrument.hashCode());

    }
}
