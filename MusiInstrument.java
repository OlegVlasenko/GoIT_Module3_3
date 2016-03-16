package com.company;


abstract public class MusiInstrument {
    private InstrumentsType type;

    public MusiInstrument(InstrumentsType type) {
        this.type = type;
    }

    public InstrumentsType getType(){
        return  this.type;
    }
}
