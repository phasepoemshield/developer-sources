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

public final class class01312
extends Enum<class01312>
implements class05033 {
    public static final /* enum */ class01312 field_18076 = new class01312(0, "standing");
    public static final /* enum */ class01312 field_18077 = new class01312(1, "fall_flying");
    public static final /* enum */ class01312 field_18078 = new class01312(2, "sleeping");
    public static final /* enum */ class01312 field_18079 = new class01312(3, "swimming");
    public static final /* enum */ class01312 field_18080 = new class01312(4, "spin_attack");
    public static final /* enum */ class01312 field_18081 = new class01312(5, "crouching");
    public static final /* enum */ class01312 field_30095 = new class01312(6, "long_jumping");
    public static final /* enum */ class01312 field_18082 = new class01312(7, "dying");
    public static final /* enum */ class01312 field_37422 = new class01312(8, "croaking");
    public static final /* enum */ class01312 field_37423 = new class01312(9, "using_tongue");
    public static final /* enum */ class01312 field_40118 = new class01312(10, "sitting");
    public static final /* enum */ class01312 field_38097 = new class01312(11, "roaring");
    public static final /* enum */ class01312 field_38098 = new class01312(12, "sniffing");
    public static final /* enum */ class01312 field_38099 = new class01312(13, "emerging");
    public static final /* enum */ class01312 field_38100 = new class01312(14, "digging");
    public static final /* enum */ class01312 field_47246 = new class01312(15, "sliding");
    public static final /* enum */ class01312 field_47247 = new class01312(16, "shooting");
    public static final /* enum */ class01312 field_47248 = new class01312(17, "inhaling");
    public static final IntFunction<class01312> field_48322;
    public static final Codec<class01312> field_63012;
    public static final class02362<ByteBuf, class01312> field_48323;
    private final int field_48324;
    private final String field_63013;
    private static final /* synthetic */ class01312[] field_18083;

    private class01312(int n2, String string2) {
        this.field_48324 = n2;
        this.field_63013 = string2;
    }

    public static class01312[] values() {
        return (class01312[])field_18083.clone();
    }

    public static class01312 valueOf(String string) {
        return Enum.valueOf(class01312.class, string);
    }

    private static /* synthetic */ class01312[] y() {
        return new class01312[]{field_18076, field_18077, field_18078, field_18079, field_18080, field_18081, field_30095, field_18082, field_37422, field_37423, field_40118, field_38097, field_38098, field_38099, field_38100, field_47246, field_47247, field_47248};
    }

    public int N() {
        return this.field_48324;
    }

    public String method_15434() {
        return this.field_63013;
    }

    static {
        field_18083 = class01312.y();
        field_48322 = class02121.N(class01312::N, (Object[])class01312.values(), (class02126)class02126.field_41664);
        field_63012 = class05033.N(class01312::values);
        field_48323 = class02389.N(field_48322, class01312::N);
    }
}

