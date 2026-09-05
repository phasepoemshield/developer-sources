/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03877
 *  minecraft.class03881
 *  minecraft.class03885
 *  minecraft.class03897
 *  minecraft.class04084
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03885;
import minecraft.class03897;
import minecraft.class04084;

public class class10303
implements class03881 {
    private final Map<class03877, class03877> N = new HashMap<class03877, class03877>();

    public class10303(class04084 class040842) {
    }

    public class03877 apply(class03877 class038772) {
        return this.N.computeIfAbsent(class038772, this::N);
    }

    private class03877 N(class03877 class038772) {
        if (class038772 instanceof class03885) {
            class03885 class038852 = (class03885)class038772;
            return (class03877)class038852.u().N();
        }
        if (class038772 instanceof class03897) {
            class03897 class038972 = (class03897)class038772;
            return class038972.u();
        }
        return class038772;
    }
}

