/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00653
 *  minecraft.class01362
 *  minecraft.class06584
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00399;
import minecraft.class00500;
import minecraft.class00653;
import minecraft.class01362;
import minecraft.class06584;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class00409
extends class00653 {
    public static final MapCodec<class00409> y = class00409.y(class00409::new);

    public class00409(class01362 class013622) {
        super((class07030)class07032.field_11513, class013622);
    }

    public MapCodec<class00409> N() {
        return y;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        class00399.N(class072992, class072092);
    }
}

