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
 *  minecraft.class02142
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02142;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07209;

public class class06858
extends class00891 {
    public static final MapCodec<class06858> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02142.N((int)0, (int)10).fieldOf("experience").forGetter(class068582 -> class068582.y), (App)class06858.t()).apply(instance, class06858::new));
    private final class02142 y;

    public class06858(class02142 class021422, class01362 class013622) {
        super(class013622);
        this.y = class021422;
    }

    public MapCodec<? extends class06858> N() {
        return N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            this.N(class047822, class072092, class065842, this.y);
        }
    }
}

