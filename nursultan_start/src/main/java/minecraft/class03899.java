/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03912;

interface class03899
extends class03877 {
    public double N(double var1);

    @Override
    default public double N(class03875 class038752) {
        return this.N(this.az_().N(class038752));
    }

    @Override
    default public void N(double[] dArray, class03912 class039122) {
        this.az_().N(dArray, class039122);
        for (int i = 0; i < dArray.length; ++i) {
            dArray[i] = this.N(dArray[i]);
        }
    }

    public class03877 az_();
}

