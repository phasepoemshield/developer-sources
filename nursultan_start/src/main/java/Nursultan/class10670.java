/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  minecraft.class04995
 *  minecraft.class06756
 */
package Nursultan;

import com.mojang.serialization.DataResult;
import minecraft.class04995;
import minecraft.class06756;

public class class10670
implements class06756<Float> {
    final /* synthetic */ float L;
    final /* synthetic */ float u;

    public class10670(float f, float f2) {
        this.L = f;
        this.u = f2;
    }

    public Float y(Float f) {
        if (f.floatValue() >= this.L && f.floatValue() <= this.u) {
            return f;
        }
        return Float.valueOf(class04995.N((float)f.floatValue(), (float)this.L, (float)this.u));
    }

    public DataResult<Float> N(Float f) {
        if (f.floatValue() >= this.L && f.floatValue() <= this.u) {
            return DataResult.success((Object)f);
        }
        return DataResult.error(() -> f + " is not in range [" + this.L + "; " + this.u + "]");
    }
}

