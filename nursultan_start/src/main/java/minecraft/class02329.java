/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02566
 *  minecraft.class06338
 *  minecraft.class07103
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02566;
import minecraft.class06338;
import minecraft.class07103;
import minecraft.class07126;

public class class02329
implements class07126 {
    private final class07103<class02329> N;
    private final int y;

    public float L() {
        return (float)class02566.i((int)this.y) / 255.0f;
    }

    private class02329(class07103<class02329> class071032, int n) {
        this.N = class071032;
        this.y = n;
    }

    public float u() {
        return (float)class02566.y((int)this.y) / 255.0f;
    }

    public float y() {
        return (float)class02566.u((int)this.y) / 255.0f;
    }

    public static class02362<? super ByteBuf, class02329> y(class07103<class02329> class071032) {
        return class02389.M.N_10(n -> new class02329(class071032, (int)n), class023292 -> class023292.y);
    }

    public static MapCodec<class02329> N(class07103<class02329> class071032) {
        return class06338.W.xmap(n -> new class02329(class071032, (int)n), class023292 -> class023292.y).fieldOf("color");
    }

    public float N() {
        return (float)class02566.L((int)this.y) / 255.0f;
    }

    public static class02329 N(class07103<class02329> class071032, int n) {
        return new class02329(class071032, n);
    }

    public static class02329 N(class07103<class02329> class071032, float f, float f2, float f3) {
        return class02329.N(class071032, class02566.N((float)1.0f, (float)f, (float)f2, (float)f3));
    }

    public class07103<class02329> method_10295() {
        return this.N;
    }
}

