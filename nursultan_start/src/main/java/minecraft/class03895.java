/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03912;

interface class03895
extends class03877 {
    public class03877 u();

    public double N(class03875 var1, double var2);

    @Override
    default public void N(double[] dArray, class03912 class039122) {
        this.u().N(dArray, class039122);
        for (int i = 0; i < dArray.length; ++i) {
            dArray[i] = this.N(class039122.L(i), dArray[i]);
        }
    }

    @Override
    default public double N(class03875 class038752) {
        return this.N(class038752, this.u().N(class038752));
    }
}

