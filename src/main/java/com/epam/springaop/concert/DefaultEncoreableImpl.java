package com.epam.springaop.concert;

public class DefaultEncoreableImpl implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("And my heart is stopped astalavista... and my heart is frozen...");
    }

}
