/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class00619;

public record class00598<Value>() implements class00619<Value, Value>
{
    static final class00598<?> i = new class00598();

    @Override
    public Value apply(Value Value, Value Value2) {
        return Value2;
    }

    @Override
    public Codec<Value> argumentCodec(class00607<Value> class006072) {
        return class006072.L();
    }

    @Override
    public class00610<Value> argumentKeyframeLerp(class00607<Value> class006072) {
        return class006072.N().u();
    }
}

