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

public final class class07861
extends Enum<class07861>
implements class05033 {
    public static final /* enum */ class07861 field_52470 = new class07861("small", 0, 0.5f);
    public static final /* enum */ class07861 field_52471 = new class07861("medium", 1, 1.0f);
    public static final /* enum */ class07861 field_52472 = new class07861("large", 2, 1.5f);
    public static final class07861 field_57618;
    public static final class05031<class07861> field_52473;
    static final IntFunction<class07861> field_55008;
    public static final class02362<ByteBuf, class07861> field_55967;
    private final String field_52474;
    final int field_55009;
    final float field_53975;
    private static final /* synthetic */ class07861[] field_52475;

    private class07861(String string2, int n2, float f) {
        this.field_52474 = string2;
        this.field_55009 = n2;
        this.field_53975 = f;
    }

    public static class07861[] values() {
        return (class07861[])field_52475.clone();
    }

    public static class07861 valueOf(String string) {
        return Enum.valueOf(class07861.class, string);
    }

    private static /* synthetic */ class07861[] y() {
        return new class07861[]{field_52470, field_52471, field_52472};
    }

    int N() {
        return this.field_55009;
    }

    public String method_15434() {
        return this.field_52474;
    }

    static {
        field_52475 = class07861.y();
        field_57618 = field_52471;
        field_52473 = class05033.N(class07861::values);
        field_55008 = class02121.N(class07861::N, (Object[])class07861.values(), (class02126)class02126.field_41666);
        field_55967 = class02389.N(field_55008, class07861::N);
    }
}

