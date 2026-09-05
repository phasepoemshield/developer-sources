/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09251
 *  Nursultan.class11318
 *  Nursultan.class11794
 */
package Nursultan;

import Nursultan.class09251;
import Nursultan.class11318;
import Nursultan.class11794;

public class class11285 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    static {
        class11285.N();
        N_2 = new int[class11318.values().length];
        N_1 = new int[class11794.values().length];
        ((int[])class11285.N_2)[((Enum)class09251.LIST_RESPONSE).ordinal()] = 1;
        ((int[])class11285.N_2)[((Enum)class11318.CREATE).ordinal()] = 2;
        ((int[])class11285.N_2)[((Enum)class11318.DELETE).ordinal()] = 3;
        ((int[])class11285.N_2)[((Enum)class11318.REFRESH).ordinal()] = 4;
        N_0 = new int[class09251.values().length];
        ((int[])class11285.N_1)[((Enum)class09251.LIST_RESPONSE).ordinal()] = 1;
        ((int[])class11285.N_1)[((Enum)class11794.UPDATED).ordinal()] = 2;
        ((int[])class11285.N_1)[((Enum)class11794.ALREADY_ACTIVATED).ordinal()] = 3;
        ((int[])class11285.N_1)[((Enum)class11794.OWN_LINK).ordinal()] = 4;
        ((int[])class11285.N_0)[((Enum)class09251.LIST_RESPONSE).ordinal()] = 1;
        ((int[])class11285.N_0)[((Enum)class09251.CREATE_RESPONSE).ordinal()] = 2;
        ((int[])class11285.N_0)[((Enum)class09251.DELETE_RESPONSE).ordinal()] = 3;
        ((int[])class11285.N_0)[((Enum)class09251.NACK).ordinal()] = 4;
        ((int[])class11285.N_0)[((Enum)class09251.ACTIVATE_RESPONSE).ordinal()] = 5;
        ((int[])class11285.N_0)[((Enum)class09251.REFRESH_RESPONSE).ordinal()] = 6;
    }

    private static void N() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }
}

