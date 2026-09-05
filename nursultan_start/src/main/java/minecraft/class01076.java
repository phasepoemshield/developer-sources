/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00734
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00734;
import minecraft.class01296;
import minecraft.class07209;
import minecraft.class07376;

public class class01076 {
    public static final Codec<class01076> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("centerX").orElse((Object)0).forGetter(class010762 -> class010762.y), (App)Codec.INT.fieldOf("centerZ").orElse((Object)0).forGetter(class010762 -> class010762.L), (App)Codec.INT.fieldOf("radius").orElse((Object)0).forGetter(class010762 -> class010762.u), (App)Codec.INT.fieldOf("height").orElse((Object)0).forGetter(class010762 -> class010762.i), (App)Codec.BOOL.fieldOf("guarded").orElse((Object)false).forGetter(class010762 -> class010762.R)).apply(instance, class01076::new));
    private final int y;
    private final int L;
    private final int u;
    private final int i;
    private final boolean R;
    private final class00734 M;

    public int L() {
        return this.u;
    }

    public class01076(int n, int n2, int n3, int n4, boolean bl) {
        this.y = n;
        this.L = n2;
        this.u = n3;
        this.i = n4;
        this.R = bl;
        this.M = new class00734((double)(n - n3), (double)class07376.i, (double)(n2 - n3), (double)(n + n3), (double)class07376.u, (double)(n2 + n3));
    }

    public boolean i() {
        return this.R;
    }

    public int u() {
        return this.i;
    }

    public int y() {
        return this.L;
    }

    public boolean N(class07209 class072092) {
        return class01296.N((int)class072092.method_10263()) == class01296.N((int)this.y) && class01296.N((int)class072092.method_10260()) == class01296.N((int)this.L);
    }

    public int N() {
        return this.y;
    }

    public class00734 R() {
        return this.M;
    }
}

