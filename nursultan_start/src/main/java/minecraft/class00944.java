/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class04782
 *  minecraft.class04873
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class04782;
import minecraft.class04873;
import minecraft.class06069;
import minecraft.class07209;

public class class00944
extends class04873
implements class02674 {
    public static final MapCodec<class00944> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02774.field_46493.fieldOf("weathering_state").forGetter(class00944::i), (App)class00944.t()).apply(instance, class00944::new));
    private final class02774 i;

    public class00944(class02774 class027742, class01362 class013622) {
        super(class013622);
        this.i = class027742;
    }

    public class02774 i() {
        return this.i;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.a_(class005002, class047822, class072092, class060692);
    }

    public MapCodec<class00944> N() {
        return N;
    }

    protected boolean e_(class00500 class005002) {
        return class02674.L((class00891)class005002.i()).isPresent();
    }
}

