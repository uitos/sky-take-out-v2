package com.sky.utils;

import org.apache.commons.lang3.RandomUtils;

public class RandomCode {

    public static String  getRandomCode(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int anInt = RandomUtils.nextInt(0, 9);
            stringBuilder.append(anInt);
        }
        return stringBuilder.toString();
    }
}
