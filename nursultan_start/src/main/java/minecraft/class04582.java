/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import minecraft.class04573;

class class04582
implements class04573<Float> {
    final /* synthetic */ Float2FloatFunction N;

    @Override
    public float L() {
        return Float.POSITIVE_INFINITY;
    }

    class04582(Float2FloatFunction float2FloatFunction) {
        this.N = float2FloatFunction;
    }

    @Override
    public float y() {
        return Float.NEGATIVE_INFINITY;
    }

    @Override
    public float N(Float f) {
        return ((Float)this.N.apply((Object)f)).floatValue();
    }
}

