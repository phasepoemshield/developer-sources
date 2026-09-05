/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.MatchException
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

public final class class07070
extends Enum<class07070>
implements class05033 {
    public static final /* enum */ class07070 field_6182 = new class07070(0, "left", "options.mainHand.left");
    public static final /* enum */ class07070 field_6183 = new class07070(1, "right", "options.mainHand.right");
    public static final Codec<class07070> field_45121;
    private static final IntFunction<class07070> field_46166;
    public static final class02362<ByteBuf, class07070> field_64359;
    private final int field_38385;
    private final String field_6181;
    private final class00392 field_64360;
    private static final /* synthetic */ class07070[] field_6180;

    private static /* synthetic */ class07070[] L() {
        return new class07070[]{field_6182, field_6183};
    }

    private class07070(int n2, String string2, String string3) {
        this.field_38385 = n2;
        this.field_6181 = string2;
        this.field_64360 = class00392.L((String)string3);
    }

    public static class07070[] values() {
        return (class07070[])field_6180.clone();
    }

    public static class07070 valueOf(String string) {
        return Enum.valueOf(class07070.class, string);
    }

    private static /* synthetic */ int y(class07070 class070702) {
        return class070702.field_38385;
    }

    public class00392 y() {
        return this.field_64360;
    }

    public class07070 N() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> field_6183;
            case 1 -> field_6182;
        };
    }

    public String method_15434() {
        return this.field_6181;
    }

    static {
        field_6180 = class07070.L();
        field_45121 = class05033.N(class07070::values);
        field_46166 = class02121.N(class070702 -> class070702.field_38385, (Object[])class07070.values(), (class02126)class02126.field_41664);
        field_64359 = class02389.N(field_46166, class070702 -> class070702.field_38385);
    }
}

