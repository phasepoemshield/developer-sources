/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class02674
 *  minecraft.class02774
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class08059
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class02674;
import minecraft.class02774;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class08059;
import minecraft.class08092;

public class class03116
extends class07196
implements class02674 {
    public static final MapCodec<class03116> M = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01960.N.fieldOf("block_set_type").forGetter(class07196::y), (App)class02774.field_46493.fieldOf("weathering_state").forGetter(class03116::i), (App)class03116.t()).apply(instance, class03116::new));
    private final class02774 Z;

    public class02774 i() {
        return this.Z;
    }

    public class03116(class01960 class019602, class02774 class027742, class01362 class013622) {
        super(class019602, class013622);
        this.Z = class027742;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class005002.L((class08092)class07196.L) == class08059.field_12607) {
            this.a_(class005002, class047822, class072092, class060692);
        }
    }

    public MapCodec<class03116> N() {
        return M;
    }

    protected boolean e_(class00500 class005002) {
        return class02674.L((class00891)class005002.i()).isPresent();
    }
}

