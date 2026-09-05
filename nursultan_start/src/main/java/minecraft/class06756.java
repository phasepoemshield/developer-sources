/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10666
 *  Nursultan.class10670
 *  com.mojang.serialization.DataResult
 */
package minecraft;

import Nursultan.class10666;
import Nursultan.class10670;
import com.mojang.serialization.DataResult;

public interface class06756<Value> {
    public static final class06756<Float> N = class06756.N(0.0f, 1.0f);
    public static final class06756<Float> y = class06756.N(0.0f, Float.POSITIVE_INFINITY);

    public Value y(Value var1);

    public static <Value> class06756<Value> N() {
        return new class10666();
    }

    public DataResult<Value> N(Value var1);

    public static class06756<Float> N(float f, float f2) {
        return new class10670(f, f2);
    }
}

