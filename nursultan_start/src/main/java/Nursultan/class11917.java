/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class04105
 *  minecraft.class07709
 *  minecraft.class07713
 */
package Nursultan;

import com.mojang.serialization.DynamicOps;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class04105;
import minecraft.class07709;
import minecraft.class07713;

public class class11917 {
    public static Object N_0;
    public static Object N_1;

    private class11917() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11917.i();
    }

    private static void i() {
        N_0 = null;
        N_1 = null;
    }

    public static class03519<class07709> y() {
        if ((class03519)N_1 == null) {
            N_1 = class11917.N().N((DynamicOps)class07713.N);
        }
        return (class03519)N_1;
    }

    public static class01929 N() {
        if ((class01929)N_0 == null) {
            N_0 = class04105.N();
        }
        return (class01929)N_0;
    }
}

