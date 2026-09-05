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
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class06069;
import minecraft.class07536;

public final class class05541
extends Enum<class05541>
implements class05033 {
    public static final /* enum */ class05541 field_28341 = new class05541(0, "lucy", true);
    public static final /* enum */ class05541 field_28342 = new class05541(1, "wild", true);
    public static final /* enum */ class05541 field_28343 = new class05541(2, "gold", true);
    public static final /* enum */ class05541 field_28344 = new class05541(3, "cyan", true);
    public static final /* enum */ class05541 field_28345 = new class05541(4, "blue", false);
    public static final class05541 field_57623;
    private static final IntFunction<class05541> field_28346;
    public static final class02362<ByteBuf, class05541> field_55970;
    public static final Codec<class05541> field_41585;
    @Deprecated
    public static final Codec<class05541> field_56659;
    private final int field_28347;
    private final String field_28348;
    private final boolean field_28349;
    private static final /* synthetic */ class05541[] field_28350;

    private static /* synthetic */ class05541[] L() {
        return new class05541[]{field_28341, field_28342, field_28343, field_28344, field_28345};
    }

    private class05541(int n2, String string2, boolean bl) {
        this.field_28347 = n2;
        this.field_28348 = string2;
        this.field_28349 = bl;
    }

    public static class05541[] values() {
        return (class05541[])field_28350.clone();
    }

    public static class05541 valueOf(String string) {
        return Enum.valueOf(class05541.class, string);
    }

    public static class05541 y(class06069 class060692) {
        return class05541.N(class060692, false);
    }

    public String y() {
        return this.field_28348;
    }

    public static class05541 N(class06069 class060692) {
        return class05541.N(class060692, true);
    }

    public static class05541 N(int n) {
        return field_28346.apply(n);
    }

    public int N() {
        return this.field_28347;
    }

    private static class05541 N(class06069 class060692, boolean bl) {
        return (class05541)((Object)class07536.N((Object[])((class05541[])Arrays.stream(class05541.values()).filter(class055412 -> class055412.field_28349 == bl).toArray(class05541[]::new)), (class06069)class060692));
    }

    public String method_15434() {
        return this.field_28348;
    }

    static {
        field_28350 = class05541.L();
        field_57623 = field_28341;
        field_28346 = class02121.N(class05541::N, (Object[])class05541.values(), (class02126)class02126.field_41664);
        field_55970 = class02389.N(field_28346, class05541::N);
        field_41585 = class05033.N(class05541::values);
        field_56659 = Codec.INT.xmap(field_28346::apply, class05541::N);
    }
}

