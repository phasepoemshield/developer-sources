/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09259
 */
package Nursultan;

import Nursultan.class09259;
import Nursultan.class11301;

public class class11294 {
    public static Object N_0;
    public static Object N_1;

    private static void L() {
        N_0 = null;
        N_1 = null;
    }

    static {
        class11294.L();
        N_1 = new int[class11301.values().length];
        N_0 = new int[class09259.values().length];
        ((int[])class11294.N_1)[((Enum)class11301.LIST).ordinal()] = 1;
        ((int[])class11294.N_1)[((Enum)class11301.PULL).ordinal()] = 2;
        ((int[])class11294.N_1)[((Enum)class11301.PUSH).ordinal()] = 3;
        ((int[])class11294.N_0)[((Enum)class09259.LIST_RESPONSE).ordinal()] = 1;
        ((int[])class11294.N_0)[((Enum)class09259.BLOB).ordinal()] = 2;
        ((int[])class11294.N_0)[((Enum)class09259.ACK).ordinal()] = 3;
        ((int[])class11294.N_0)[((Enum)class09259.NACK).ordinal()] = 4;
    }
}

