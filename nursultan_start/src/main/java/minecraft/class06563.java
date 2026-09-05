/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class01929
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02566
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class04689
 *  minecraft.class04782
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class05838
 *  minecraft.class05857
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import minecraft.class01929;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02566;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class04689;
import minecraft.class04782;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class05838;
import minecraft.class05857;
import minecraft.class06559;
import minecraft.class06584;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class06563
extends Enum<class06563>
implements class05033 {
    public static final /* enum */ class06563 field_7952 = new class06563(0, "white", 0xF9FFFE, class04689.Z, 0xF0F0F0, 0xFFFFFF);
    public static final /* enum */ class06563 field_7946 = new class06563(1, "orange", 16351261, class04689.s, 15435844, 16738335);
    public static final /* enum */ class06563 field_7958 = new class06563(2, "magenta", 13061821, class04689.T, 12801229, 0xFF00FF);
    public static final /* enum */ class06563 field_7951 = new class06563(3, "light_blue", 3847130, class04689.b, 6719955, 10141901);
    public static final /* enum */ class06563 field_7947 = new class06563(4, "yellow", 16701501, class04689.j, 14602026, 0xFFFF00);
    public static final /* enum */ class06563 field_7961 = new class06563(5, "lime", 8439583, class04689.v, 4312372, 0xBFFF00);
    public static final /* enum */ class06563 field_7954 = new class06563(6, "pink", 15961002, class04689.n, 14188952, 16738740);
    public static final /* enum */ class06563 field_7944 = new class06563(7, "gray", 4673362, class04689.t, 0x434343, 0x808080);
    public static final /* enum */ class06563 field_7967 = new class06563(8, "light_gray", 0x9D9D97, class04689.G, 0xABABAB, 0xD3D3D3);
    public static final /* enum */ class06563 field_7955 = new class06563(9, "cyan", 1481884, class04689.l, 2651799, 65535);
    public static final /* enum */ class06563 field_7945 = new class06563(10, "purple", 8991416, class04689.d, 8073150, 10494192);
    public static final /* enum */ class06563 field_7966 = new class06563(11, "blue", 3949738, class04689.w, 2437522, 255);
    public static final /* enum */ class06563 field_7957 = new class06563(12, "brown", 8606770, class04689.k, 5320730, 9127187);
    public static final /* enum */ class06563 field_7942 = new class06563(13, "green", 6192150, class04689.Y, 3887386, 65280);
    public static final /* enum */ class06563 field_7964 = new class06563(14, "red", 11546150, class04689.Q, 11743532, 0xFF0000);
    public static final /* enum */ class06563 field_7963 = new class06563(15, "black", 0x1D1D21, class04689.O, 0x1E1B1B, 0);
    private static final IntFunction<class06563> field_7959;
    private static final Int2ObjectOpenHashMap<class06563> field_7950;
    public static final class05031<class06563> field_41600;
    public static final class02362<ByteBuf, class06563> field_49259;
    @Deprecated
    public static final Codec<class06563> field_56666;
    private final int field_7965;
    private final String field_7948;
    private final class04689 field_7956;
    private final int field_7943;
    private final int field_7960;
    private final int field_16537;
    private static final /* synthetic */ class06563[] field_7953;

    public int L() {
        return this.field_7943;
    }

    private static /* synthetic */ class06563[] M() {
        return new class06563[]{field_7952, field_7946, field_7958, field_7951, field_7947, field_7961, field_7954, field_7944, field_7967, field_7955, field_7945, field_7966, field_7957, field_7942, field_7964, field_7963};
    }

    private class06563(int n2, String string2, int n3, class04689 class046892, int n4, int n5) {
        this.field_7965 = n2;
        this.field_7948 = string2;
        this.field_7956 = class046892;
        this.field_16537 = class02566.M((int)n5);
        this.field_7943 = class02566.M((int)n3);
        this.field_7960 = n4;
    }

    public String toString() {
        return this.field_7948;
    }

    public static class06563[] values() {
        return (class06563[])field_7953.clone();
    }

    public static class06563 valueOf(String string) {
        return Enum.valueOf(class06563.class, string);
    }

    public int i() {
        return this.field_7960;
    }

    public class04689 u() {
        return this.field_7956;
    }

    public static @Nullable class06563 y(int n) {
        return (class06563)((Object)field_7950.get(n));
    }

    public String y() {
        return this.field_7948;
    }

    private static class02903 N(class06563 class065632, class06563 class065633) {
        return class02903.N((int)2, (int)1, List.of(new class06584(class06559.N(class065632)), new class06584(class06559.N(class065633))));
    }

    public int N() {
        return this.field_7965;
    }

    public static class06563 N(int n) {
        return field_7959.apply(n);
    }

    public static class06563 N(class04782 class047822, class06563 class065632, class06563 class065633) {
        class02903 class029032 = class06563.N(class065632, class065633);
        return class047822.method_64577().N(class05838.N, (class02950)class029032, (class07299)class047822).map(class037292 -> ((class05857)class037292.y()).method_8116((class02950)class029032, (class01929)class047822.method_30349())).map(class06584::B).filter(class06559.class::isInstance).map(class06559.class::cast).map(class06559::N).orElseGet(() -> class047822.field_9229.Z() ? class065632 : class065633);
    }

    public static @Nullable class06563 N(String string, @Nullable class06563 class065632) {
        class06563 class065633 = (class06563)field_41600.N(string);
        return class065633 != null ? class065633 : class065632;
    }

    public int R() {
        return this.field_16537;
    }

    public String method_15434() {
        return this.field_7948;
    }

    static {
        field_7953 = class06563.M();
        field_7959 = class02121.N(class06563::N, (Object[])class06563.values(), (class02126)class02126.field_41664);
        field_7950 = new Int2ObjectOpenHashMap(Arrays.stream(class06563.values()).collect(Collectors.toMap(class065632 -> class065632.field_7960, class065632 -> class065632)));
        field_41600 = class05033.N(class06563::values);
        field_49259 = class02389.N(field_7959, class06563::N);
        field_56666 = Codec.BYTE.xmap(class06563::N, class065632 -> (byte)class065632.field_7965);
    }
}

