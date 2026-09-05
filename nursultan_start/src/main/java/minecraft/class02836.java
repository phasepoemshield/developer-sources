/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02808;
import minecraft.class02811;
import minecraft.class02831;
import minecraft.class02846;
import minecraft.class04247;
import minecraft.class05033;

public final class class02836
extends Enum<class02836>
implements class05033 {
    public static final /* enum */ class02836 field_59739 = new class02836("default", 0, class02846.u, class02846.i);
    public static final /* enum */ class02836 field_59740 = new class02836("hidden", 1, class02811.u, class02811.i);
    public static final /* enum */ class02836 field_59741 = new class02836("override", 2, class02808.L, class02808.u);
    static final Codec<class02836> field_59742;
    private static final IntFunction<class02836> field_59743;
    static final class02362<ByteBuf, class02836> field_59744;
    private final String field_59745;
    private final int field_59746;
    final MapCodec<? extends class02831> field_59747;
    private final class02362<class04247, ? extends class02831> field_59748;
    private static final /* synthetic */ class02836[] field_59749;

    private static /* synthetic */ class02836[] L() {
        return new class02836[]{field_59739, field_59740, field_59741};
    }

    private class02836(String string2, int n2, MapCodec<? extends class02831> mapCodec, class02362<class04247, ? extends class02831> class023622) {
        this.field_59745 = string2;
        this.field_59746 = n2;
        this.field_59747 = mapCodec;
        this.field_59748 = class023622;
    }

    public static class02836[] values() {
        return (class02836[])field_59749.clone();
    }

    public static class02836 valueOf(String string) {
        return Enum.valueOf(class02836.class, string);
    }

    private class02362<class04247, ? extends class02831> y() {
        return this.field_59748;
    }

    private int N() {
        return this.field_59746;
    }

    public String method_15434() {
        return this.field_59745;
    }

    static {
        field_59749 = class02836.L();
        field_59742 = class05033.N(class02836::values);
        field_59743 = class02121.N(class02836::N, (Object[])class02836.values(), (class02126)class02126.field_41664);
        field_59744 = class02389.N(field_59743, class02836::N);
    }
}

