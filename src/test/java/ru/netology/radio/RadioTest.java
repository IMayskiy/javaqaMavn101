package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation1() {
        Radio tun = new Radio();
        tun.setStation(9);
        tun.nextStation();
        int expected = 0;
        int actual = tun.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio tun = new Radio();
        tun.setStation(0);
        tun.nextStation();
        int expected = 1;
        int actual = tun.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio tun = new Radio();
        tun.setStation(9);
        tun.prevStation();
        int expected = 8;
        int actual = tun.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio tun = new Radio();
        tun.setStation(0);
        tun.prevStation();
        int expected = 9;
        int actual = tun.getStation();
        Assertions.assertEquals(expected, actual);
    }

    //
    @Test
    public void increaseVolume1() {
        Radio tun = new Radio();
        tun.setVolume(0);
        tun.increaseVolume();
        int expected = 1;
        int actual = tun.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio tun = new Radio();
        tun.setVolume(100);
        tun.increaseVolume();
        int expected = 100;
        int actual = tun.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio tun = new Radio();
        tun.setVolume(100);
        tun.decreaseVolume();
        int expected = 99;
        int actual = tun.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        Radio tun = new Radio();
        tun.setVolume(0);
        tun.decreaseVolume();
        int expected = 0;
        int actual = tun.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}
