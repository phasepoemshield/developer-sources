/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00494
 *  minecraft.class04995
 *  minecraft.class06857
 *  minecraft.class07185
 *  minecraft.class07739
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00494;
import minecraft.class04995;
import minecraft.class06857;
import minecraft.class07185;
import minecraft.class07739;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class07017
extends class00494 {
    private static final class07185[] N = class07185.values();
    private DoubleList[] y;

    public DoubleList method_1109(class07185 class071852) {
        return this.y[class071852.ordinal()];
    }

    public class07017(class07739 class077392) {
        super(class077392);
        this.N(class077392, null);
    }

    private void N(class07739 class077392, CallbackInfo callbackInfo) {
        this.y = new DoubleList[N.length];
        for (class07185 class071852 : N) {
            this.y[class071852.ordinal()] = new class06857(class077392.method_1051(class071852));
        }
    }

    public int method_1100(class07185 class071852, double d) {
        int n = this.field_1401.method_1051(class071852);
        return class04995.N((double)class04995.N((double)(d * (double)n), (double)-1.0, (double)n));
    }
}

