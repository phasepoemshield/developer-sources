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

public final class class07648
extends Enum<class07648>
implements class05033 {
    public static final /* enum */ class07648 field_41550 = new class07648(0, "red_blue");
    public static final /* enum */ class07648 field_41551 = new class07648(1, "blue");
    public static final /* enum */ class07648 field_41552 = new class07648(2, "green");
    public static final /* enum */ class07648 field_41553 = new class07648(3, "yellow_blue");
    public static final /* enum */ class07648 field_41554 = new class07648(4, "gray");
    public static final class07648 field_57614;
    private static final IntFunction<class07648> field_41556;
    public static final Codec<class07648> field_41555;
    @Deprecated
    public static final Codec<class07648> field_56653;
    public static final class02362<ByteBuf, class07648> field_55965;
    final int field_41557;
    private final String field_41558;
    private static final /* synthetic */ class07648[] field_41559;

    private class07648(int n2, String string2) {
        this.field_41557 = n2;
        this.field_41558 = string2;
    }

    public static class07648[] values() {
        return (class07648[])field_41559.clone();
    }

    public static class07648 valueOf(String string) {
        return Enum.valueOf(class07648.class, string);
    }

    private static /* synthetic */ class07648[] y() {
        return new class07648[]{field_41550, field_41551, field_41552, field_41553, field_41554};
    }

    public static class07648 N(int n) {
        return field_41556.apply(n);
    }

    public int N() {
        return this.field_41557;
    }

    public String method_15434() {
        return this.field_41558;
    }

    static {
        field_41559 = class07648.y();
        field_57614 = field_41550;
        field_41556 = class02121.N(class07648::N, (Object[])class07648.values(), (class02126)class02126.field_41666);
        field_41555 = class05033.N(class07648::values);
        field_56653 = Codec.INT.xmap(field_41556::apply, class07648::N);
        field_55965 = class02389.N(field_41556, class07648::N);
    }
}

