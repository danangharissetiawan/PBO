package com.risset;

class Encyclopedia extends Print {
    private int Volume;
    private int Edition;



    public int getVolume() {
        return Volume;
    }

    public void setVolume(int VolumeNum) {
        this.Volume = VolumeNum;
    }

    public int getEdition() {
        return Edition;
    }

    public void setEdition(int EditionNum) {
        this.Edition = EditionNum;
    }
}
