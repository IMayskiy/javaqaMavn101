package ru.netology.radio;

public class Radio {
    private int quantityStation = 10;
    private int minStation = 0;
    private int maxStation = quantityStation - 1;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
        this.currentStation = minStation;
    }


    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            setCurrentVolume(currentVolume + 1);
        } else {
            currentVolume = maxVolume;
        }
    }
    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            setCurrentVolume(currentVolume - 1);
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

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
        this.currentVolume = newCurrentVolume;
    }


    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation (int newQuantityStation) {
        this.quantityStation = newQuantityStation;
    }
}
