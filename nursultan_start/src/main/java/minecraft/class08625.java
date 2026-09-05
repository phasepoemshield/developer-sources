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

public final class class08625
extends Enum<class08625>
implements class05033 {
    public static final /* enum */ class08625 field_56014 = new class08625("cleared", 0);
    public static final /* enum */ class08625 field_56015 = new class08625("running", 1);
    public static final /* enum */ class08625 field_56016 = new class08625("finished", 2);
    private static final IntFunction<class08625> field_56019;
    public static final Codec<class08625> field_56017;
    public static final class02362<ByteBuf, class08625> field_56018;
    private final String field_56020;
    private final int field_56021;
    private static final /* synthetic */ class08625[] field_56022;

    private class08625(String string2, int n2) {
        this.field_56020 = string2;
        this.field_56021 = n2;
    }

    static {
        field_56022 = class08625.N();
        field_56019 = class02121.N(class086252 -> class086252.field_56021, (Object[])class08625.values(), (class02126)class02126.field_41664);
        field_56017 = class05033.N(class08625::values);
        field_56018 = class02389.N(class08625::N, class086252 -> class086252.field_56021);
    }

    public static class08625[] values() {
        return (class08625[])field_56022.clone();
    }

    public static class08625 valueOf(String string) {
        return Enum.valueOf(class08625.class, string);
    }

    public static class08625 N(int n) {
        return field_56019.apply(n);
    }

    private static /* synthetic */ class08625[] N() {
        return new class08625[]{field_56014, field_56015, field_56016};
    }

    public String method_15434() {
        return this.field_56020;
    }
}

