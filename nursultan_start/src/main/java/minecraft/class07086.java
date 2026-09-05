/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05031
 *  minecraft.class05033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05031;
import minecraft.class05033;
import org.jspecify.annotations.Nullable;

public final class class07086
extends Enum<class07086>
implements class05033 {
    public static final /* enum */ class07086 field_5801 = new class07086(0, "peaceful");
    public static final /* enum */ class07086 field_5805 = new class07086(1, "easy");
    public static final /* enum */ class07086 field_5802 = new class07086(2, "normal");
    public static final /* enum */ class07086 field_5807 = new class07086(3, "hard");
    public static final class05031<class07086> field_41668;
    private static final IntFunction<class07086> field_5800;
    public static final class02362<ByteBuf, class07086> field_60664;
    private final int field_5803;
    private final String field_5806;
    private static final /* synthetic */ class07086[] field_5804;

    public class00392 L() {
        return class00392.L((String)("options.difficulty." + this.field_5806 + ".info"));
    }

    private class07086(int n2, String string2) {
        this.field_5803 = n2;
        this.field_5806 = string2;
    }

    public static class07086[] values() {
        return (class07086[])field_5804.clone();
    }

    public static class07086 valueOf(String string) {
        return Enum.valueOf(class07086.class, string);
    }

    private static /* synthetic */ class07086[] i() {
        return new class07086[]{field_5801, field_5805, field_5802, field_5807};
    }

    public String u() {
        return this.field_5806;
    }

    public class00392 y() {
        return class00392.L((String)("options.difficulty." + this.field_5806));
    }

    @Deprecated
    public static class07086 N(int n) {
        return field_5800.apply(n);
    }

    public int N() {
        return this.field_5803;
    }

    public static @Nullable class07086 N(String string) {
        return (class07086)field_41668.N(string);
    }

    public String method_15434() {
        return this.field_5806;
    }

    static {
        field_5804 = class07086.i();
        field_41668 = class05033.N(class07086::values);
        field_5800 = class02121.N(class07086::N, (Object[])class07086.values(), (class02126)class02126.field_41665);
        field_60664 = class02389.N(field_5800, class07086::N);
    }
}

