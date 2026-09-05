/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02566
 *  minecraft.class06338
 *  minecraft.class07103
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02566;
import minecraft.class06338;
import minecraft.class07103;
import minecraft.class07126;

public class class00436
implements class07126 {
    private final class07103<class00436> N;
    private final int y;
    private final float L;

    public float L() {
        return (float)class02566.i((int)this.y) / 255.0f;
    }

    private class00436(class07103<class00436> class071032, int n, float f) {
        this.N = class071032;
        this.y = n;
        this.L = f;
    }

    public float u() {
        return this.L;
    }

    public static class02362<? super ByteBuf, class00436> y(class07103<class00436> class071032) {
        return class02362.N((class02362)class02389.M, class004362 -> class004362.y, (class02362)class02389.E, class004362 -> Float.valueOf(class004362.L), (n, f) -> new class00436(class071032, (int)n, f.floatValue()));
    }

    public float y() {
        return (float)class02566.u((int)this.y) / 255.0f;
    }

    public static MapCodec<class00436> N(class07103<class00436> class071032) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.E.optionalFieldOf("color", (Object)-1).forGetter(class004362 -> class004362.y), (App)Codec.FLOAT.optionalFieldOf("power", (Object)Float.valueOf(1.0f)).forGetter(class004362 -> Float.valueOf(class004362.L))).apply((Applicative)instance, (n, f) -> new class00436(class071032, (int)n, f.floatValue())));
    }

    public float N() {
        return (float)class02566.L((int)this.y) / 255.0f;
    }

    public static class00436 N(class07103<class00436> class071032, int n, float f) {
        return new class00436(class071032, n, f);
    }

    public static class00436 N(class07103<class00436> class071032, float f, float f2, float f3, float f4) {
        return class00436.N(class071032, class02566.N((float)1.0f, (float)f, (float)f2, (float)f3), f4);
    }

    public class07103<class00436> method_10295() {
        return this.N;
    }
}

