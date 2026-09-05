/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00873
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08564
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00873;
import minecraft.class01362;
import minecraft.class04091;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08564;

public class class04098
extends class08564
implements class00873 {
    public static final MapCodec<class04098> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.N((float)0.0f, (float)1.0f).fieldOf("leaf_particle_chance").forGetter(class040982 -> Float.valueOf(class040982.M)), (App)class04098.t()).apply(instance, class04098::new));

    public class04098(float f, class01362 class013622) {
        super(f, class013622);
    }

    public class07209 N(class07209 class072092) {
        return class072092.method_10074();
    }

    public MapCodec<class04098> N() {
        return y;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8652(class072092.method_10074(), class04091.L(), 2);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10074()).P();
    }
}

