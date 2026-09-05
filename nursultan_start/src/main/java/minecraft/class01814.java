/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01473
 *  minecraft.class01838
 *  minecraft.class05056
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class01473;
import minecraft.class01838;
import minecraft.class05056;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07536;

public class class01814
extends class01838 {
    public static final MapCodec<class01814> y = RecordCodecBuilder.mapCodec(instance -> class01814.N(instance).and(instance.group((App)Codec.floatRange((float)-1.0f, (float)1.0f).fieldOf("threshold").forGetter(class018142 -> Float.valueOf(class018142.M)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("high_chance").forGetter(class018142 -> Float.valueOf(class018142.B)), (App)class00500.N.fieldOf("default_state").forGetter(class018142 -> class018142.Z), (App)class06338.y((Codec)class00500.N.listOf()).fieldOf("low_states").forGetter(class018142 -> class018142.z), (App)class06338.y((Codec)class00500.N.listOf()).fieldOf("high_states").forGetter(class018142 -> class018142.U))).apply(instance, class01814::new));
    private final float M;
    private final float B;
    private final class00500 Z;
    private final List<class00500> z;
    private final List<class00500> U;

    public class01814(long l, class05056 class050562, float f, float f2, float f3, class00500 class005002, List<class00500> list, List<class00500> list2) {
        super(l, class050562, f);
        this.M = f2;
        this.B = f3;
        this.Z = class005002;
        this.z = list;
        this.U = list2;
    }

    protected class01473<?> N() {
        return class01473.L;
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        if (this.N(class072092, this.i) < (double)this.M) {
            return (class00500)class07536.N_77(this.z, (class06069)class060692);
        }
        if (class060692.z() < this.B) {
            return (class00500)class07536.N_77(this.U, (class06069)class060692);
        }
        return this.Z;
    }
}

