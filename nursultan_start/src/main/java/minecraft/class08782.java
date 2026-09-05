/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05031;
import minecraft.class05033;

public final class class08782
extends Enum<class08782>
implements class05033 {
    public static final /* enum */ class08782 field_60962 = new class08782(0, "close");
    public static final /* enum */ class08782 field_60963 = new class08782(1, "none");
    public static final /* enum */ class08782 field_60964 = new class08782(2, "wait_for_response");
    public static final IntFunction<class08782> field_60965;
    public static final class05031<class08782> field_60966;
    public static final class02362<ByteBuf, class08782> field_60967;
    private final int field_60968;
    private final String field_60969;
    private static final /* synthetic */ class08782[] field_60970;

    private class08782(int n2, String string2) {
        this.field_60968 = n2;
        this.field_60969 = string2;
    }

    public static class08782[] values() {
        return (class08782[])field_60970.clone();
    }

    public static class08782 valueOf(String string) {
        return Enum.valueOf(class08782.class, string);
    }

    private static /* synthetic */ class08782[] y() {
        return new class08782[]{field_60962, field_60963, field_60964};
    }

    public boolean N() {
        return this == field_60962 || this == field_60964;
    }

    private static /* synthetic */ int N(class08782 class087822) {
        return class087822.field_60968;
    }

    public String method_15434() {
        return this.field_60969;
    }

    static {
        field_60970 = class08782.y();
        field_60965 = class02121.N(class087822 -> class087822.field_60968, (Object[])class08782.values(), (class02126)class02126.field_41664);
        field_60966 = class05033.N(class08782::values);
        field_60967 = class02389.N(field_60965, class087822 -> class087822.field_60968);
    }
}

