/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class03530
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class03530;
import minecraft.class04227;
import minecraft.class05240;
import minecraft.class05261;
import minecraft.class05946;
import minecraft.class06069;

public class class05271
extends class05261 {
    public static final MapCodec<class05271> N = class03530.N((class05946)class04227.Z).fieldOf("tag").xmap(class05271::new, class052712 -> class052712.y);
    private final class03530<class00891> y;

    public class05271(class03530<class00891> class035302) {
        this.y = class035302;
    }

    @Override
    public boolean N(class00500 class005002, class06069 class060692) {
        return class005002.N(this.y);
    }

    @Override
    protected class05240<?> N() {
        return class05240.u;
    }
}

