/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class01479
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class01479;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class07209;

public class class01978
extends class01479 {
    public static final MapCodec<class01978> N = RecordCodecBuilder.mapCodec(instance -> class01978.y(instance).and(instance.group((App)class02142.N((int)4, (int)16).fieldOf("height").forGetter(class019782 -> class019782.y), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("wide_bottom_layer_hole_chance").forGetter(class019782 -> Float.valueOf(class019782.R)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("corner_hole_chance").forGetter(class019782 -> Float.valueOf(class019782.R)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("hanging_leaves_chance").forGetter(class019782 -> Float.valueOf(class019782.B)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("hanging_leaves_extension_chance").forGetter(class019782 -> Float.valueOf(class019782.Z)))).apply(instance, class01978::new));
    private final class02142 y;
    private final float R;
    private final float M;
    private final float B;
    private final float Z;

    public class01978(class02142 class021422, class02142 class021423, class02142 class021424, float f, float f2, float f3, float f4) {
        super(class021422, class021423);
        this.y = class021424;
        this.R = f;
        this.M = f2;
        this.B = f3;
        this.Z = f4;
    }

    protected class01448<?> N() {
        return class01448.U;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (n2 == -1 && (n == n4 || n3 == n4) && class060692.z() < this.R) {
            return true;
        }
        boolean bl2 = n == n4 && n3 == n4;
        if (n4 > 2) {
            return bl2 || n + n3 > n4 * 2 - 2 && class060692.z() < this.M;
        }
        return bl2 && class060692.z() < this.M;
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        boolean bl = class014672.L();
        class07209 class072092 = class014672.N().method_10086(n4);
        int n5 = n3 + class014672.y() - 1;
        this.N(class048872, class014552, class060692, class014762, class072092, n5 - 2, n2 - 3, bl);
        this.N(class048872, class014552, class060692, class014762, class072092, n5 - 1, n2 - 4, bl);
        for (int i = n2 - 5; i >= 0; --i) {
            this.N(class048872, class014552, class060692, class014762, class072092, n5, i, bl);
        }
        this.N(class048872, class014552, class060692, class014762, class072092, n5, -1, bl, this.B, this.Z);
        this.N(class048872, class014552, class060692, class014762, class072092, n5 - 1, -2, bl, this.B, this.Z);
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return this.y.N(class060692);
    }
}

