/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;

public final class class02705
extends Enum<class02705> {
    public static final /* enum */ class02705 field_49353 = new class02705(0);
    public static final /* enum */ class02705 field_49354 = new class02705(1);
    public static final IntFunction<class02705> field_49355;
    public static final class02362<ByteBuf, class02705> field_49356;
    private final int field_49357;
    private static final /* synthetic */ class02705[] field_49358;

    private class02705(int n2) {
        this.field_49357 = n2;
    }

    public static class02705[] values() {
        return (class02705[])field_49358.clone();
    }

    public static class02705 valueOf(String string) {
        return Enum.valueOf(class02705.class, string);
    }

    private static /* synthetic */ class02705[] y() {
        return new class02705[]{field_49353, field_49354};
    }

    public int N() {
        return this.field_49357;
    }

    static {
        field_49358 = class02705.y();
        field_49355 = class02121.N(class02705::N, (Object[])class02705.values(), (class02126)class02126.field_41664);
        field_49356 = class02389.N(field_49355, class02705::N);
    }
}

