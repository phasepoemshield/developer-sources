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

public final class class01972
extends Enum<class01972> {
    public static final /* enum */ class01972 field_42665 = new class01972(0);
    public static final /* enum */ class01972 field_42666 = new class01972(1);
    public static final /* enum */ class01972 field_42667 = new class01972(2);
    public static final /* enum */ class01972 field_42668 = new class01972(3);
    public static final /* enum */ class01972 field_42669 = new class01972(4);
    public static final /* enum */ class01972 field_42670 = new class01972(5);
    public static final /* enum */ class01972 field_42671 = new class01972(6);
    public static final IntFunction<class01972> field_48340;
    public static final class02362<ByteBuf, class01972> field_48341;
    private final int field_48342;
    private static final /* synthetic */ class01972[] field_42672;

    private class01972(int n2) {
        this.field_48342 = n2;
    }

    public static class01972[] values() {
        return (class01972[])field_42672.clone();
    }

    public static class01972 valueOf(String string) {
        return Enum.valueOf(class01972.class, string);
    }

    private static /* synthetic */ class01972[] y() {
        return new class01972[]{field_42665, field_42666, field_42667, field_42668, field_42669, field_42670, field_42671};
    }

    public int N() {
        return this.field_48342;
    }

    static {
        field_42672 = class01972.y();
        field_48340 = class02121.N(class01972::N, (Object[])class01972.values(), (class02126)class02126.field_41664);
        field_48341 = class02389.N(field_48340, class01972::N);
    }
}

