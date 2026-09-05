/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09277
 */
package Nursultan;

import Nursultan.class09277;
import Nursultan.class11296;
import Nursultan.class11298;

public class class11314 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private static void L() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }

    static {
        class11314.L();
        N_2 = new int[class11296.values().length];
        N_1 = new int[class11298.values().length];
        ((int[])class11314.N_2)[((Enum)class11298.CREATE).ordinal()] = 1;
        ((int[])class11314.N_2)[((Enum)class11296.DIRTY).ordinal()] = 2;
        ((int[])class11314.N_2)[((Enum)class11296.LOCAL).ordinal()] = 3;
        ((int[])class11314.N_2)[((Enum)class11296.DELETING).ordinal()] = 4;
        ((int[])class11314.N_1)[((Enum)class11298.CREATE).ordinal()] = 1;
        ((int[])class11314.N_1)[((Enum)class11298.UPDATE).ordinal()] = 2;
        ((int[])class11314.N_1)[((Enum)class11298.DELETE).ordinal()] = 3;
        ((int[])class11314.N_1)[((Enum)class11298.RENAME).ordinal()] = 4;
        ((int[])class11314.N_1)[((Enum)class11298.LOAD).ordinal()] = 5;
        N_0 = new int[class09277.values().length];
        ((int[])class11314.N_0)[((Enum)class09277.LIST_RESPONSE).ordinal()] = 1;
        ((int[])class11314.N_0)[((Enum)class09277.CREATE_RESPONSE).ordinal()] = 2;
        ((int[])class11314.N_0)[((Enum)class09277.UPDATE_RESPONSE).ordinal()] = 3;
        ((int[])class11314.N_0)[((Enum)class09277.GET_RESPONSE).ordinal()] = 4;
        ((int[])class11314.N_0)[((Enum)class09277.DELETE_RESPONSE).ordinal()] = 5;
        ((int[])class11314.N_0)[((Enum)class09277.RENAME_RESPONSE).ordinal()] = 6;
        ((int[])class11314.N_0)[((Enum)class09277.NACK).ordinal()] = 7;
    }
}

