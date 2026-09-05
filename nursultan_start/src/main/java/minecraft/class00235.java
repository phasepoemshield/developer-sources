/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
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
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class00235
extends Enum<class00235>
implements class05033 {
    public static final /* enum */ class00235 field_56024 = new class00235(0, "start");
    public static final /* enum */ class00235 field_56025 = new class00235(1, "log");
    public static final /* enum */ class00235 field_56026 = new class00235(2, "fail");
    public static final /* enum */ class00235 field_56027 = new class00235(3, "accept");
    private static final IntFunction<class00235> field_56030;
    public static final Codec<class00235> field_56028;
    public static final class02362<ByteBuf, class00235> field_56029;
    private final int field_56031;
    private final String field_56032;
    private final class00392 field_56033;
    private final class00392 field_56034;
    private static final /* synthetic */ class00235[] field_56035;

    private static /* synthetic */ class00235[] L() {
        return new class00235[]{field_56024, field_56025, field_56026, field_56027};
    }

    private class00235(int n2, String string2) {
        this.field_56031 = n2;
        this.field_56032 = string2;
        this.field_56033 = class00392.L((String)("test_block.mode." + string2));
        this.field_56034 = class00392.L((String)("test_block.mode_info." + string2));
    }

    public static class00235[] values() {
        return (class00235[])field_56035.clone();
    }

    public static class00235 valueOf(String string) {
        return Enum.valueOf(class00235.class, string);
    }

    public class00392 y() {
        return this.field_56034;
    }

    public class00392 N() {
        return this.field_56033;
    }

    private static /* synthetic */ int N(class00235 class002352) {
        return class002352.field_56031;
    }

    public String method_15434() {
        return this.field_56032;
    }

    static {
        field_56035 = class00235.L();
        field_56030 = class02121.N(class002352 -> class002352.field_56031, (Object[])class00235.values(), (class02126)class02126.field_41664);
        field_56028 = class05033.N(class00235::values);
        field_56029 = class02389.N(field_56030, class002352 -> class002352.field_56031);
    }
}

