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

public final class class08616
extends Enum<class08616> {
    public static final /* enum */ class08616 field_55920 = new class08616(0);
    public static final /* enum */ class08616 field_55921 = new class08616(1);
    public static final /* enum */ class08616 field_55922 = new class08616(2);
    public static final /* enum */ class08616 field_55923 = new class08616(3);
    public static final /* enum */ class08616 field_55924 = new class08616(4);
    public static final /* enum */ class08616 field_55925 = new class08616(5);
    public static final /* enum */ class08616 field_55926 = new class08616(6);
    private static final IntFunction<class08616> field_55928;
    public static final class02362<ByteBuf, class08616> field_55927;
    private final int field_55929;
    private static final /* synthetic */ class08616[] field_55930;

    private class08616(int n2) {
        this.field_55929 = n2;
    }

    static {
        field_55930 = class08616.N();
        field_55928 = class02121.N(class086162 -> class086162.field_55929, (Object[])class08616.values(), (class02126)class02126.field_41664);
        field_55927 = class02389.N(field_55928, class086162 -> class086162.field_55929);
    }

    public static class08616[] values() {
        return (class08616[])field_55930.clone();
    }

    public static class08616 valueOf(String string) {
        return Enum.valueOf(class08616.class, string);
    }

    private static /* synthetic */ class08616[] N() {
        return new class08616[]{field_55920, field_55921, field_55922, field_55923, field_55924, field_55925, field_55926};
    }
}

