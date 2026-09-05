/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02362
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import minecraft.class02362;

public final class class06244
extends Enum<class06244> {
    public static final /* enum */ class06244 field_17274 = new class06244();
    public static final Codec<class06244> field_51563;
    public static final class02362<ByteBuf, class06244> field_55626;
    private static final /* synthetic */ class06244[] field_17275;

    public static class06244[] values() {
        return (class06244[])field_17275.clone();
    }

    public static class06244 valueOf(String string) {
        return Enum.valueOf(class06244.class, string);
    }

    private static /* synthetic */ class06244[] N() {
        return new class06244[]{field_17274};
    }

    static {
        field_17275 = class06244.N();
        field_51563 = MapCodec.unitCodec((Object)((Object)field_17274));
        field_55626 = class02362.N((Object)((Object)field_17274));
    }
}

