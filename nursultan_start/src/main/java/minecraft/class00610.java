/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02566
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class02566;
import minecraft.class04995;

public interface class00610<T> {
    public static class00610<Integer> L() {
        return class02566::N;
    }

    public T apply(float var1, T var2, T var3);

    public static <T> class00610<T> y(float f) {
        return (f2, object, object2) -> f2 >= f ? object2 : object;
    }

    public static <T> class00610<T> y() {
        return (f, object, object2) -> object;
    }

    public static class00610<Float> N() {
        return class04995::B;
    }

    public static class00610<Float> N(float f) {
        return (f2, f3, f4) -> {
            float f5 = class04995.R((float)(f4.floatValue() - f3.floatValue()));
            if (Math.abs(f5) >= f) {
                return f4;
            }
            return Float.valueOf(f3.floatValue() + f2 * f5);
        };
    }
}

