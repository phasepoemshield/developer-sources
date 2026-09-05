/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09723
 *  Nursultan.class09940
 *  Nursultan.class09946
 *  Nursultan.class09960
 */
package ru.argentoz;

import Nursultan.class09723;
import Nursultan.class09940;
import Nursultan.class09946;
import Nursultan.class09960;

public class Main {
    public static void main(String[] stringArray) {
        class09723 class097232 = new class09723(class09940.RGBA8, 256, 256);
        byte[] byArray = new byte[256 * class097232.N().N()];
        class09946 class099462 = class097232.N(byArray, 16, 16);
        byte[] byArray2 = new byte[256 * class097232.N().N()];
        class097232.N(class099462, byArray2, 16, 16);
        class097232.W();
        System.out.println("Atlas: " + class097232.y() + "x" + class097232.L());
        System.out.println("Icon UV: " + class099462.R() + ", " + class099462.M() + " -> " + class099462.B() + ", " + class099462.Z());
        for (class09960 class099602 : class097232.z()) {
            System.out.println("Dirty: " + String.valueOf(class099602));
        }
    }
}

