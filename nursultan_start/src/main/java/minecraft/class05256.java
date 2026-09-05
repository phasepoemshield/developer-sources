/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class05240;
import minecraft.class05261;
import minecraft.class06069;

public class class05256
extends class05261 {
    public static final MapCodec<class05256> N = class00500.N.fieldOf("block_state").xmap(class05256::new, class052562 -> class052562.y);
    private final class00500 y;

    public class05256(class00500 class005002) {
        this.y = class005002;
    }

    @Override
    public boolean N(class00500 class005002, class06069 class060692) {
        return class005002 == this.y;
    }

    @Override
    protected class05240<?> N() {
        return class05240.L;
    }
}

