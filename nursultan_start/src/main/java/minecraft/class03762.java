/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class03762
extends Enum<class03762>
implements class05033 {
    public static final /* enum */ class03762 field_40248 = new class03762("building", 0);
    public static final /* enum */ class03762 field_40249 = new class03762("redstone", 1);
    public static final /* enum */ class03762 field_40250 = new class03762("equipment", 2);
    public static final /* enum */ class03762 field_40251 = new class03762("misc", 3);
    public static final Codec<class03762> field_40252;
    public static final IntFunction<class03762> field_48352;
    public static final class02362<ByteBuf, class03762> field_48353;
    private final String field_40253;
    private final int field_48354;
    private static final /* synthetic */ class03762[] field_40254;

    private class03762(String string2, int n2) {
        this.field_40253 = string2;
        this.field_48354 = n2;
    }

    public static class03762[] values() {
        return (class03762[])field_40254.clone();
    }

    public static class03762 valueOf(String string) {
        return Enum.valueOf(class03762.class, string);
    }

    private static /* synthetic */ class03762[] y() {
        return new class03762[]{field_40248, field_40249, field_40250, field_40251};
    }

    private int N() {
        return this.field_48354;
    }

    public String method_15434() {
        return this.field_40253;
    }

    static {
        field_40254 = class03762.y();
        field_40252 = class05033.N(class03762::values);
        field_48352 = class02121.N(class03762::N, (Object[])class03762.values(), (class02126)class02126.field_41664);
        field_48353 = class02389.N(field_48352, class03762::N);
    }
}

