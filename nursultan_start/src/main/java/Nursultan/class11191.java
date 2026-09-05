/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11199;

public class class11191 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;

    private static void L() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
    }

    static {
        class11191.L();
        N_2 = new int[class11175.values().length];
        N_1 = new int[class11199.values().length];
        ((int[])class11191.N_2)[((Enum)class11199.NEAREST).ordinal()] = 1;
        ((int[])class11191.N_2)[((Enum)class11175.CLAMP_TO_BORDER).ordinal()] = 2;
        ((int[])class11191.N_2)[((Enum)class11175.REPEAT).ordinal()] = 3;
        ((int[])class11191.N_2)[((Enum)class11175.MIRRORED_REPEAT).ordinal()] = 4;
        ((int[])class11191.N_1)[((Enum)class11199.NEAREST).ordinal()] = 1;
        ((int[])class11191.N_1)[((Enum)class11199.LINEAR).ordinal()] = 2;
        ((int[])class11191.N_1)[((Enum)class11199.NEAREST_MIPMAP_NEAREST).ordinal()] = 3;
        ((int[])class11191.N_1)[((Enum)class11199.LINEAR_MIPMAP_NEAREST).ordinal()] = 4;
        ((int[])class11191.N_1)[((Enum)class11199.NEAREST_MIPMAP_LINEAR).ordinal()] = 5;
        ((int[])class11191.N_1)[((Enum)class11199.LINEAR_MIPMAP_LINEAR).ordinal()] = 6;
        N_0 = new int[class11181.values().length];
        ((int[])class11191.N_0)[((Enum)class11181.RGBA8).ordinal()] = 1;
        ((int[])class11191.N_0)[((Enum)class11181.RGB8).ordinal()] = 2;
        ((int[])class11191.N_0)[((Enum)class11181.RGB16F).ordinal()] = 3;
        ((int[])class11191.N_0)[((Enum)class11181.RG16F).ordinal()] = 4;
        ((int[])class11191.N_0)[((Enum)class11181.DEPTH32).ordinal()] = 5;
    }
}

