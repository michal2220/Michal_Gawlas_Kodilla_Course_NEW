package com.kodilla.patterns.library;

public class PrototypeLibrary<Z> implements Cloneable{

    @Override
    public Z clone() throws CloneNotSupportedException {
        return (Z) super.clone();
    }
}
