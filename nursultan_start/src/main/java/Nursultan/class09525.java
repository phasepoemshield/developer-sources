/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01837
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03912
 */
package Nursultan;

import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03912;

public class class09525
implements class03912 {
    final /* synthetic */ class01837 N;

    public class03875 L(int n) {
        this.N.W = (n + this.N.L) * this.N.z;
        ++this.N.T;
        this.N.P = 0;
        this.N.j = n;
        return this.N;
    }

    public class09525(class01837 class018372) {
        this.N = class018372;
    }

    public void N(double[] dArray, class03877 class038772) {
        for (int i = 0; i < this.N.y + 1; ++i) {
            this.N.W = (i + this.N.L) * this.N.z;
            ++this.N.T;
            this.N.P = 0;
            this.N.j = i;
            dArray[i] = class038772.N((class03875)this.N);
        }
    }
}

