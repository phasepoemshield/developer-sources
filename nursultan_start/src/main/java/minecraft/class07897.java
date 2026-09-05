/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class07897
extends Enum<class07897>
implements class05033 {
    public static final /* enum */ class07897 field_41561 = new class07897(0, "brown");
    public static final /* enum */ class07897 field_41562 = new class07897(1, "white");
    public static final /* enum */ class07897 field_41563 = new class07897(2, "black");
    public static final /* enum */ class07897 field_41564 = new class07897(3, "white_splotched");
    public static final /* enum */ class07897 field_41565 = new class07897(4, "gold");
    public static final /* enum */ class07897 field_41566 = new class07897(5, "salt");
    public static final /* enum */ class07897 field_41567 = new class07897(99, "evil");
    public static final class07897 field_57617;
    private static final IntFunction<class07897> field_41569;
    public static final Codec<class07897> field_41568;
    @Deprecated
    public static final Codec<class07897> field_56654;
    public static final class02362<ByteBuf, class07897> field_55966;
    final int field_41570;
    private final String field_41571;
    private static final /* synthetic */ class07897[] field_41572;

    private class07897(int n2, String string2) {
        this.field_41570 = n2;
        this.field_41571 = string2;
    }

    public static class07897[] values() {
        return (class07897[])field_41572.clone();
    }

    public static class07897 valueOf(String string) {
        return Enum.valueOf(class07897.class, string);
    }

    private static /* synthetic */ class07897[] y() {
        return new class07897[]{field_41561, field_41562, field_41563, field_41564, field_41565, field_41566, field_41567};
    }

    public int N() {
        return this.field_41570;
    }

    public static class07897 N(int n) {
        return field_41569.apply(n);
    }

    public String method_15434() {
        return this.field_41571;
    }

    static {
        field_41572 = class07897.y();
        field_57617 = field_41561;
        field_41569 = class02121.N(class07897::N, (Object[])class07897.values(), (Object)((Object)field_57617));
        field_41568 = class05033.N(class07897::values);
        field_56654 = Codec.INT.xmap(field_41569::apply, class07897::N);
        field_55966 = class02389.N(field_41569, class07897::N);
    }
}

