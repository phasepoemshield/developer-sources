/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04206
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04206;
import minecraft.class07376;

public class class01627 {
    public static final Codec<class01627> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)class07376.L).fieldOf("height").forGetter(class01627::N), (App)class04206.i.T().fieldOf("block").orElse((Object)class00869.N).forGetter(class016272 -> class016272.y().i())).apply(instance, class01627::new));
    private final class00891 y;
    private final int L;

    public class01627(int n, class00891 class008912) {
        this.L = n;
        this.y = class008912;
    }

    public String toString() {
        return (String)(this.L != 1 ? this.L + "*" : "") + String.valueOf(class04206.i.y((Object)this.y));
    }

    public class00500 y() {
        return this.y.W();
    }

    public class01627 N(int n) {
        if (this.L > n) {
            return new class01627(n, this.y);
        }
        return this;
    }

    public int N() {
        return this.L;
    }
}

