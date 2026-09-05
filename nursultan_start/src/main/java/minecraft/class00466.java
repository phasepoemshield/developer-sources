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

public final class class00466
extends Enum<class00466> {
    public static final /* enum */ class00466 field_62847 = new class00466(0, 0x6000FF00);
    public static final /* enum */ class00466 field_62848 = new class00466(1, 0x600000FF);
    public static final /* enum */ class00466 field_62849 = new class00466(2, 0x60333333);
    private static final IntFunction<class00466> field_62851;
    public static final class02362<ByteBuf, class00466> field_62850;
    private final int field_62852;
    private final int field_62853;
    private static final /* synthetic */ class00466[] field_62854;

    private class00466(int n2, int n3) {
        this.field_62852 = n2;
        this.field_62853 = n3;
    }

    public static class00466[] values() {
        return (class00466[])field_62854.clone();
    }

    public static class00466 valueOf(String string) {
        return Enum.valueOf(class00466.class, string);
    }

    private static /* synthetic */ class00466[] y() {
        return new class00466[]{field_62847, field_62848, field_62849};
    }

    private static /* synthetic */ int N(class00466 class004662) {
        return class004662.field_62852;
    }

    public int N() {
        return this.field_62853;
    }

    static {
        field_62854 = class00466.y();
        field_62851 = class02121.N(class004662 -> class004662.field_62852, (Object[])class00466.values(), (class02126)class02126.field_41664);
        field_62850 = class02389.N(field_62851, class004662 -> class004662.field_62852);
    }
}

