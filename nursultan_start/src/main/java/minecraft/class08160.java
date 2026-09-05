/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class08152;
import minecraft.class08164;

public class class08160
implements class08164 {
    public static final class08160 y = new class08160();
    public static final MapCodec<class08160> L = MapCodec.unit((Object)y);

    private class08160() {
    }

    @Override
    public boolean N(class08152 class081522) {
        return true;
    }

    public MapCodec<class08160> N() {
        return L;
    }
}

