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
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class08033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class08033;
import org.jspecify.annotations.Nullable;

public final class class07282
extends Enum<class07282>
implements class05033 {
    public static final /* enum */ class07282 field_9215 = new class07282(0, "survival");
    public static final /* enum */ class07282 field_9220 = new class07282(1, "creative");
    public static final /* enum */ class07282 field_9216 = new class07282(2, "adventure");
    public static final /* enum */ class07282 field_9219 = new class07282(3, "spectator");
    public static final class07282 field_28045;
    public static final class05031<class07282> field_41676;
    private static final IntFunction<class07282> field_41677;
    public static final class02362<ByteBuf, class07282> field_60671;
    @Deprecated
    public static final Codec<class07282> field_56668;
    private static final int field_30964 = -1;
    private final int field_9217;
    private final String field_9221;
    private final class00392 field_28046;
    private final class00392 field_28047;
    private static final /* synthetic */ class07282[] field_9222;

    public class00392 L() {
        return this.field_28047;
    }

    public static boolean L(int n) {
        return Arrays.stream(class07282.values()).anyMatch(class072822 -> class072822.field_9217 == n);
    }

    public boolean M() {
        return this == field_9215 || this == field_9216;
    }

    private class07282(int n2, String string2) {
        this.field_9217 = n2;
        this.field_9221 = string2;
        this.field_28046 = class00392.L((String)("selectWorld.gameMode." + string2));
        this.field_28047 = class00392.L((String)("gameMode." + string2));
    }

    public static class07282[] values() {
        return (class07282[])field_9222.clone();
    }

    public static class07282 valueOf(String string) {
        return Enum.valueOf(class07282.class, string);
    }

    private static /* synthetic */ class07282[] B() {
        return new class07282[]{field_9215, field_9220, field_9216, field_9219};
    }

    public boolean i() {
        return this == field_9216 || this == field_9219;
    }

    public class00392 u() {
        return this.field_28046;
    }

    public String y() {
        return this.field_9221;
    }

    public static @Nullable class07282 y(int n) {
        if (n == -1) {
            return null;
        }
        return class07282.N(n);
    }

    public static @Nullable class07282 N(String string, @Nullable class07282 class072822) {
        class07282 class072823 = (class07282)field_41676.N(string);
        return class072823 != null ? class072823 : class072822;
    }

    public static int N(@Nullable class07282 class072822) {
        return class072822 != null ? class072822.field_9217 : -1;
    }

    public static class07282 N(String string) {
        return class07282.N(string, field_9215);
    }

    public void N(class08033 class080332) {
        if (this == field_9220) {
            class080332.L = true;
            class080332.u = true;
            class080332.N = true;
        } else if (this == field_9219) {
            class080332.L = true;
            class080332.u = false;
            class080332.N = true;
            class080332.y = true;
        } else {
            class080332.L = false;
            class080332.u = false;
            class080332.N = false;
            class080332.y = false;
        }
        class080332.i = !this.i();
    }

    public int N() {
        return this.field_9217;
    }

    public static class07282 N(int n) {
        return field_41677.apply(n);
    }

    public boolean R() {
        return this == field_9220;
    }

    public String method_15434() {
        return this.field_9221;
    }

    static {
        field_9222 = class07282.B();
        field_28045 = field_9215;
        field_41676 = class05033.N(class07282::values);
        field_41677 = class02121.N(class07282::N, (Object[])class07282.values(), (class02126)class02126.field_41664);
        field_60671 = class02389.N(field_41677, class07282::N);
        field_56668 = Codec.INT.xmap(class07282::N, class07282::N);
    }
}

