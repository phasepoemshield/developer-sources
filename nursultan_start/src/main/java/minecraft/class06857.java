/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06857
extends AbstractDoubleList {
    private final int N;
    private double y;

    public class06857(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Need at least 1 part");
        }
        this.N = n;
        this.N(n, null);
    }

    public int size() {
        return this.N + 1;
    }

    public double getDouble(int n) {
        return (double)n * this.y;
    }

    public void N(int n, CallbackInfo callbackInfo) {
        this.y = 1.0 / (double)this.N;
    }
}

