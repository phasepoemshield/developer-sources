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

public final class class02774
extends Enum<class02774>
implements class05033 {
    public static final /* enum */ class02774 field_28704 = new class02774("unaffected");
    public static final /* enum */ class02774 field_28705 = new class02774("exposed");
    public static final /* enum */ class02774 field_28706 = new class02774("weathered");
    public static final /* enum */ class02774 field_28707 = new class02774("oxidized");
    public static final IntFunction<class02774> field_61431;
    public static final Codec<class02774> field_46493;
    public static final class02362<ByteBuf, class02774> field_61432;
    private final String field_46494;
    private static final /* synthetic */ class02774[] field_28708;

    private static /* synthetic */ class02774[] L() {
        return new class02774[]{field_28704, field_28705, field_28706, field_28707};
    }

    private class02774(String string2) {
        this.field_46494 = string2;
    }

    public static class02774[] values() {
        return (class02774[])field_28708.clone();
    }

    public static class02774 valueOf(String string) {
        return Enum.valueOf(class02774.class, string);
    }

    public class02774 y() {
        return field_61431.apply(this.ordinal() - 1);
    }

    public class02774 N() {
        return field_61431.apply(this.ordinal() + 1);
    }

    public String method_15434() {
        return this.field_46494;
    }

    static {
        field_28708 = class02774.L();
        field_61431 = class02121.N(Enum::ordinal, (Object[])class02774.values(), (class02126)class02126.field_41666);
        field_46493 = class05033.N(class02774::values);
        field_61432 = class02389.N(field_61431, Enum::ordinal);
    }
}

