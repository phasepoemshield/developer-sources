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

public final class class03774
extends Enum<class03774>
implements class05033 {
    public static final /* enum */ class03774 field_40242 = new class03774(0, "food");
    public static final /* enum */ class03774 field_40243 = new class03774(1, "blocks");
    public static final /* enum */ class03774 field_40244 = new class03774(2, "misc");
    private static final IntFunction<class03774> field_54632;
    public static final Codec<class03774> field_40245;
    public static final class02362<ByteBuf, class03774> field_54631;
    private final int field_54633;
    private final String field_40246;
    private static final /* synthetic */ class03774[] field_40247;

    private class03774(int n2, String string2) {
        this.field_54633 = n2;
        this.field_40246 = string2;
    }

    public static class03774[] values() {
        return (class03774[])field_40247.clone();
    }

    public static class03774 valueOf(String string) {
        return Enum.valueOf(class03774.class, string);
    }

    private static /* synthetic */ class03774[] N() {
        return new class03774[]{field_40242, field_40243, field_40244};
    }

    private static /* synthetic */ int N(class03774 class037742) {
        return class037742.field_54633;
    }

    public String method_15434() {
        return this.field_40246;
    }

    static {
        field_40247 = class03774.N();
        field_54632 = class02121.N(class037742 -> class037742.field_54633, (Object[])class03774.values(), (class02126)class02126.field_41664);
        field_40245 = class05033.N(class03774::values);
        field_54631 = class02389.N(field_54632, class037742 -> class037742.field_54633);
    }
}

