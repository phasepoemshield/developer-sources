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

public final class class05289
extends Enum<class05289>
implements class05033 {
    public static final /* enum */ class05289 field_23816 = new class05289(0, "white");
    public static final /* enum */ class05289 field_23817 = new class05289(1, "creamy");
    public static final /* enum */ class05289 field_23818 = new class05289(2, "chestnut");
    public static final /* enum */ class05289 field_23819 = new class05289(3, "brown");
    public static final /* enum */ class05289 field_23820 = new class05289(4, "black");
    public static final /* enum */ class05289 field_23821 = new class05289(5, "gray");
    public static final /* enum */ class05289 field_23822 = new class05289(6, "dark_brown");
    public static final Codec<class05289> field_41595;
    private static final IntFunction<class05289> field_23823;
    public static final class02362<ByteBuf, class05289> field_55972;
    private final int field_23824;
    private final String field_41596;
    private static final /* synthetic */ class05289[] field_23825;

    private class05289(int n2, String string2) {
        this.field_23824 = n2;
        this.field_41596 = string2;
    }

    public static class05289[] values() {
        return (class05289[])field_23825.clone();
    }

    public static class05289 valueOf(String string) {
        return Enum.valueOf(class05289.class, string);
    }

    private static /* synthetic */ class05289[] y() {
        return new class05289[]{field_23816, field_23817, field_23818, field_23819, field_23820, field_23821, field_23822};
    }

    public static class05289 N(int n) {
        return field_23823.apply(n);
    }

    public int N() {
        return this.field_23824;
    }

    public String method_15434() {
        return this.field_41596;
    }

    static {
        field_23825 = class05289.y();
        field_41595 = class05033.N(class05289::values);
        field_23823 = class02121.N(class05289::N, (Object[])class05289.values(), (class02126)class02126.field_41665);
        field_55972 = class02389.N(field_23823, class05289::N);
    }
}

