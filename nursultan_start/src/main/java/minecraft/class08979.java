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

public final class class08979
extends Enum<class08979>
implements class05033 {
    public static final /* enum */ class08979 field_61292 = new class08979("idle", 0);
    public static final /* enum */ class08979 field_61293 = new class08979("getting_item", 1);
    public static final /* enum */ class08979 field_61294 = new class08979("getting_no_item", 2);
    public static final /* enum */ class08979 field_61295 = new class08979("dropping_item", 3);
    public static final /* enum */ class08979 field_61296 = new class08979("dropping_no_item", 4);
    public static final Codec<class08979> field_61297;
    private static final IntFunction<class08979> field_61299;
    public static final class02362<ByteBuf, class08979> field_61298;
    private final String field_61300;
    private final int field_61301;
    private static final /* synthetic */ class08979[] field_61302;

    private class08979(String string2, int n2) {
        this.field_61300 = string2;
        this.field_61301 = n2;
    }

    public static class08979[] values() {
        return (class08979[])field_61302.clone();
    }

    public static class08979 valueOf(String string) {
        return Enum.valueOf(class08979.class, string);
    }

    private static /* synthetic */ class08979[] y() {
        return new class08979[]{field_61292, field_61293, field_61294, field_61295, field_61296};
    }

    private int N() {
        return this.field_61301;
    }

    public String method_15434() {
        return this.field_61300;
    }

    static {
        field_61302 = class08979.y();
        field_61297 = class05033.N(class08979::values);
        field_61299 = class02121.N(class08979::N, (Object[])class08979.values(), (class02126)class02126.field_41664);
        field_61298 = class02389.N(field_61299, class08979::N);
    }
}

