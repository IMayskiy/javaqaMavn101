package ru.netology.radio;

public class Radio {
    private int volume;
    private int station;//

    public int getVolume() {
        return volume;
    }

    public int getStation() {
        return station;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }

    public void setStation(int station) {
        this.station = station;
    }

    public void nextStation() {
        if (station == 9) {
            setStation(0);
        } else {
            station++;
        }
    }

    public void prevStation() {
        if (station == 0) {
            setStation(9);
        } else {
            station--;
        }
    }


}
