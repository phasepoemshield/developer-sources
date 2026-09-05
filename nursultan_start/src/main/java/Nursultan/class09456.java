/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01283
 */
package Nursultan;

import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class01283;

public class class09456
implements class01283 {
    final /* synthetic */ UnaryOperator M;
    final /* synthetic */ boolean B;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09456(UnaryOperator unaryOperator, boolean bl) {
        this.M = unaryOperator;
        this.B = bl;
    }

    public class00392 method_45282(class00392 class003922) {
        return (class00392)this.M.apply(class003922);
    }

    public boolean method_45279() {
        return this.B;
    }
}

