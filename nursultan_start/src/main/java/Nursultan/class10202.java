/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03421
 *  minecraft.class03460
 *  minecraft.class03875
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class03421;
import minecraft.class03460;
import minecraft.class03875;
import org.jspecify.annotations.Nullable;

public class class10202
implements class03460 {
    final /* synthetic */ class03421 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10202(class03421 class034212) {
        this.N = class034212;
    }

    public @Nullable class00500 N(class03875 class038752, double d) {
        if (d > 0.0) {
            return null;
        }
        return this.N.computeFluid(class038752.y(), class038752.L(), class038752.u()).N(class038752.L());
    }

    public boolean N() {
        return false;
    }
}

