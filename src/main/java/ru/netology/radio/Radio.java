package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int maxStation;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int quantityStation) {
        maxStation = quantityStation - 1;
    }


    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
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

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        this.currentVolume = newCurrentVolume;
    }

}
