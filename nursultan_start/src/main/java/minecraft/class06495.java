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
 *  minecraft.class06541
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
import minecraft.class06541;

public final class class06495
extends Enum<class06495>
implements class05033 {
    public static final /* enum */ class06495 field_8906 = new class06495(0, "common", class06541.field_1068);
    public static final /* enum */ class06495 field_8907 = new class06495(1, "uncommon", class06541.field_1054);
    public static final /* enum */ class06495 field_8903 = new class06495(2, "rare", class06541.field_1075);
    public static final /* enum */ class06495 field_8904 = new class06495(3, "epic", class06541.field_1076);
    public static final Codec<class06495> field_50001;
    public static final IntFunction<class06495> field_50002;
    public static final class02362<ByteBuf, class06495> field_50003;
    private final int field_50004;
    private final String field_50005;
    private final class06541 field_8908;
    private static final /* synthetic */ class06495[] field_8905;

    private class06495(int n2, String string2, class06541 class065412) {
        this.field_50004 = n2;
        this.field_50005 = string2;
        this.field_8908 = class065412;
    }

    public static class06495[] values() {
        return (class06495[])field_8905.clone();
    }

    public static class06495 valueOf(String string) {
        return Enum.valueOf(class06495.class, string);
    }

    private static /* synthetic */ class06495[] y() {
        return new class06495[]{field_8906, field_8907, field_8903, field_8904};
    }

    public class06541 N() {
        return this.field_8908;
    }

    private static /* synthetic */ int N(class06495 class064952) {
        return class064952.field_50004;
    }

    public String method_15434() {
        return this.field_50005;
    }

    static {
        field_8905 = class06495.y();
        field_50001 = class05033.y(class06495::values);
        field_50002 = class02121.N(class064952 -> class064952.field_50004, (Object[])class06495.values(), (class02126)class02126.field_41664);
        field_50003 = class02389.N(field_50002, class064952 -> class064952.field_50004);
    }
}

