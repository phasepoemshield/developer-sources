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

public final class class08155
extends Enum<class08155>
implements class05033 {
    public static final /* enum */ class08155 field_63398 = new class08155(0, "none");
    public static final /* enum */ class08155 field_63399 = new class08155(1, "whack");
    public static final /* enum */ class08155 field_63400 = new class08155(2, "stab");
    private static final IntFunction<class08155> field_63403;
    public static final Codec<class08155> field_63401;
    public static final class02362<ByteBuf, class08155> field_63402;
    private final int field_63404;
    private final String field_63405;
    private static final /* synthetic */ class08155[] field_63406;

    private class08155(int n2, String string2) {
        this.field_63404 = n2;
        this.field_63405 = string2;
    }

    public static class08155[] values() {
        return (class08155[])field_63406.clone();
    }

    public static class08155 valueOf(String string) {
        return Enum.valueOf(class08155.class, string);
    }

    private static /* synthetic */ class08155[] y() {
        return new class08155[]{field_63398, field_63399, field_63400};
    }

    public int N() {
        return this.field_63404;
    }

    public String method_15434() {
        return this.field_63405;
    }

    static {
        field_63406 = class08155.y();
        field_63403 = class02121.N(class08155::N, (Object[])class08155.values(), (class02126)class02126.field_41664);
        field_63401 = class05033.N(class08155::values);
        field_63402 = class02389.N(field_63403, class08155::N);
    }
}

