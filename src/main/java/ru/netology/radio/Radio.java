package ru.netology.radio;

public class Radio {
    private int quantityStation = 10;
    private int minStation = 0;
    private int maxStation = quantityStation - 1;
    private int currentStation = minStation;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.currentStation = minStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //public int getMaxStation() {
    //return maxStation;
    //}

    //public int getMinStation() {
    //return minStation;
    //}

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            currentStation--;
        }
    }


    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    //private int volume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }


}
