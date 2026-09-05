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

public final class class07510
extends Enum<class07510> {
    public static final /* enum */ class07510 field_7790 = new class07510(0);
    public static final /* enum */ class07510 field_7794 = new class07510(1);
    public static final /* enum */ class07510 field_7791 = new class07510(2);
    public static final /* enum */ class07510 field_7796 = new class07510(3);
    public static final /* enum */ class07510 field_7795 = new class07510(4);
    public static final /* enum */ class07510 field_7789 = new class07510(5);
    public static final /* enum */ class07510 field_7793 = new class07510(6);
    private static final IntFunction<class07510> field_58135;
    public static final class02362<ByteBuf, class07510> field_58134;
    private final int field_58136;
    private static final /* synthetic */ class07510[] field_7792;

    private class07510(int n2) {
        this.field_58136 = n2;
    }

    static {
        field_7792 = class07510.y();
        field_58135 = class02121.N(class07510::N, (Object[])class07510.values(), (class02126)class02126.field_41664);
        field_58134 = class02389.N(field_58135, class07510::N);
    }

    public static class07510[] values() {
        return (class07510[])field_7792.clone();
    }

    public static class07510 valueOf(String string) {
        return Enum.valueOf(class07510.class, string);
    }

    private static /* synthetic */ class07510[] y() {
        return new class07510[]{field_7790, field_7794, field_7791, field_7796, field_7795, field_7789, field_7793};
    }

    public int N() {
        return this.field_58136;
    }
}

