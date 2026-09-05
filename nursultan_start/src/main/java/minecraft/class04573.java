/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 *  minecraft.class03208
 */
package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;
import minecraft.class03208;
import minecraft.class04582;

public interface class04573<C> {
    public static final class04573<Float> y = class04573.N(f -> f);

    public float L();

    public float y();

    public float N(C var1);

    default public <C2> class04573<C2> N(Function<C2, C> function) {
        class04573 class045732 = this;
        return new class03208(this, class045732, function);
    }

    public static class04573<Float> N(Float2FloatFunction float2FloatFunction) {
        return new class04582(float2FloatFunction);
    }
}

