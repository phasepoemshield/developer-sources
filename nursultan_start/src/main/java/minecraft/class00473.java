/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class07103
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class07103;
import minecraft.class07126;

public class class00473
implements class07126 {
    private final class07103<class00473> N;
    private final float y;

    private class00473(class07103<class00473> class071032, float f) {
        this.N = class071032;
        this.y = f;
    }

    public static class02362<? super ByteBuf, class00473> y(class07103<class00473> class071032) {
        return class02389.E.N_10(f -> new class00473(class071032, f.floatValue()), class004732 -> Float.valueOf(class004732.y));
    }

    public static MapCodec<class00473> N(class07103<class00473> class071032) {
        return Codec.FLOAT.xmap(f -> new class00473(class071032, f.floatValue()), class004732 -> Float.valueOf(class004732.y)).optionalFieldOf("power", (Object)class00473.N(class071032, 1.0f));
    }

    public static class00473 N(class07103<class00473> class071032, float f) {
        return new class00473(class071032, f);
    }

    public float N() {
        return this.y;
    }

    public class07103<class00473> method_10295() {
        return this.N;
    }
}

