/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class05070
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class05046;
import minecraft.class05054;
import minecraft.class05070;

public class class05052<P extends class05054> {
    public static final class05052<class05046> N = class05052.N("two_layers_feature_size", class05046.u);
    public static final class05052<class05070> y = class05052.N("three_layers_feature_size", class05070.u);
    private final MapCodec<P> L;

    private class05052(MapCodec<P> mapCodec) {
        this.L = mapCodec;
    }

    private static <P extends class05054> class05052<P> N(String string, MapCodec<P> mapCodec) {
        return (class05052)class00751.N((class00751)class04206.h, (String)string, new class05052<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.L;
    }
}

