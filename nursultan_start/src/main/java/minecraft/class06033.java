/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01108
 *  minecraft.class01362
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class04782
 *  minecraft.class07209
 *  minecraft.class07746
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01108;
import minecraft.class01362;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07746;

public class class06033
extends class07746
implements class02674 {
    public static final MapCodec<class06033> M = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class01108::i), (App)class00500.N.fieldOf("base_state").forGetter(class060332 -> class060332.R), (App)class06033.t()).apply(instance, class06033::new));
    private final class02774 Z;

    public class02774 i() {
        return this.Z;
    }

    public class06033(class02774 class027742, class00500 class005002, class01362 class013622) {
        super(class005002, class013622);
        this.Z = class027742;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.a_(class005002, class047822, class072092, class060692);
    }

    public MapCodec<class06033> N() {
        return M;
    }

    protected boolean e_(class00500 class005002) {
        return class02674.L((class00891)class005002.i()).isPresent();
    }
}

