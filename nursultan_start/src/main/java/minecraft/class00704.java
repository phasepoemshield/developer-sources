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

public final class class00704
extends Enum<class00704>
implements class05033 {
    public static final /* enum */ class00704 field_41586 = new class00704(0, "creamy");
    public static final /* enum */ class00704 field_41587 = new class00704(1, "white");
    public static final /* enum */ class00704 field_41588 = new class00704(2, "brown");
    public static final /* enum */ class00704 field_41589 = new class00704(3, "gray");
    public static final class00704 field_57635;
    private static final IntFunction<class00704> field_41591;
    public static final Codec<class00704> field_41590;
    @Deprecated
    public static final Codec<class00704> field_56660;
    public static final class02362<ByteBuf, class00704> field_55971;
    final int field_41592;
    private final String field_41593;
    private static final /* synthetic */ class00704[] field_41594;

    private class00704(int n2, String string2) {
        this.field_41592 = n2;
        this.field_41593 = string2;
    }

    public static class00704[] values() {
        return (class00704[])field_41594.clone();
    }

    public static class00704 valueOf(String string) {
        return Enum.valueOf(class00704.class, string);
    }

    private static /* synthetic */ class00704[] y() {
        return new class00704[]{field_41586, field_41587, field_41588, field_41589};
    }

    public static class00704 N(int n) {
        return field_41591.apply(n);
    }

    public int N() {
        return this.field_41592;
    }

    public String method_15434() {
        return this.field_41593;
    }

    static {
        field_41594 = class00704.y();
        field_57635 = field_41586;
        field_41591 = class02121.N(class00704::N, (Object[])class00704.values(), (class02126)class02126.field_41666);
        field_41590 = class05033.N(class00704::values);
        field_56660 = Codec.INT.xmap(field_41591::apply, class00704::N);
        field_55971 = class02389.N(field_41591, class00704::N);
    }
}

