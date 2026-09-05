/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class01479
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00753;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class01479;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;

public class class02257
extends class01479 {
    public static final MapCodec<class02257> N = RecordCodecBuilder.mapCodec(instance -> class02257.y(instance).and(instance.group((App)class02142.N((int)1, (int)512).fieldOf("foliage_height").forGetter(class022572 -> class022572.y), (App)Codec.intRange((int)0, (int)256).fieldOf("leaf_placement_attempts").forGetter(class022572 -> class022572.R))).apply(instance, class02257::new));
    private final class02142 y;
    private final int R;

    public class02257(class02142 class021422, class02142 class021423, class02142 class021424, int n) {
        super(class021422, class021423);
        this.y = class021424;
        this.R = n;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        return false;
    }

    protected class01448<?> N() {
        return class01448.z;
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return this.y.N(class060692);
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        class07209 class072092 = class014672.N();
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i < this.R; ++i) {
            class072182.N((class00753)class072092, class060692.y(n3) - class060692.y(n3), class060692.y(n2) - class060692.y(n2), class060692.y(n3) - class060692.y(n3));
            class02257.N((class04887)class048872, (class01455)class014552, (class06069)class060692, (class01476)class014762, (class07209)class072182);
        }
    }
}

