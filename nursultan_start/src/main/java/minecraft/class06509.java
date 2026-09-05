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

public final class class06509
extends Enum<class06509>
implements class05033 {
    public static final /* enum */ class06509 field_8952 = new class06509(0, "none");
    public static final /* enum */ class06509 field_8950 = new class06509(1, "eat", true);
    public static final /* enum */ class06509 field_8946 = new class06509(2, "drink", true);
    public static final /* enum */ class06509 field_8949 = new class06509(3, "block");
    public static final /* enum */ class06509 field_8953 = new class06509(4, "bow");
    public static final /* enum */ class06509 field_63380 = new class06509(5, "trident");
    public static final /* enum */ class06509 field_8947 = new class06509(6, "crossbow");
    public static final /* enum */ class06509 field_27079 = new class06509(7, "spyglass");
    public static final /* enum */ class06509 field_39058 = new class06509(8, "toot_horn");
    public static final /* enum */ class06509 field_42717 = new class06509(9, "brush");
    public static final /* enum */ class06509 field_55494 = new class06509(10, "bundle");
    public static final /* enum */ class06509 field_8951 = new class06509(11, "spear", true);
    private static final IntFunction<class06509> field_53766;
    public static final Codec<class06509> field_53764;
    public static final class02362<ByteBuf, class06509> field_53765;
    private final int field_53767;
    private final String field_53768;
    private final boolean field_63381;
    private static final /* synthetic */ class06509[] field_8948;

    private static /* synthetic */ class06509[] L() {
        return new class06509[]{field_8952, field_8950, field_8946, field_8949, field_8953, field_63380, field_8947, field_27079, field_39058, field_42717, field_55494, field_8951};
    }

    private class06509(int n2, String string2) {
        this(n2, string2, false);
    }

    private class06509(int n2, String string2, boolean bl) {
        this.field_53767 = n2;
        this.field_53768 = string2;
        this.field_63381 = bl;
    }

    public static class06509[] values() {
        return (class06509[])field_8948.clone();
    }

    public static class06509 valueOf(String string) {
        return Enum.valueOf(class06509.class, string);
    }

    public boolean y() {
        return this.field_63381;
    }

    public int N() {
        return this.field_53767;
    }

    public String method_15434() {
        return this.field_53768;
    }

    static {
        field_8948 = class06509.L();
        field_53766 = class02121.N(class06509::N, (Object[])class06509.values(), (class02126)class02126.field_41664);
        field_53764 = class05033.N(class06509::values);
        field_53765 = class02389.N(field_53766, class06509::N);
    }
}

