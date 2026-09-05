/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class04206
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class04206;
import minecraft.class05240;
import minecraft.class05261;
import minecraft.class06069;

public class class05244
extends class05261 {
    public static final MapCodec<class05244> N = class04206.i.T().fieldOf("block").xmap(class05244::new, class052442 -> class052442.y);
    private final class00891 y;

    public class05244(class00891 class008912) {
        this.y = class008912;
    }

    @Override
    public boolean N(class00500 class005002, class06069 class060692) {
        return class005002.N(this.y);
    }

    @Override
    protected class05240<?> N() {
        return class05240.y;
    }
}

