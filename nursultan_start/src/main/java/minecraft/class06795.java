/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07781
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06787;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07781;
import minecraft.class08092;
import minecraft.class08713;

public class class06795
extends class07781 {
    public static final MapCodec<class06795> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06787.N.forGetter(class067952 -> class067952.L), (App)class06795.t()).apply(instance, class06795::new));
    private final class00891 L;

    public class06795(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.L = class008912;
    }

    public MapCodec<class06795> N() {
        return y;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        this.N(class005002, (class07290)class054872, class087132, class060692, class072092);
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class06795.L((class00500)class005002, (class07290)class047822, (class07209)class072092)) {
            class047822.method_8652(class072092, (class00500)this.L.W().y((class08092)u, (Comparable)Boolean.valueOf(false)), 2);
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        this.N(class005002, (class07290)class072992, (class08713)class072992, class072992.field_9229, class072092);
    }
}

