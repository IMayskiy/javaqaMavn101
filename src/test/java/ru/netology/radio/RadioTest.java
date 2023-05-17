package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setQuantityStation1() {
        Radio tun = new Radio(20);
        tun.setCurrentStation(15);
        int expected = 15;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setQuantityStation2() {
        Radio tun = new Radio(20);
        tun.setCurrentStation(0);
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation1() {
        Radio tun = new Radio();
        tun.setCurrentStation(8);
        int expected = 8;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation2() {
        Radio tun = new Radio();
        tun.setCurrentStation(10);
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation3() {
        Radio tun = new Radio();
        tun.setCurrentStation(5);
        tun.setCurrentStation(0);
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation4() {
        Radio tun = new Radio();
        tun.setCurrentStation(-4);
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio tun = new Radio();
        tun.setCurrentStation(9);
        tun.nextStation();
        int expected = 0;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio tun = new Radio();
        tun.setCurrentStation(0);
        tun.nextStation();
        int expected = 1;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio tun = new Radio();
        tun.setCurrentStation(9);
        tun.prevStation();
        int expected = 8;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio tun = new Radio();
        tun.setCurrentStation(0);
        tun.prevStation();
        int expected = 9;
        int actual = tun.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //
    @Test
    public void increaseVolume1() {
        Radio tun = new Radio();
        tun.setCurrentVolume(0);
        tun.increaseVolume();
        int expected = 1;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio tun = new Radio();
        tun.setCurrentVolume(100);
        tun.increaseVolume();
        int expected = 100;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume3() {
        Radio tun = new Radio();
        tun.setCurrentVolume(101);
        tun.increaseVolume();
        int expected = 100;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio tun = new Radio();
        tun.setCurrentVolume(100);
        tun.decreaseVolume();
        int expected = 99;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        Radio tun = new Radio();
        tun.setCurrentVolume(0);
        tun.decreaseVolume();
        int expected = 0;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume3() {
        Radio tun = new Radio();
        tun.setCurrentVolume(-1);
        tun.decreaseVolume();
        int expected = 0;
        int actual = tun.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}