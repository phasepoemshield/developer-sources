/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class05073 {
    public static final Codec<class05073> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("cold").forGetter(class050732 -> class050732.y), (App)Codec.FLOAT.fieldOf("mossiness").forGetter(class050732 -> Float.valueOf(class050732.L)), (App)Codec.BOOL.fieldOf("air_pocket").forGetter(class050732 -> class050732.u), (App)Codec.BOOL.fieldOf("overgrown").forGetter(class050732 -> class050732.i), (App)Codec.BOOL.fieldOf("vines").forGetter(class050732 -> class050732.R), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(class050732 -> class050732.M)).apply(instance, class05073::new));
    public boolean y;
    public float L;
    public boolean u;
    public boolean i;
    public boolean R;
    public boolean M;

    public class05073() {
    }

    public class05073(boolean bl, float f, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.y = bl;
        this.L = f;
        this.u = bl2;
        this.i = bl3;
        this.R = bl4;
        this.M = bl5;
    }
}

