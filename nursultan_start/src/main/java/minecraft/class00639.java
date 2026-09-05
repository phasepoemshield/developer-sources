/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00476
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class01894
 *  minecraft.class04907
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00476;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class01894;
import minecraft.class04907;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public class class00639
extends class00860 {
    public static final MapCodec<class00639> N = class00639.y(class00639::new);

    protected class04907<class01894> T() {
        return class01235.Z.y((Object)class01235.NU);
    }

    public class00639(class01362 class013622) {
        super(() -> class00404.field_11891, class04909.Rb, class04909.Rs, class013622);
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 == class07211.field_11036) {
            return class005002.N(class072902, class072092, class072112);
        }
        return 0;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return class04995.N((int)class00379.N((class07290)class072902, (class07209)class072092), (int)0, (int)15);
    }

    public MapCodec<class00639> N() {
        return N;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00476(class072092, class005002);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

