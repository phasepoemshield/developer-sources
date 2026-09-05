/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03912;

public interface class03908
extends class03877 {
    @Override
    default public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }

    @Override
    default public class03877 N(class03881 class038812) {
        return class038812.apply(this);
    }
}

