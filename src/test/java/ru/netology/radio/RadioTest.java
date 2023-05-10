package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio tun = new Radio();

    @Test
    public void quantityStation() {
        Radio tun = new Radio(20);
        Assertions.assertEquals(20, tun.getQuantityStation());
    }

    @Test
    public void nextStation1() {
        tun.setCurrentStation(9);
        tun.nextStation();
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        tun.setCurrentStation(0);
        tun.nextStation();
        int expected = 1;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        tun.setCurrentStation(9);
        tun.prevStation();
        int expected = 8;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        tun.setCurrentStation(0);
        tun.prevStation();
        int expected = 9;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //
    @Test
    public void increaseVolume1() {
        tun.setCurrentVolume(0);
        tun.increaseVolume();
        int expected = 1;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        tun.setCurrentVolume(100);
        tun.increaseVolume();
        int expected = 100;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume3() {
        tun.setCurrentVolume(101);
        tun.increaseVolume();
        int expected = 1;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        tun.setCurrentVolume(100);
        tun.decreaseVolume();
        int expected = 99;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        tun.setCurrentVolume(0);
        tun.decreaseVolume();
        int expected = 0;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume3() {
        tun.setCurrentVolume(-1);
        tun.decreaseVolume();
        int expected = 0;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
