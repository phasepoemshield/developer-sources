/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class07211;

public class class00741
extends class00891 {
    public static final MapCodec<class00741> u = class00741.y(class00741::new);

    public class00741(class01362 class013622) {
        super(class013622);
    }

    protected boolean y(class00500 class005002, class00500 class005003, class07211 class072112) {
        if (class005003.N((class00891)this)) {
            return true;
        }
        return super.y(class005002, class005003, class072112);
    }

    protected MapCodec<? extends class00741> N() {
        return u;
    }
}

