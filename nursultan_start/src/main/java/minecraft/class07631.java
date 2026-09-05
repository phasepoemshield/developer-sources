/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00500
 *  minecraft.class00869
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
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class07631
extends Enum<class07631>
implements class05033 {
    public static final /* enum */ class07631 field_18109 = new class07631("red", 0, class00869.LT.W());
    public static final /* enum */ class07631 field_18110 = new class07631("brown", 1, class00869.Ls.W());
    public static final class07631 field_57612;
    public static final Codec<class07631> field_41549;
    private static final IntFunction<class07631> field_55963;
    public static final class02362<ByteBuf, class07631> field_55962;
    private final String field_18111;
    final int field_55964;
    private final class00500 field_18112;
    private static final /* synthetic */ class07631[] field_18113;

    private static /* synthetic */ class07631[] L() {
        return new class07631[]{field_18109, field_18110};
    }

    private class07631(String string2, int n2, class00500 class005002) {
        this.field_18111 = string2;
        this.field_55964 = n2;
        this.field_18112 = class005002;
    }

    public static class07631[] values() {
        return (class07631[])field_18113.clone();
    }

    public static class07631 valueOf(String string) {
        return Enum.valueOf(class07631.class, string);
    }

    private int y() {
        return this.field_55964;
    }

    static class07631 N(int n) {
        return field_55963.apply(n);
    }

    public class00500 N() {
        return this.field_18112;
    }

    public String method_15434() {
        return this.field_18111;
    }

    static {
        field_18113 = class07631.L();
        field_57612 = field_18109;
        field_41549 = class05033.N(class07631::values);
        field_55963 = class02121.N(class07631::y, (Object[])class07631.values(), (class02126)class02126.field_41666);
        field_55962 = class02389.N(field_55963, class07631::y);
    }
}

