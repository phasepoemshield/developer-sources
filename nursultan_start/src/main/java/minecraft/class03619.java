/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class03636
 *  minecraft.class03647
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class03636;
import minecraft.class03647;
import minecraft.class04206;

public class class03619<P extends class03647> {
    public static final class03619<class03636> N = class03619.N("mangrove_root_placer", class03636.L);
    private final MapCodec<P> y;

    public class03619(MapCodec<P> mapCodec) {
        this.y = mapCodec;
    }

    private static <P extends class03647> class03619<P> N(String string, MapCodec<P> mapCodec) {
        return (class03619)class00751.N((class00751)class04206.x, (String)string, new class03619<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.y;
    }
}

